package com.example.compiledact;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Activity7 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity7); // Set the layout to activity7.xml

        // Find the Button by its ID
        Button bluetoothRangeButton = findViewById(R.id.bluetooth_range_button);

        // Set an OnClickListener on the Button
        bluetoothRangeButton.setOnClickListener(v -> {
            // Create an intent to open the YouTube link
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=BO_1shpMM9s"));
            startActivity(intent); // Start the activity to open the link
        });
    }
}
