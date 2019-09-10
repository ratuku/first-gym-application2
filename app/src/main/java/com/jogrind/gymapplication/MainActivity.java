package com.jogrind.gymapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //variable
    private CardView cardInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //R is probably a class that keeps track of all id's
        cardInstance= (CardView) findViewById(R.id.card1);
        cardInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity2();
            }
        });
    }

    public void OpenActivity2()
    {
        Intent intent = new Intent(getBaseContext(), SecondActivity.class);
        System.out.println("OpenActivity2");
        String data="Dummy String to test parse of data";
        intent.putExtra("YOUR_DATA_KEY", data);
        startActivity(intent);
    }
}
