package net.iesseveroochoa.fernandomartinezperez.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class AgendaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        Button aceptar = (Button) findViewById(R.id.btAceptar);
        aceptar.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView nombreCont = (TextView) findViewById(R.id.tv0);
                        EditText nombre = (EditText) findViewById(R.id.etNombre);
                        EditText apellido = (EditText) findViewById(R.id.etApellido);

                        nombreCont.setText(nombre.getText() + " " + apellido.getText());
                    }
                }
        );
        Button reiniciar = (Button) findViewById(R.id.btReiniciar);
        reiniciar.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView nombreCont = (TextView) findViewById(R.id.tv0);
                        EditText nombre = (EditText) findViewById(R.id.etNombre);
                        EditText apellido = (EditText) findViewById(R.id.etApellido);
                        EditText email = (EditText) findViewById(R.id.etEmail);
                        EditText tel = (EditText) findViewById(R.id.etTel);
                        EditText notas = (EditText) findViewById(R.id.etNombre);

                        nombreCont.setText("Nuevo Contacto");
                        nombre.setText("");
                        apellido.setText("");
                        email.setText("");
                        tel.setText("");
                        notas.setText("");

                    }
                }
        );
        Button salir = (Button) findViewById(R.id.btSalir);
        salir.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       finish();
                    }
                }
        );
    }
}