package demos.ness.com.downloadmanagerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void dlFile(View view) {
        if (DownloadUtils.isDownloadManagerAvailable(getApplicationContext())) {
            //String url = "http://www.theaterhopper.com/wordpress/wp-content/uploads/2012/02/avengers_poster.jpg";
            String url = "http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3";
            //DownloadUtils.dlFile(this, url, "Avengers.jpg", "Avengers", "Avengers Poster");
            DownloadUtils.dlFile(this, url, "GetGot.mp3", "GetGot", "GetGot mp3");
        } else {
            Toast.makeText(getApplicationContext(), "Dl Manager Not Supported in Pre GINGERBREAD Devices", Toast.LENGTH_SHORT).show();
        }
    }
}
