package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Disney extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Let it go", "Idina Menzel"));
        songs.add(new Song("Hakuna Matata", "Nathan Lane, Ernie Sabella, Jason Weaver"));
        songs.add(new Song("I see the light", "Mandy Moore, Zachary Levi"));

        SongAdapter adapters = new SongAdapter(this, songs);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.list_and_button);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapters);

        Button returnToMain = (Button) findViewById(R.id.return_main_class);
        Button badanamu = (Button)  findViewById(R.id.change_class);
        Button play = (Button) findViewById(R.id.return_other_class);
        onClick(returnToMain);
        onClick(badanamu);
        onClick(play);
    }

    @Override
    public void onClick(View v) {

        Button button = (Button) v;
        String name = button.getText().toString();

        if (name.equalsIgnoreCase("main")) {
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent vIntent = new Intent(Disney.this, MainActivity.class);
                    startActivity(vIntent);
                }
            });
        }
        else if (name.equalsIgnoreCase("listen")) {
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent vIntent = new Intent(Disney.this, Play.class);
                    startActivity(vIntent);
                }
            });
        }
        else if (name.equalsIgnoreCase("Change this kind of songs")) {
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent vIntent = new Intent(Disney.this, Badanamu.class);
                    startActivity(vIntent);
                }
            });
        }
    }
}
