package com.example.prototypeb.ui.game.Game_components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.example.prototypeb.R;

public class Game_pronoun extends AppCompatActivity implements Game_components{
    private Context pronoun_context;
    public Game_pronoun(){}
    public Game_pronoun(Context context){
        pronoun_context = context;
    }
    public View.OnClickListener get_unlocked_On_click(){

        return on_unlocked_click;
    }

    public View.OnClickListener get_locked_On_click(){
        return locked_On_click;
    }
    private View.OnClickListener on_unlocked_click= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), Game_pronoun.class);
            pronoun_context.startActivity(intent);


        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_pronoun);
    }
}
