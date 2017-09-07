package com.ramirez.ramirezquiz1;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.ramirez.ramirezquiz1.R;

public class MainActivity extends AppCompatActivity {
    Button cs;
    Button it;
    Button is;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_science);
        cs = (Button) findViewById(R.id.cs);
        it = (Button) findViewById(R.id.it);
        is = (Button) findViewById(R.id.is);

    }
    public void onClick(View v) {

        if (v.getId() == R.id.cs) {
            Intent intent = new Intent(this, ComputerScience.class);
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