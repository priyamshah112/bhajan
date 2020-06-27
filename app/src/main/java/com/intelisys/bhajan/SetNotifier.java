package com.intelisys.bhajan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SetNotifier extends AppCompatActivity {
    private Button btnSubmit;
    private Button mgnSubmit;

    private Button aftSubmit;
    private Button eveSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_notifier);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(SetNotifier.this,SwitchTab.class);
                startActivity(myIntent);
                //myIntent.putExtra("language", String.valueOf(spinner1.getSelectedItem()));
            }

        });
        mgnSubmit = (Button) findViewById(R.id.imageButton3);

        mgnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(SetNotifier.this,SetTimer.class);
                startActivity(myIntent);
                //myIntent.putExtra("language", String.valueOf(spinner1.getSelectedItem()));
            }

        });
        aftSubmit = (Button) findViewById(R.id.imageButton2);

        aftSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(SetNotifier.this,SetTimer.class);
                startActivity(myIntent);
                //myIntent.putExtra("language", String.valueOf(spinner1.getSelectedItem()));
            }

        });
        eveSubmit = (Button) findViewById(R.id.imageButton);

        eveSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(SetNotifier.this,SetTimer.class);
                startActivity(myIntent);
                //myIntent.putExtra("language", String.valueOf(spinner1.getSelectedItem()));
            }

        });
    }
}
