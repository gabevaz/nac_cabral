package br.com.fiap.nac01.rm77914.nac01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdOpcoes;
    EditText digiteMetro;
    CheckBox ultraFrete;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdOpcoes = findViewById(R.id.rdOpcoes);
        digiteMetro = findViewById(R.id.digiteMetro);
        ultraFrete = findViewById(R.id.ultraFrete);
        resultado = findViewById(R.id.resultado);
    }

    public void calcular(View view) {

        double metros = Double.parseDouble(digiteMetro.getText().toString());
        double resultadoDouble = 0;

        int idRadio = rdOpcoes.getCheckedRadioButtonId();

        switch (idRadio){
            case R.id.rdbOpcao1:
                resultadoDouble = 24.90 * metros;
                break;
            case  R.id.rdbOpcao2:
                resultadoDouble = 11.90 * metros;
                break;
            case R.id.rdbOpcao3:
                resultadoDouble = 39.90 * metros;
                break;
            case R.id.rdbOpcao4:
                resultadoDouble = 16.90 * metros;
                break;
            default:
                resultadoDouble = 24.90 * metros;

        }

        if (ultraFrete.isChecked()){
            resultadoDouble = resultadoDouble * 1.3;
        }


        resultado.setText(String.valueOf(resultadoDouble));
    }
}
