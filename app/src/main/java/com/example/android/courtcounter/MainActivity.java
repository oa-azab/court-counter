package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    final int SCORE_FOR_3_POINTS = 3;
    final int SCORE_FOR_2_POINTS = 2;
    final int SCORE_FOR_FREE_THROW_POINTS = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add 3 points to score for Team A.
     */
    public void add3PointTeamA(View view) {
        teamAScore = teamAScore + SCORE_FOR_3_POINTS;
        displayForTeamA(teamAScore);
    }

    /**
     * Add 2 points to score for Team A.
     */
    public void add2PointTeamA(View view) {
        teamAScore = teamAScore + SCORE_FOR_2_POINTS;
        displayForTeamA(teamAScore);
    }

    /**
     * Add 1 points to score for Team A.
     */
    public void add1PointTeamA(View view) {
        teamAScore = teamAScore + SCORE_FOR_FREE_THROW_POINTS;
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3 points to score for Team B.
     */
    public void add3PointTeamB(View view) {
        teamBScore = teamBScore + SCORE_FOR_3_POINTS;
        displayForTeamB(teamBScore);
    }

    /**
     * Add 2 points to score for Team B.
     */
    public void add2PointTeamB(View view) {
        teamBScore = teamBScore + SCORE_FOR_2_POINTS;
        displayForTeamB(teamBScore);
    }

    /**
     * Add 1 points to score for Team B.
     */
    public void add1PointTeamB(View view) {
        teamBScore = teamBScore + SCORE_FOR_FREE_THROW_POINTS;
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
