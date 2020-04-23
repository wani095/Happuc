package com.al.happuc.UI.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.al.happuc.R;

public class MainActivity extends AppCompatActivity {

    private  LinearLayout institution;
    private LinearLayout bibliotheque;
    private LinearLayout cours;
    private LinearLayout forum;
    private LinearLayout opportunite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout institution = (LinearLayout)findViewById(R.id.institution);
        LinearLayout bibliotheque =(LinearLayout)findViewById(R.id.bibliotheque);
        LinearLayout cours =(LinearLayout)findViewById(R.id.cours);
        LinearLayout forum =(LinearLayout)findViewById(R.id.forum);
        LinearLayout opportunite = (LinearLayout)findViewById(R.id.opportunite);

        institution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Instutition.class));
            }
        });

        bibliotheque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Bibliotheque.class));
            }
        });

        cours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Cours.class));
            }
        });

        forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Forum.class));
            }
        });

        opportunite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Opportunite.class));
            }
        });
    }
}
