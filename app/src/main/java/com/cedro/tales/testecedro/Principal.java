package com.cedro.tales.testecedro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button btLogin = findViewById(R.id.btLogin);

        //Ações do botão
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tNome = findViewById(R.id.tNome);
                TextView tEmail = findViewById(R.id.tEmail);
                TextView tSenha = findViewById(R.id.tSenha);

                String nome = tNome.getText().toString();
                String email = tEmail.getText().toString();
                String senha = tSenha.getText().toString();

                Log.d("Tela Principal","tela principal");
                if(nome.equals("Tales")&&email.equals("test@test.com")&&senha.equals("123")){
                    alert("Login realizado com sucesso"); //Alert de verificação de usuario
                    setContentView(R.layout.activity_token); //Abrir o layout de gerar token
                    Intent intent = new Intent(Principal.this,
                            Token.class);
                    startActivity(intent);
                }else {
                    alert("Desculpe, não foi possivel fazer o login, gentilzar verificar os dados." +
                            " Caso seja novo aqui cadastre-se em nosso App. Obrigado");
                }
                Log.d("Tela Principal","Fora if");
            }
        });
    }

    private void alert (String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }
}
