package it.federico.com.fillingeffect;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ActivityMain extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {
            FragmentMain fragmentMain = FragmentMain.newInstance();
            getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragmentMain).commit();
        }
    }

}
