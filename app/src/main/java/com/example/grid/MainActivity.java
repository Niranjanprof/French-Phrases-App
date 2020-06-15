package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid =  findViewById(R.id.grid);

        final ArrayList<Player> playerArrayList = new ArrayList<>();
        playerArrayList.add(new Player("Please",R.raw.please));
        playerArrayList.add(new Player("Do you speak English?",R.raw.doyouspeakenglish));
        playerArrayList.add(new Player("Good Evening",R.raw.goodevening));
        playerArrayList.add(new Player("Hello",R.raw.hello));
        playerArrayList.add(new Player("How Are You?",R.raw.howareyou));
        playerArrayList.add(new Player("My Name is",R.raw.mynameis));
        playerArrayList.add(new Player("Welcome",R.raw.welcome));
        playerArrayList.add(new Player("I Live in...",R.raw.ilivein));


        PlayerAdapter adapter = new PlayerAdapter(this);
        adapter.setPlayerArrayList(playerArrayList);
        grid.setAdapter(adapter);

    }
}