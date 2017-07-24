package com.apreciasoft.admin.asremis.Fracments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.apreciasoft.admin.asremis.R;
import com.mercadopago.core.MercadoPago;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.model.PaymentMethod;
import com.mercadopago.util.JsonUtil;

/**
 * Created by usario on 1/7/2017.
 */

public class PaymentCreditCar extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_credit_car);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Pago Con Tarjeta");
    }

    // Método ejecutado al hacer clic en el botón
    public void submit(View view) {

        // Iniciar el checkout de MercadoPago
        new MercadoPago.StartActivityBuilder()
                .setActivity(this)
                .setPublicKey("TEST-ad365c37-8012-4014-84f5-6c895b3f8e0a")
                .setCheckoutPreferenceId("150216849-ceed1ee4-8ab9-4449-869f-f4a8565d386f")
                .startCheckoutActivity();

    }


    @Override
    public void onBackPressed() {
        finish();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {

        if(requestCode == MercadoPago.PAYMENT_METHODS_REQUEST_CODE) {
            if(resultCode == RESULT_OK) {
                PaymentMethod paymentMethod = JsonUtil.getInstance().fromJson(data.getStringExtra("paymentMethod"), PaymentMethod.class);
                // Ahora puedes continuar con tu flujo.
                // Recuerda verificar si el medio de pago es offline!
            } else {
                if ((data != null) && (data.hasExtra("mpException"))) {
                    MPException exception = JsonUtil.getInstance()
                            .fromJson(data.getStringExtra("mpException"), MPException.class);
                }
            }
        }
    }
}
