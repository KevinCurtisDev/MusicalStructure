package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Find the home button view
        ImageButton home = (ImageButton) findViewById(R.id.playing);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(Songs.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        // Find the home button view
        ImageButton artists = (ImageButton) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(Songs.this, Artists.class);
                startActivity(artistsIntent);
            }
        });

        // Find the home button view
        ImageButton favourites = (ImageButton) findViewById(R.id.favourites);

        // Set a click listener on that View
        favourites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent favouritesIntent = new Intent(Songs.this, Favourites.class);
                startActivity(favouritesIntent);
            }
        });

        // Find the home button view
        ImageButton albums = (ImageButton) findViewById(R.id.albums);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(Songs.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        // Find the home button view
        ImageButton songs = (ImageButton) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(Songs.this, Songs.class);
                startActivity(songsIntent);
            }
        });
    }
}
