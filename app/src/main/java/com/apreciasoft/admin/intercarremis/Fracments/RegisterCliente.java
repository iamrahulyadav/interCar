package com.apreciasoft.admin.intercarremis.Fracments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.apreciasoft.admin.intercarremis.R;

/**
 * Created by usario on 1/7/2017.
 */

public class RegisterCliente extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_steps_driver);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Registro de Usuario");
    }



    @Override
    public void onBackPressed() {
        finish();
    }
}
