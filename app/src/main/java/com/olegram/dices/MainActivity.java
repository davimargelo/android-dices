package com.olegram.dices;

import android.os.Bundle;
import android.view.View;
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
        clicked = !clicked;
        textontop.setText(clicked ? "Yey!" : "Click below!");
        rollDice();
    }

    public void rollDice() {
        TextView diceResult = findViewById(R.id.diceResult);
        Random rand = new Random();
        int upperbound = 6;
        int generatedInt = rand.nextInt(upperbound) + 1;
        diceResult.setText(String.valueOf(generatedInt));
    }
}