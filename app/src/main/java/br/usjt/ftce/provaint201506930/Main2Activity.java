/**
 * Caio Tatsuya Ikena 201506930
 */

package br.usjt.ftce.provaint201506930;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
    }

    public void CalcularTabuada(View view)
    {
        EditText vtabuada = (EditText)findViewById(R.id.tabuada);
        EditText vate = (EditText)findViewById(R.id.ate);

        int tabuada = Integer.parseInt(vtabuada.getText().toString());
        int ate = Integer.parseInt(vate.getText().toString());

        int resultado = 0;
        String aux = "";

        for (int i = 0; i < ate; i++)
        {
            resultado = tabuada * i;
            aux = tabuada + " x " + ate + " = " + resultado;
        }

        TextView resposta = (TextView)findViewById(R.id.igual);

        resposta.setText(aux);
    }
}
