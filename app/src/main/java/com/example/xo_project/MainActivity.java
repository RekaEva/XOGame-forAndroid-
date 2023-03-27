package com.example.xo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageGame01, imageGame02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageGame01 = findViewById(R.id.icon_game_01);
        imageGame02 = findViewById(R.id.icon_game_02);
    }

    public void startGame_01(View view)
    {
        Intent intent = new Intent(MainActivity.this, KrestikiNoliki.class);
        startActivity(intent);
        finish();
    }

}

