package com.aptmini.jreacs.connexus;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class Test extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
