package com.ramirez.ramirezquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComputerScience extends AppCompatActivity {
    Button home;
    Button it;
    Button is;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_science);
        home = (Button) findViewById(R.id.home);
        it = (Button) findViewById(R.id.it);
        is = (Button) findViewById(R.id.is);

    }
    public void onClick(View v) {

        if (v.getId() == R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.it) {
            Intent intent = new Intent(this, InformationTechnology.class);
            startActivity(intent);
        } else if (v.getId() == R.id.is) {
            Intent intent = new Intent(this, InformationSystem.class);
            startActivity(intent);

        }
    }


}
