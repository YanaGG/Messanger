package yana.geo.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText TextMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextMsg = findViewById(R.id.EnterTextMessage);
    }

    public void SendMsgOnClick(View view) {
        String msg = TextMsg.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("msg", msg);
        startActivity(intent);
    }
}