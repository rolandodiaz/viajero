package org.itpjava.Viajero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ViajeroActivity extends Activity {

    private EditText usuario;
    private EditText password;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        usuario = (EditText) findViewById(R.id.usuario);
        password = (EditText) findViewById(R.id.password);

    }

    public void entrarOnClick(View v){
        String usuarioIngresado = usuario.getText().toString();
        String passwordIngresado = password.getText().toString();

        if("usuario".equals(usuarioIngresado) &&
                "123".equals(passwordIngresado)) {
            startActivity(new Intent(this, DashboardActivity.class));
        }   else{
            //mostramos un mensaje de error
            String mensajeError = getString(R.string.error_autenticacion);
            Toast toast = Toast.makeText(this, mensajeError, Toast.LENGTH_SHORT);
            toast.show();
        }

    }

}
