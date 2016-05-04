package com.android.ahmedraza.laughcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.dec);
        button.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
               if (x > 0){
                   x = x--;
               }
            String newXvalue = Integer.toString(x);

                TextView err = (TextView)findViewById(R.id.quantity_text_view);
                err.setText("Hello");
            }
        });


        final Button button2 = (Button) findViewById(R.id.inc);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (x <= 0){
                    x = x++;
                }
                String newXvalue2 = Integer.toString(x);

                TextView err = (TextView)findViewById(R.id.quantity_text_view);
                err.setText("Hello");
            }
        });
    }




}
