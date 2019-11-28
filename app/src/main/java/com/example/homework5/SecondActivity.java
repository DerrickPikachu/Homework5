package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.homework5.MainActivity.CALL_ACTIVITY;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txv;
    private String record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.intentBtn).setOnClickListener(this);
        findViewById(R.id.goBackBtn).setOnClickListener(this);

        txv = findViewById(R.id.visitedRecord);

        Intent father = getIntent();
        record = father.getStringExtra("record");
        record = record + "->2";
        txv.setText(record);
    }

    @Override
    public void onClick(View v) {
        Intent toActivity = new Intent();

        if (v.getId() == R.id.goBackBtn) {
            toActivity.putExtra("record", record);
            setResult(RESULT_OK, toActivity);
            finish();
        }
        else if (v.getId() == R.id.intentBtn) {
            toActivity.setClass(this, ThirdActivity.class);
            toActivity.putExtra("record", record);
            startActivityForResult(toActivity, CALL_ACTIVITY);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CALL_ACTIVITY) {
            record = data.getStringExtra("record") + "->2";
            txv.setText(record);
        }
    }
}
