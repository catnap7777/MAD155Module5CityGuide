package mad155.kmathes.mad155module5cityguide;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.net.URI;

public class MainActivity extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] attraction =   {"Art Institute of Chicago",
                                "Magnificent Mile",
                                "Willis Tower",
                                "Navy Pier",
                                "Water Tower"} ;

        //.. was using android default layout of simple_list_item_1 ... notice "android" gone too
        //setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, attraction));
        //.. now it points to custom layout activity main and the custom textview widget named travel
        //  that has the picture with drawableLeft
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, attraction));

    }
    //.. that's a lower case "L" not a 1 after ListView
    protected void onListItemClick(ListView l, View v, int position, long id ) {

        switch(position) {
            case 0:
                //.. open a website
                //.. could also write intent/start activity this way
                //Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://artic.edu"));
                //startActivity(intent2);
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://artic.edu")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://themagnificentmile.com")));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Willis.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Pier.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, Water.class));
                break;
            default:
                break;
        }


    }


}
