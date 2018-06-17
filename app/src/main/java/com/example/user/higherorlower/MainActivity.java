package com.example.user.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int n;

    public void restart(View view) {
        Toast.makeText(MainActivity.this, "Let's Go Again", Toast.LENGTH_SHORT).show();
        Random rand = new Random();
        n = rand.nextInt(30) + 1;

        TextView myTextView = (TextView) findViewById(R.id.num);
        myTextView.setText(null);
    }
    public void toast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view) {
        EditText num = (EditText) findViewById(R.id.num);
        int unum = Integer.parseInt(num.getText().toString());

        if(unum > n) toast("Go lower");
        else if(unum < n) toast("Go higher");
        else toast("You got it right!");
     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        n = rand.nextInt(30) + 1;
    }
}
