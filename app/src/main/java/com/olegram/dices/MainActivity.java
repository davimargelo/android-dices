package com.olegram.dices;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Boolean clicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view) {
        TextView textontop = findViewById(R.id.textontop);
        Button clickherebutton = findViewById(R.id.clickherebutton);

        clicked = !clicked;
        if (clicked) {
            rollDice(false);
            textontop.setText(R.string.success_rolled_label);
            clickherebutton.setText(R.string.retry_button);
        } else {
            rollDice(true);
            textontop.setText(R.string.sugestion_dice_label);
            clickherebutton.setText(R.string.roll_button);
        }
    }

    public void rollDice(boolean clear) {
        TextView diceResult = findViewById(R.id.diceResult);
        if(!clear) {
            Random rand = new Random();
            int upperbound = 6;
            int generatedInt = rand.nextInt(upperbound) + 1;
            diceResult.setText(String.valueOf(generatedInt));
        } else
            diceResult.setText("");
    }
}