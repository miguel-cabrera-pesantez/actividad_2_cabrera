package com.example.actividad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.actividad_2.databinding.ActivityDetalleUsuarioBinding;

public class detalle_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetalleUsuarioBinding binding= ActivityDetalleUsuarioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        String usuario= extras.getString("usuario");
        binding.txtBienve.setText("Bienvenido "+usuario);

    }
}