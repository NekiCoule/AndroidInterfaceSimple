package com.mweberexemple.tpapplismobilesinterfacessimples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //création du bouton
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiation du bouton
        start = (Button) findViewById(R.id.btnStart);
        //permet au bouton d'effectuer une action si on clique dessus. Ici, il appel goToPage2.
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPage2();
            }
        });
    }

    //Permet de passer à la page 2
    public void goToPage2()
    {
        Intent monIntent = new Intent(MainActivity.this, AuthentificationClass.class);
        startActivity(monIntent);
    }

}
