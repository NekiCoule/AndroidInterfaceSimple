package com.mweberexemple.tpapplismobilesinterfacessimples;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by meder on 22/11/2017.
 */

public class AuthentificationClass extends AppCompatActivity {

    //création des objets en rapport avec l'info
    private RadioGroup civilite;
    private RadioButton monsieur;
    private RadioButton madame;
    private EditText nom;
    private EditText prenom;
    private EditText naissance;
    private EditText email;
    private EditText adresse;
    private EditText commentaire;
    private Button valider;

    //création des EXTRApour l'intent afin d'envoyer les données
    final String EXTRA_CIVILITE ="";
    final String EXTRA_NOM="";
    final String EXTRA_PRENOM="";
    final String EXTRA_NAISSANCE="";
    final String EXTRA_EMAIL="";
    final String EXTRA_ADRESSE="";
    final String EXTRA_COMMENTAIRE="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);

        //instanciation des objets
        civilite = (RadioGroup) findViewById(R.id.rbtGroubeCivilite);
        monsieur = (RadioButton) findViewById(R.id.rbtMonsieur);
        madame = (RadioButton) findViewById(R.id.rbtMadame);
        nom = (EditText) findViewById(R.id.txtNom);
        prenom = (EditText) findViewById(R.id.txtPrenom);
        naissance = (EditText) findViewById(R.id.txtDateNaissance);
        email = (EditText) findViewById(R.id.txtEmail);
        adresse = (EditText) findViewById(R.id.txtAdresse);
        commentaire = (EditText) findViewById(R.id.txtCommentaire);
        valider = (Button) findViewById(R.id.btnValider);

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPage3();
            }
        });

    }

    //Passe à la page 3 tout en envoyant les données des views
    public void goToPage3()
    {
        Intent monIntent = new Intent(AuthentificationClass.this, AccueilActivity.class);

        //monIntent.putExtra(EXTRA_CIVILITE, civilite.getCheckedRadioButtonId(civilite.getText().toString()))
        monIntent.putExtra(EXTRA_NOM, nom.getText().toString());
        monIntent.putExtra(EXTRA_PRENOM, prenom.getText().toString());
        monIntent.putExtra(EXTRA_NAISSANCE, naissance.getText().toString());
        monIntent.putExtra(EXTRA_EMAIL, email.getText().toString());
        monIntent.putExtra(EXTRA_ADRESSE, adresse.getText().toString());
        monIntent.putExtra(EXTRA_COMMENTAIRE, commentaire.getText().toString());

        //execute l'intent: envoie les données et passe à la page 3
        startActivity(monIntent);
    }

}
