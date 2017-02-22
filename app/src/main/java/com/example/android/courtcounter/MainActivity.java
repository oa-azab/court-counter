package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * Add 3 points to score for Team A.
     */
    public void add3PointTeamA(View view) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    /**
     * Add 2 points to score for Team A.
     */
    public void add2PointTeamA(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    /**
     * Add 1 points to score for Team A.
     */
    public void add1PointTeamA(View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
