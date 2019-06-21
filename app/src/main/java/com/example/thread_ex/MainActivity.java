package com.example.thread_ex;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView count_no;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count_no = findViewById(R.id.count_number);

        handler = new Handler();
        handler.postDelayed(runnable, 500);


    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            data();
        }
    };

    private void data() {
        int no = (Integer.parseInt(count_no.getText().toString()) - 1);
        count_no.setText("" + no);

        if (no == 0) {
            startActivity(new Intent(MainActivity.this, Next_Act.class));
        } else {
            handler.postDelayed(runnable, 1000);
        }
    }
}

