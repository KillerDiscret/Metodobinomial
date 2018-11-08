package e.antony.opcionesfinancieras;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class binomial extends AppCompatActivity {
Button boton_2;
    EditText entradas, entradak, entradac;
    TextView resultado;
    ConstraintLayout ventana;
    Snackbar opcion1;
    Snackbar opcion2;
    Snackbar opcion3;
    Snackbar opcion4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binomial);
        ventana= findViewById(R.id.ventana_binomial);
        opcion1=Snackbar.make(ventana,"Conviene comprar la acción (In the money!)",Snackbar.LENGTH_LONG);
        opcion2=Snackbar.make(ventana,"No conviene comprar la acción (Out of the money!)",Snackbar.LENGTH_INDEFINITE);
        opcion3=Snackbar.make(ventana,"Conviene comprar la acción para perder menos (At the money!)",Snackbar.LENGTH_LONG);
        opcion4=Snackbar.make(ventana,"No gana, ni pierde al comprar la acción (At the money!)",Snackbar.LENGTH_LONG);

        entradas= findViewById(R.id.editTextS);
        entradak=findViewById(R.id.editTextK);
        entradac=findViewById(R.id.editTextC);
        resultado=findViewById(R.id.textresultado);
        boton_2= findViewById(R.id.boton2);

boton_2.setOnClickListener(
        new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1=entradas.getText().toString();
                String valor2=entradak.getText().toString();
                String valor3=entradac.getText().toString();
                int n1=Integer.parseInt(valor1);
                int n2=Integer.parseInt(valor2);
                int n3=Integer.parseInt(valor3);
                int r;
                r=(n1-n2-n3);
                String result= String.valueOf(r);
                resultado.setText(result);
                if(n1>(n2+n3))
                {
                    opcion1.show();
                }
                if(n1<(n2+n3)&&n2+n3-n1<n3)
                {
                    opcion3.show();
                }
                if(-1*(r)==n3)
                {
                    opcion2.show();
                }
                if(n1<(n2+n3)&&n2+n3-n1>n3)
                {
                    opcion2.show();
                }
                if(r==0)
                {
                    opcion4.show();
                }
            }
        }


);

    }

}
