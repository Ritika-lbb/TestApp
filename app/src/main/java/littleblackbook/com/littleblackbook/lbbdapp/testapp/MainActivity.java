package littleblackbook.com.littleblackbook.lbbdapp.testapp;

import android.media.session.PlaybackState;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    ListView listView;
    ArrayList<TestRowObject> testRowObjectArrayList;
    public static final Integer images[]={R.drawable.park, R.drawable.lbbgiveaway, R.drawable.food, R.drawable.goa, R.drawable.gurgaon_park,
            R.drawable.biryani, R.drawable.bar};
    public static final String titles[]=new String[]{"Havaianas", "Chappers", "Ugs", "Havaianas", "Chappers", "Ugs","Havanias"};
    public static final String categories[]=new String[]{"LifeStyle", "Food", "Restaurants", "Thekas", "Rooms", "Hotels","LifeStyle"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.listView);
        testRowObjectArrayList=new ArrayList<>();

        for(int i=0; i<titles.length; i++){
            TestRowObject testRowObject=new TestRowObject(images[i], titles[i], categories[i]);
            testRowObjectArrayList.add(testRowObject);
        }
        CustomMainAdapter customMainAdapter=new CustomMainAdapter(this, testRowObjectArrayList);
        listView.setAdapter(customMainAdapter);

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
}
