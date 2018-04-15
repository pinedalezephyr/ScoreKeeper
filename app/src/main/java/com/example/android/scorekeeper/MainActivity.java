package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     *  tracks team A score
     */

    int scoreTeamA = 0;
    /**
     *  tracks team b score
     */

    int scoreTeamB = 0;

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));

    }


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        displayForTeamA(0);

    }
/**
 * increase the score by 6
 *
 */

public void scoreTouchDown(View view) {

    scoreTeamA = scoreTeamA + 6;

    display(scoreTeamA);
}

    /**
     * increase the score for score by 3
     */
    public void scoreThree(View view) {

        scoreTeamA = scoreTeamA + 3;

        display(scoreTeamA);

    }

    /**
     * increase the score for score by 2
     */
    public void scoreTwo(View view) {

        scoreTeamA = scoreTeamA + 2;

        display(scoreTeamA);

    }

    /**
     * increase the score for score by 1
     */
    public void scoreOne(View view) {

        scoreTeamA = scoreTeamA + 1;

        display(scoreTeamA);
        ;

    }
    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for score A
     */
    public void display(int number) {

        TextView countViewer = (TextView) findViewById(R.id.team_a_score);

        countViewer.setText("" + number);

    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int scoreTeamB) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);

        scoreView.setText(String.valueOf(scoreTeamB));


    }
    /**
     * increase the score team b by 6
     *
     */

    public void scoreBTouchDown(View view) {

        scoreTeamB= scoreTeamB + 6;

        displayForTeamB(scoreTeamB);
    }
    /**
     * increase the score for score by 3
     */
    public void scoreBThree(View view) {

        scoreTeamB = scoreTeamB + 3;

        displayForTeamB(scoreTeamB);

    }

    /**
     * increase the score for score by 2
     */
    public void scoreBTwo(View view) {

        scoreTeamB = scoreTeamB + 2;

        displayForTeamB(scoreTeamB);

    }

    /**
     * increase the score for score by 1
     */
    public void scoreBOne(View view) {

        scoreTeamB = scoreTeamB + 1;

        displayForTeamB(scoreTeamB);
        ;

    }

    /**
     * Displays the given score for score B
     */
    public void displayTeamB(int number_b) {

        TextView countViewer = (TextView) findViewById(R.id.team_b_score);

        countViewer.setText("" + number_b);


    }
}
