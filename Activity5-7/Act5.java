package com.example.compiledact;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Activity5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5); // Make sure activity5.xml is set up

        // Find the Button by its ID
        Button youtubeButton = findViewById(R.id.youtube_button);

        // Set an OnClickListener on the Button
        youtubeButton.setOnClickListener(v -> {
            // Create an intent to open the YouTube link
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=vw6hBJ-24GM"));
            startActivity(intent); // Start the activity to open the link
        });
    }
}
