package com.example.hwhong.sendbroadcastradiotower;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.send);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //no params needed because braodcast range is broad
                //not limited to a class
                Intent intent = new Intent();
                //a keyword for this specfic broadfast
                intent.setAction("com.example.hwhong.sendbroadcastradiotower");
                intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                sendBroadcast(intent);
            }
        });
    }
}
