package com.android.ahmedraza.laughcounter;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.android.ahmedraza.laughcounter.data.NoteItem;
import com.android.ahmedraza.laughcounter.data.NotesDataSource;

import java.util.List;

/**
 * Created by ahmedraza on 06/05/16.
 */
public class NoteList extends ListActivity {

    private NotesDataSource dataSource;
    List<NoteItem> notesList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note_list_layout);

        dataSource = new NotesDataSource(this);


        refreshDisplay();

    }

    private void refreshDisplay() {

        notesList = dataSource.findAll();
        ArrayAdapter<NoteItem> adapter =
                new ArrayAdapter<NoteItem>(this, android.R.layout.simple_expandable_list_item_1, notesList);

        setListAdapter(adapter);
    }


}
