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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private TextView message;
    final Credentials reader = new Credentials();
    final ProtectedMessage mess = new ProtectedMessage(reader.getFirst(),reader.getSecond());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        message = (TextView) findViewById(R.id.message);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        final String temp = mess.GetMess();

        button.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        message.setVisibility(View.INVISIBLE);

        button4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText passwd = (EditText) findViewById(R.id.passwd);
                Toast.makeText(getApplicationContext(),
                    temp, Toast.LENGTH_SHORT).show();
                //  "Button4 Clicked!", Toast.LENGTH_SHORT).show();

                if (passwd.getText().toString().equals(mess.GetPass())) {
                    message.setText(temp);
                    message.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);

                }


            }
        });
    }


}
