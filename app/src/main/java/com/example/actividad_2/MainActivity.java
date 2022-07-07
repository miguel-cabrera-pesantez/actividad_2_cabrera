package com.example.actividad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.actividad_2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIng.setOnClickListener(view -> {

            if (binding.txtUsu.getText().toString().equalsIgnoreCase("admin")
                    && binding.txtCon.getText().toString().equalsIgnoreCase("1234")){
                    String usuario =binding.txtUsu.getText().toString();
                    abrirUsuario(usuario);
            }else {
                Context context = MainActivity.this;
                CharSequence text="Usuario o Contraseña Incorrecta";
                int duration= Toast.LENGTH_SHORT;
                Toast toast=Toast.makeText(context,text,duration);
                toast.show();
            }
        });


    }

    private void abrirUsuario(String usuario){
        Intent intent = new Intent(this,detalle_usuario.class);
        intent.putExtra("usuario",usuario);
        startActivity(intent);
    }
}