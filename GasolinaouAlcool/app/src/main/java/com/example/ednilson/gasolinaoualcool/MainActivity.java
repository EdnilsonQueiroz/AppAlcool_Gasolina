package com.example.ednilson.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtalcool;
    private EditText txtgasolina;
    private Button btnverificar;
    private TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtalcool = (EditText) findViewById(R.id.txtalcoolid);
        txtgasolina = (EditText) findViewById(R.id.txtgasolinaid);
        btnverificar = (Button) findViewById(R.id.btnid);
        txtresultado = (TextView) findViewById(R.id.txtresultadoid);

        btnverificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoalcool = txtalcool.getText().toString();
                String textogasolina = txtgasolina.getText().toString();

                Double valoralcool = Double.parseDouble( textoalcool );
                Double valorgasolina = Double.parseDouble( textogasolina );

                Double resultado = valoralcool / valorgasolina;

                if (resultado >= 0.7){
                    txtresultado.setText("Gasolina");
                }else {
                    txtresultado.setText("Alcool");
                }

            }
        });
    }
}
