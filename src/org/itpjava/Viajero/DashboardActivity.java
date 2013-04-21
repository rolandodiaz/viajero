package org.itpjava.Viajero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: josediaz
 * Date: 4/19/13
 * Time: 8:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class DashboardActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    public void seleccionarOpcion(View v){
        switch(v.getId()){
            case R.id.nuevo_viaje:
                      //levanto otra activity para Viaje
                break;
            case R.id.nuevo_gasto:
                   startActivity(new Intent(this, GastoActivity.class));
                break;
        }

    }
}