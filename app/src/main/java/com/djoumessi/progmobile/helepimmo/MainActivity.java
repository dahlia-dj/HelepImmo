package com.djoumessi.progmobile.helepimmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.djoumessi.progmobile.helepimmo.formulaire.Formulaire;
import com.djoumessi.progmobile.helepimmo.login.ui.Login;

public class MainActivity extends AppCompatActivity {
     private Button connexion , register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connexion = findViewById(R.id.connexion);
        register = findViewById(R.id.register);

        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent connex = new Intent(MainActivity.this, Login.class);
                startActivity(connex);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(MainActivity.this, Formulaire.class);
                startActivity(register);
            }
        });
    }
}