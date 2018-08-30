package com.example.personal.loginfirebaseg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class AccountActivity extends AppCompatActivity {

    Button logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        logOutButton = (Button) findViewById(R.id.btnSignOut);
        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                FirebaseAuth.getInstance().signOut();

                Intent intent = new Intent(AccountActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
