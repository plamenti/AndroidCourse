package com.plamenti.dicee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.rollbutton);
        ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);
    }
}
