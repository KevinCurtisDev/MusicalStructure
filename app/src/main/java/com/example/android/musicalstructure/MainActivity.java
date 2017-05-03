package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Albums category
        TextView albums = (TextView) findViewById(R.id.albums);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(albumIntent);
            }
        });

        // Find the View that shows the Artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, Songs.class);
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView faves = (TextView) findViewById(R.id.favourites);

        // Set a click listener on that View
        faves.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favouritesIntent = new Intent(MainActivity.this, Favourites.class);
                startActivity(favouritesIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView playing = (TextView) findViewById(R.id.playing);

        // Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(playIntent);
            }
        });

    }
}
