package com.android.ahmedraza.laughcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int valueOfEmotion = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //happy, very happy, extremely happy
    public void increment(View view){
        valueOfEmotion = valueOfEmotion + 1;
        if (valueOfEmotion == 0){
            String gFeeling = "Extremely Sad";
            displayEmotion(gFeeling);
        }
        else if (valueOfEmotion == 1){
            String gFeeling = "Very Sad";
            displayEmotion(gFeeling);
        }
        else if (valueOfEmotion == 2){
            String gFeeling = "Sad";
            displayEmotion(gFeeling);
        }

        else if (valueOfEmotion == 3){
            String gFeeling = "Normal";
            displayEmotion(gFeeling);
        }

        else if (valueOfEmotion == 4){
            String gFeeling = "Happy";
            displayEmotion(gFeeling);
        }

        else if (valueOfEmotion == 5){
            String gFeeling = "Very Happy";
            displayEmotion(gFeeling);
        }

        else if (valueOfEmotion == 6){
            String gFeeling = "Extremely Happy";
            displayEmotion(gFeeling);
        }
        else {
            valueOfEmotion = 3;
            String gFeeling = "Normal";
            displayEmotion(gFeeling);
        }

    }


    //sad, very sad, extremely sad
    public void decrement(View view){
        valueOfEmotion = valueOfEmotion - 1;
        if (valueOfEmotion == 0){
            String bFeeling = "Extremely Sad";
            displayEmotion(bFeeling);
        }
        else if (valueOfEmotion == 1){
            String bFeeling = "Very Sad";
            displayEmotion(bFeeling);
        }
        else if (valueOfEmotion == 2){
            String bFeeling = "Sad";
            displayEmotion(bFeeling);
        }

        else if (valueOfEmotion == 3){
            String bFeeling = "Normal";
            displayEmotion(bFeeling);
        }

        else if (valueOfEmotion == 4){
            String gFeeling = "Happy";
            displayEmotion(gFeeling);
        }

        else if (valueOfEmotion == 5){
            String bFeeling = "Very Happy";
            displayEmotion(bFeeling);
        }

        else if (valueOfEmotion == 6){
            String bFeeling = "Extremely Happy";
            displayEmotion(bFeeling);
        }
        else {
            valueOfEmotion = 3;
            String bFeeling = "Normal";
            displayEmotion(bFeeling);
        }


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
