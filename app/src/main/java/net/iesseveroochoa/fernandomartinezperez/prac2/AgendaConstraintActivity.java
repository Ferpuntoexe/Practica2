package net.iesseveroochoa.fernandomartinezperez.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AgendaConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_constraint);

        Button okToast = (Button) findViewById(R.id.btOK);
        okToast.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        int duracion = 30;
                        EditText nombre = (EditText) findViewById(R.id.etNombre);
                        String textoToast = nombre.getText().toString();


                        @SuppressLint("WrongConstant") Toast toast = Toast.makeText(context, textoToast, duracion);
                        toast.show();


                    }
                }
        );
        Button cancel = (Button) findViewById(R.id.btCancel);
        cancel.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(AgendaConstraintActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}