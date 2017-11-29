package com.example.android.courtcounterfootball2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.courtcounterfootball2.R;


public class MainActivity extends AppCompatActivity {

    int scoreA;
    int scoreB;
    int foulA;
    int foulB;
    int yellowCardA;
    int yellowCardB;
    int redCardA;
    int redCardB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalA(View view) {
        scoreA++;
        displayScoreA(scoreA);
    }

    public void foulA(View view) {
        foulA++;
        displayFoulA(foulA);
    }

    public void yellowCardA(View view) {
        yellowCardA++;
        displayYellowCardA(yellowCardA);
    }

    public void redCardA(View view) {
        redCardA++;
        displayRedCardA(redCardA);
    }

    public void goalB(View view) {
        scoreB++;
        displayScoreB(scoreB);
    }

    public void foulB(View view) {
        foulB++;
        displayFoulB(foulB);
    }

    public void yellowCardB(View view) {
        yellowCardB++;
        displayYellowCardB(yellowCardB);
    }

    public void redCardB(View view) {
        redCardB++;
        displayRedCardB(redCardB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        foulA = 0;
        foulB = 0;
        yellowCardA = 0;
        yellowCardB = 0;
        redCardA = 0;
        redCardB = 0;

        resetAll(scoreA, scoreB, foulA, foulB, yellowCardA, yellowCardB, redCardA, redCardB);
    }

    public void resetAll(int scoreA, int scoreB, int foulA, int foulB, int yellowCardA, int yellowCardB, int redCardA, int redCardB) {
        TextView changeScoreA = (TextView) findViewById(R.id.scoreA);
        TextView changeScoreB = (TextView) findViewById(R.id.scoreB);
        TextView changeFoulsA = (TextView) findViewById(R.id.finalFoulsA);
        TextView changeFoulsB = (TextView) findViewById(R.id.finalFoulsB);
        TextView changeYellowCardA = (TextView) findViewById(R.id.finalYellowCardsA);
        TextView changeYellowCardB = (TextView) findViewById(R.id.finalYellowCardsB);
        TextView changeRedCardA = (TextView) findViewById(R.id.finalRedCardsA);
        TextView changeRedCardB = (TextView) findViewById(R.id.finalRedCardsB);
        changeScoreA.setText(String.valueOf(scoreA));
        changeScoreB.setText(String.valueOf(scoreB));
        changeFoulsA.setText("Fouls: " + foulA);
        changeFoulsB.setText("Fouls: " + foulB);
        changeYellowCardA.setText("Yellow cards: " + yellowCardA);
        changeYellowCardB.setText("Yellow cards: " + yellowCardB);
        changeRedCardA.setText("Red cards: " + redCardA);
        changeRedCardB.setText("Red cards: " + redCardB);
    }

    public void displayScoreA(int score) {
        TextView changeScore = (TextView) findViewById(R.id.scoreA);
        changeScore.setText(String.valueOf(score));
    }

    public void displayFoulA(int foul) {
        TextView changeFoul = (TextView) findViewById(R.id.finalFoulsA);
        changeFoul.setText("Fouls: " + foul);
    }

    public void displayYellowCardA(int yellowCard) {
        TextView changeFoul = (TextView) findViewById(R.id.finalYellowCardsA);
        changeFoul.setText("Yellow cards: " + yellowCard);
    }

    public void displayRedCardA(int redCard) {
        TextView changeFoul = (TextView) findViewById(R.id.finalRedCardsA);
        changeFoul.setText("Red cards: " + redCard);
    }

    public void displayScoreB(int score) {
        TextView changeScore = (TextView) findViewById(R.id.scoreB);
        changeScore.setText(String.valueOf(score));
    }

    public void displayFoulB(int foul) {
        TextView changeFoul = (TextView) findViewById(R.id.finalFoulsB);
        changeFoul.setText("Fouls: " + foul);
    }

    public void displayYellowCardB(int yellowCard) {
        TextView changeFoul = (TextView) findViewById(R.id.finalYellowCardsB);
        changeFoul.setText("Yellow cards: " + yellowCard);
    }

    public void displayRedCardB(int redCard) {
        TextView changeFoul = (TextView) findViewById(R.id.finalRedCardsB);
        changeFoul.setText("Red cards: " + redCard);
    }

}

