package br.com.sossenhas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email, senha, confirmaSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.edemail);
        senha = (EditText) findViewById(R.id.edsenha);
        confirmaSenha = (EditText) findViewById(R.id.edconfirmsenha);

    }

    public void mostrar(View view){
        String mail = email.getText().toString();
        String pass = senha.getText().toString();
        String confirmPass = confirmaSenha.getText().toString();

        if(pass.equals(confirmPass)) {
            String msg = "Email: " + mail + " Senha: " + pass;
            Toast.makeText(MainActivity.this, "sua senha salva!", Toast.LENGTH_SHORT).show();
            Log.i("TESTE", msg);
            Intent i = new Intent(this, Tela2.class);
            startActivity(i);
        }else
            Toast.makeText(MainActivity.this, "Erro na confirmação da senha", Toast.LENGTH_SHORT).show();




    }
}
