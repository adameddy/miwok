package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Get text views
        TextView numbersView = (TextView) findViewById(R.id.numbers);
        TextView familyView = (TextView) findViewById(R.id.family);
        TextView colorsView = (TextView) findViewById(R.id.colors);
        TextView phrasesView = (TextView) findViewById(R.id.phrases);

        // Numbers view on click listener
        numbersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NumbersActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        // Family view on click listener
        familyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FamilyActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        // Colors view on click listener
        colorsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ColorsActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        // Phrase view on click listener
        phrasesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
                MainActivity.this.startActivity(i);
            }
        });
    }
}
