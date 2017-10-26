/**
 * Caio Tatsuya Ikena 201506930
 */

package br.usjt.ftce.provaint201506930;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity
{
    EditText text;
    public static final String TABUADA = "br.usjt.ftce.provaint201506930";
    Activity a;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = this;
    }

    /**
     * Caio Tatsuya Ikena 201506930
     */

    public void calcularTabuada(View view)
    {
        EditText tabuada = (EditText)findViewById(R.id.tabuada);

        String stabuada = tabuada.getText().toString();
        Intent intent = new Intent(a, Main2Activity.class);
        intent.putExtra(TABUADA, stabuada);

        startActivity(intent);
    }
}
