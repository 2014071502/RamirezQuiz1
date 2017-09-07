package com.ramirez.ramirezquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformationSystem extends AppCompatActivity {
    Button home;
    Button cs;
    Button it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_science);
        home = (Button) findViewById(R.id.home);
        cs = (Button) findViewById(R.id.cs);
        it = (Button) findViewById(R.id.it);

    }
    public void onClick(View v) {

        if (v.getId() == R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.cs) {
            Intent intent = new Intent(this, ComputerScience.class);
            startActivity(intent);
        } else if (v.getId() == R.id.it) {
            Intent intent = new Intent(this, InformationTechnology.class);
            startActivity(intent);

        }
    }


}