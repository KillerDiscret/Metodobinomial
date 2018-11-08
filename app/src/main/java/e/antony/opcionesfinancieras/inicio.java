package e.antony.opcionesfinancieras;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
            Intent irventana2= new Intent(inicio.this,MainActivity.class);
            startActivity(irventana2);
            }
        },5000);

    }
}
