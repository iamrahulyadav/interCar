package com.apreciasoft.admin.asremis.Fracments;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.apreciasoft.admin.asremis.Entity.ClientEntityAdd;
import com.apreciasoft.admin.asremis.Entity.RequetClient;
import com.apreciasoft.admin.asremis.Entity.resp;
import com.apreciasoft.admin.asremis.Http.HttpConexion;
import com.apreciasoft.admin.asremis.R;
import com.apreciasoft.admin.asremis.Services.ServicesDriver;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ernestoyaquello.com.verticalstepperform.VerticalStepperFormLayout;
import ernestoyaquello.com.verticalstepperform.interfaces.VerticalStepperForm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by usario on 2/8/2017.
 */

public class NewFormClient extends AppCompatActivity implements VerticalStepperForm {



        private VerticalStepperFormLayout verticalStepperForm;
        public EditText fisrtName;
        public  EditText latName;
        public  EditText mail;
        public  EditText pass;

        ServicesDriver apiDriver = null;


        public ProgressDialog loading;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_steps_client);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Nuevo Cliente!");


        String[] mySteps = {"Nombre ","Apellido","Email", "Contraseña"};
        int colorPrimary = ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary);
        int colorPrimaryDark = ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark);

        // Finding the view
        verticalStepperForm = (VerticalStepperFormLayout) findViewById(R.id.vertical_stepper_form);

        // Setting up and initializing the form
        VerticalStepperFormLayout.Builder.newInstance(verticalStepperForm, mySteps, this, this)
                .primaryColor(colorPrimary)
                .primaryDarkColor(colorPrimaryDark)
                .hideKeyboard(false)
                .displayBottomNavigation(true) // It is true by default, so in this case this line is not necessary
                .init();


    }



    @Override
    public View createStepContentView(int stepNumber) {
        View view = null;
        switch (stepNumber) {
            case 0:
                view = createfisrtNameStep();
                break;
            case 1:
                view = createlatNameStep();
                break;
            case 2:
                view = createmailStep();
                break;
            case 3:
                view = createpassStep();
                break;
        }
        return view;
    }

    @Override
    public void onStepOpening(int stepNumber) {
        switch (stepNumber) {
            case 0:
                checkInput();
                break;
            case 1:
                checkInput();
                break;
            case 2:
                checkInput();
                break;
            case 3:
                checkInput();
                break;
            case 4:
                // As soon as the phone number step is open, we mark it as completed in order to show the "Continue"
                // button (We do it because this field is optional, so the user can skip it without giving any info)
                verticalStepperForm.setStepAsCompleted(1);
                // In this case, the instruction above is equivalent to:
                // verticalStepperForm.setActiveStepAsCompleted();
                break;
        }
    }


    private void checkInput() {


        if (mail.length() >= 0 ) {
            verticalStepperForm.setActiveStepAsCompleted();
        } else {
            // This error message is optional (use null if you don't want to display an error message)
            String errorMessage = "El Nombre no puede estar Vacio";
            verticalStepperForm.setActiveStepAsUncompleted(errorMessage);
        }

    }




    private View createfisrtNameStep() {
        // Here we generate programmatically the view that will be added by the system to the step content layout
        fisrtName = new EditText(this);
        fisrtName.setSingleLine(true);
        return fisrtName;
    }

    private View createlatNameStep() {
        // Here we generate programmatically the view that will be added by the system to the step content layout
        latName = new EditText(this);
        latName.setSingleLine(true);
        return latName;
    }

    private View createmailStep() {
        // Here we generate programmatically the view that will be added by the system to the step content layout
        mail = new EditText(this);
        mail.setSingleLine(true);
        return mail;
    }

    private View createpassStep() {
        // Here we generate programmatically the view that will be added by the system to the step content layout
        pass = new EditText(this);
        pass.setSingleLine(true);
        return pass;
    }


    @Override
    public void sendData() {

        safeClient();

    }


    public  void  safeClient()
    {

        if(this.apiDriver == null){this.apiDriver = HttpConexion.getUri().create(ServicesDriver.class);}

        try {
            loading = ProgressDialog.show(this, "Registrando Cliente", "Espere unos Segundos...", true, false);




            RequetClient client = new RequetClient(
                    new ClientEntityAdd(
                            fisrtName.getText().toString(),
                            latName.getText().toString(),
                            mail.getText().toString(),
                            pass.getText().toString(),
                            1
                    )
            );

            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            System.out.println(gson.toJson(client));

            Call<resp> call = this.apiDriver.addClient(client);
            Log.d("Call request", call.request().toString());
            Log.d("Call request header", call.request().headers().toString());

            call.enqueue(new Callback<resp>() {
                @Override
                public void onResponse(Call<resp> call, Response<resp> response) {

                    Log.d("Response request", call.request().toString());
                    Log.d("Response request header", call.request().headers().toString());
                    Log.d("Response raw header", response.headers().toString());
                    Log.d("Response raw", String.valueOf(response.raw().body()));
                    Log.d("Response code", String.valueOf(response.code()));


                    if (response.code() == 200) {


                        Toast.makeText(getBaseContext(),
                                "Cliente Registrado!", Toast.LENGTH_SHORT)
                                .show();

                        finish();

                    }  else if (response.code() == 201) {


                        AlertDialog alertDialog = new AlertDialog.Builder(NewFormClient.this).create();
                        alertDialog.setTitle("Cliente ya Existe");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                        alertDialog.show();
                        loading.dismiss();

                    }

                }



                public void onFailure(Call<resp> call, Throwable t) {
                    AlertDialog alertDialog = new AlertDialog.Builder(NewFormClient.this).create();
                    alertDialog.setTitle("ERROR");
                    alertDialog.setMessage(t.getMessage());
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    loading.dismiss();
                                }
                            });
                    alertDialog.show();
                    loading.dismiss();
                }
            });

        } finally {
            this.apiDriver = null;

        }

    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
