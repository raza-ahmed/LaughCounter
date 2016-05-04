package com.android.ahmedraza.laughcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  final Button button = (Button) findViewById(R.id.dec);
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

        */
    }

    public void increment(View view){
        String gFeeling = "Good";
        displayEmotion(gFeeling);
    }

    public void decrement(View view){
        String bFeeling = "Bad";
        displayEmotion(bFeeling);
    }

    private void displayEmotion(String abc){
        TextView goodText = (TextView) findViewById(R.id.quantity_text_view);
        goodText.setText(abc);
    }




    public void submitOrder(View view){
        display(1);
    }
    private void display(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.price_text_view);
        quantityTextView.setText("" + number);
    }

}
