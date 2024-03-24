package yana.geo.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textMsgToReceive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textMsgToReceive = findViewById(R.id.TextMessageToReceive);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textMsgToReceive.setText(msg);
    }
}