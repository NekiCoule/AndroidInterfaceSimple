package com.mweberexemple.tpapplismobilesinterfacessimples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

/**
 * Created by meder on 22/11/2017.
 */

public class AccueilActivity extends AppCompatActivity {

    //relatif aux infos
    private TextView nom;
    private TextView prenom;
    private TextView naissance;
    private TextView email;
    private TextView adresse;
    private TextView commentaire;

    //relatif au layout
    private Button sports;
    private Button accueil;
    private TextView piedPage;

    //EXTRA de l'intent relatif aux infos
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
        setContentView(R.layout.activity_accueil);;

        //instanciation des infos
        nom = (TextView) findViewById(R.id.lblNom);
        prenom = (TextView) findViewById(R.id.lblPrenom);
        naissance = (TextView) findViewById(R.id.lblNaissance);
        email = (TextView) findViewById(R.id.lblEmail);
        adresse = (TextView) findViewById(R.id.lblAdresse);
        commentaire = (TextView) findViewById(R.id.lblCommentaire);

        //récupération de l'intent envoyé
        Intent monIntent = getIntent();

        //instanciatio des view du layout
        sports = (Button) findViewById(R.id.btnSports);
        accueil = (Button) findViewById(R.id.btnAccueil);
        piedPage = (TextView) findViewById(R.id.lblPiedPage);

        //Distribution des chaines de caractères récupérées dans les label prévus
        nom.setText(monIntent.getStringExtra(EXTRA_NOM));
        prenom.setText(monIntent.getStringExtra(EXTRA_PRENOM));
        naissance.setText(monIntent.getStringExtra(EXTRA_NAISSANCE));
        email.setText(monIntent.getStringExtra(EXTRA_EMAIL));
        adresse.setText(monIntent.getStringExtra(EXTRA_ADRESSE));
        commentaire.setText(monIntent.getStringExtra(EXTRA_COMMENTAIRE));


    }
}
