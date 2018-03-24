package com.example.s416201.zaj1dwa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // POTEM TO TRZEBA USUNAC I WYWALIC Z KONSTRUKTORA ARGUMENTY
        String x = "test";
        String y = "Tekst testowy";

        final ProtectedMessage mess = new ProtectedMessage(x,y);

        Button button4 = (Button) findViewById(R.id.button4);

        button4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                EditText passwd = (EditText) findViewById(R.id.passwd);
                if (passwd.getText().toString() == mess.GetPass()) {
                    TextView message = (TextView) findViewById(R.id.message);
                    message.setVisibility(View.VISIBLE);
                }
            }

        });
    }


}
