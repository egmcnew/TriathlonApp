package com.example.triathlonreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double perCost = 725;
    int userTickets;
    double finalCost;
    String userLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText participants = (EditText)findViewById(R.id.numPart);
        final Spinner locations = (Spinner)findViewById(R.id.locGroup);
        Button cost = (Button)findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener(){
            final TextView result = ((TextView)findViewById(R.id.txtResult));
            @Override
            public void onClick(View v){
                userTickets = Integer.parseInt(participants.getText( ).toString( ));
                finalCost = perCost * userTickets;
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                userLoc = locations.getSelectedItem( ).toString( );
                result.setText(userLoc + " race team fee is " + currency.format(finalCost));

            }
        });
    }
}
