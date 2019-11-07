package com.example.onoptionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {

    Button sendMessage;
    Button clear;

    EditText name;
    EditText email;
    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        sendMessage = (Button) findViewById(R.id.SendId);

        clear = (Button) findViewById(R.id.clearId);

        name = (EditText) findViewById(R.id.nameId);
        email = (EditText) findViewById(R.id.emailId);
        message = (EditText) findViewById(R.id.messageId);



        sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String Name = name.getText().toString();

                String Email = email.getText().toString();

                String Message = message.getText().toString();


                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"proashik012@gmail.com", "shafiqa2b@gmail.com"});

                intent.putExtra(Intent.EXTRA_SUBJECT, "Feed back From App");

                intent.putExtra(Intent.EXTRA_TEXT, "Name:"+Name+"\n"+"Email: "+ Email + "\n Message: "+ Message);


                startActivity(intent.createChooser(intent, "FeedbackWith"));

                if(){

                }


            }
        });



        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name.setText("");
                email.setText("");
                message.setText("");


            }
        });

    }
}
