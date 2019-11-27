package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);

        findViewById(R.id.intentBtn).setOnClickListener(this);
        findViewById(R.id.goBackBtn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.goBackBtn) {
            finish();
        }
        else if (v.getId() == R.id.intentBtn) {
            Intent toActivity = new Intent();
            toActivity.setClass(this, MainActivity.class);
            startActivity(toActivity);
        }
    }
}
