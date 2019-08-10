package com.example.vibhor.customintentdemoapp;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addOnClickListener();
    }

    public void addOnClickListener(){

        button= (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Toast toast=new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                LayoutInflater layoutInflater=getLayoutInflater();
                View view=layoutInflater.inflate(R.layout.toast_layout,
                        (ViewGroup) findViewById(R.id.root));
                toast.setView(view);
                toast.show();



            }
        });

    }
}
