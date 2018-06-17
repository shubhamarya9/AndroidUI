package com.example.ivanrichard.condoelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

//This will contain the code that allows users to access the applications
//services.
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Create and use a button to navigate to the next page
        Button sign_up = (Button)findViewById(R.id.sign_up);

        //use the button to open a new page
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,SignUp.class));
            }
        });
    }
}
