package com.example.compiledact;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Activity6 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity6); // Set the layout to activity6.xml

        // Find the Button by its ID
        Button bluetoothButton = findViewById(R.id.bluetooth_button);

        // Set an OnClickListener on the Button
        bluetoothButton.setOnClickListener(v -> {
            // Create an intent to open the YouTube link
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jzxZUJmOu3o&t=356s"));
            startActivity(intent); // Start the activity to open the link
        });
    }
}
