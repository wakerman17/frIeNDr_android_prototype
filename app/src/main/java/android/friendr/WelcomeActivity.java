package com.example.friendr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btn1 = (Button)findViewById(R.id.signUpID);
        btn2 = (Button)findViewById(R.id.WCloginBtnID);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent regIntent = new Intent(WelcomeActivity.this, RegisterActivity.class);
                startActivity(regIntent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent loginIntent = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}
