package com.peterung.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
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

    @OnClick(R.id.spotify_streamer)
    public void spotifyStreamerClick() {
        showToast("This button will launch my spotify streamer app!");
    }

    @OnClick(R.id.library_app)
    public void libraryAppClick() {
        showToast("This button will launch my library app!");
    }

    @OnClick(R.id.scores_app)
    public void scoresAppClick() {
        showToast("This button will launch my scores app!");
    }

    @OnClick(R.id.build_it_bigger)
    public void buildItBiggerClick() {
        showToast("This button will launch my build it bigger app!");
    }

    @OnClick(R.id.xyz_reader)
    public void xyzReaderClick() {
        showToast("This button will launch my xyz reader app!");
    }

    @OnClick(R.id.capstone)
    public void capstoneClick() {
        showToast("This button will launch my capstone app!");
    }

    private void showToast(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
