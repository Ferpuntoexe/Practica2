package net.iesseveroochoa.fernandomartinezperez.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button agenda = (Button) findViewById(R.id.btAgenda);
        agenda.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, AgendaActivity.class);
                        startActivity(intent);
                    }
                }
        );
        Button agendaConstraint = (Button) findViewById(R.id.btAgendaC);
        agendaConstraint.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, AgendaConstraintActivity.class);
                        startActivity(intent);
                    }
                }
        );
        Button receta = (Button) findViewById(R.id.btReceta);
        receta.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, RecetaActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}