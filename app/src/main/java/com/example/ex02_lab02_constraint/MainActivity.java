package com.example.ex02_lab02_constraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView Follower, Following;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.Follow);

        Follower = findViewById(R.id.FollowerNum);

        Following = findViewById(R.id.FollowingNum);

        int follower = new Random().nextInt(9991) + 100;

        int following = new Random().nextInt(9991) + 100;

        Follower.setText(String.valueOf(follower));

        Following.setText(String.valueOf(following));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.this.button.getText().toString().equals("FOLLOW")){

                    MainActivity.this.button.setText("UNFOLLOW");

                    int follower = Integer.parseInt(MainActivity.this.Follower.getText().toString()) + 1;

                    MainActivity.this.Follower.setText(String.valueOf(follower));
                }
                else if (MainActivity.this.button.getText().toString().equals("UNFOLLOW")){

                    MainActivity.this.button.setText("FOLLOW");

                    int follower = Integer.parseInt(MainActivity.this.Follower.getText().toString()) - 1;

                    MainActivity.this.Follower.setText(String.valueOf(follower));
                }
            }
        });
    }
}