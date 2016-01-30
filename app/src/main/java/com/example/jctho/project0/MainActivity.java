package com.example.jctho.project0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view) {
        CharSequence toastText="No button selected";
        switch (view.getId())
        {
            case R.id.btnSpotify:
                toastText="This button will launch the Spotify Streamer";
                break;
            case R.id.btnScores:
                toastText="This button will launch the Scores Application";
                break;
            case R.id.btnLibrary:
            toastText="This button will launch the Library Application";
            break;
            case R.id.btnBigger:
            toastText="This button will launch 'Build it Bigger'";
            break;
            case R.id.btnReader:
            toastText="This button will launch the Reader Application";
            break;
            case R.id.btnCapstone:
            toastText="This button will launch my Capstone Application";
            break;        }
        Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_SHORT).show();
    }
}
