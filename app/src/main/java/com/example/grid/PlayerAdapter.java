package com.example.grid;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayerAdapter extends BaseAdapter {
    private ArrayList<Player> playerArrayList;
    private Context context;
    private MediaPlayer mediaPlayer;

    public PlayerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return playerArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item,parent,false);
            TextView textView = convertView.findViewById(R.id.textView);
            textView.setText(playerArrayList.get(position).getName());
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer = MediaPlayer.create(context, playerArrayList.get(position).getResource());
                    mediaPlayer.start();
                }
            });
        }
        return convertView;
    }

    public void setPlayerArrayList(ArrayList<Player> playerArrayList) {
        this.playerArrayList = playerArrayList;
    }
}
