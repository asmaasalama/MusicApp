package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button badanamu = (Button) findViewById(R.id.badanamu_button);
        Button disney = (Button) findViewById(R.id.disney_button);
        Button play = (Button) findViewById(R.id.go_to_last_play);

        onClick(badanamu);
        onClick(disney);
        onClick(play);
    }

    @Override
    public void onClick(View v) {

        Button button = (Button) v;
        String name = button.getText().toString();

        if (name.equalsIgnoreCase("See Badanamu songs :)")) {
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent vIntent = new Intent(MainActivity.this, Badanamu.class);
                    startActivity(vIntent);
                }
            });
        }

        else if (name.equalsIgnoreCase("See Disney songs :)")) {
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent vIntent = new Intent(MainActivity.this, Disney.class);
                    startActivity(vIntent);
                }
            });
        }

        else if (name.equalsIgnoreCase("Continue your last song")) {
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent vIntent = new Intent(MainActivity.this, Play.class);
                    startActivity(vIntent);
                }
            });
        }
    }
}
