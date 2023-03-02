package com.example.custom_alertdilog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dialog dialog=new Dialog(MainActivity.this);
        dialog.setCancelable(false);// in this if we touch the screen outside thhe dialog box  it cannot be close...
        dialog.setContentView(R.layout.custom_dialog_layout);// in this we can call the  our custom layoutt...
        Button btu=dialog.findViewById(R.id.btn);
        btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "yes its a open", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}