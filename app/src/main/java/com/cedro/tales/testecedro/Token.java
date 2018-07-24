package com.cedro.tales.testecedro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Token extends AppCompatActivity {

    TextView text1;
    Button btnToken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("Tela Token","Token");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_token);

        btnToken = findViewById(R.id.btnToken);
        text1 = findViewById(R.id.text1);
        Log.d("teste","aqui");



        btnToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(generateString(6));

            }
        });
    }

    private String generateString(int lenght){
        Log.d("generate","generate");
        char[] chars ="ABCDEFGHIJLKMNOPQRSTUVWXYZ0123456789".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < lenght; i++){
            char c = chars[random.nextInt(chars.length)];
        stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
