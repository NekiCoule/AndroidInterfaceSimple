package com.mweberexemple.tpapplismobilesinterfacessimples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by meder on 22/11/2017.
 */

public class ListSportActivity extends AppCompatActivity {

    private Button badminton;
    private Button volley;
    private Button baseball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sport);

        badminton = (Button) findViewById(R.id.btnBadminton);
        volley = (Button) findViewById(R.id.btnVolley);
        baseball = (Button) findViewById(R.id.btnBaseball);
    }
}
