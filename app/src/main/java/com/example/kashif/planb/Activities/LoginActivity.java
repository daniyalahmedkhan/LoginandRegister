package com.example.kashif.planb.Activities;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kashif.planb.R;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {


    Button ButtonSignin;

    TextView Signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButtonSignin = (Button) findViewById(R.id.ButtonSignin);
        Signup = (TextView) findViewById(R.id.Signup);


        ButtonSignin.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(final View view, MotionEvent motionEvent) {


                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        view.getBackground().setColorFilter(0xFF1FB9EA,PorterDuff.Mode.SRC_ATOP);
                        view.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                view.getBackground().clearColorFilter();
                                view.invalidate();

                            }
                        }, 100);
                        break;
                    }
                }
                return false;
            }
        });


        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent = new Intent(LoginActivity.this , RegisterActivity.class);
                startActivity(intent);

            }
        });


        ButtonSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this , HomeActivity.class);
                startActivity(intent);

            }
        });


    }
}
