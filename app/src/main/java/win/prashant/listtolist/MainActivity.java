package win.prashant.listtolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    //creating list of country
    String countryname[] = {"India", "USA", "Pakistan" ,"Afganistan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listviewCountry);

        //fetch the data from array adapter class generic type data inside <> CAN ALSO FETCH INT TYPE
        ArrayAdapter<String>arrayAdapter= new ArrayAdapter<>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,countryname);
        //method of list view to set the data of list view
        listView.setAdapter(arrayAdapter);

        //click even fire need to use method seton..
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(getApplicationContext(),"" +position,Toast.LENGTH_SHORT).show();

                Intent in = new Intent(MainActivity.this,States.class);
                //send data one activity to different activity

                in.putExtra("position",""+position);
                startActivity(in);
            }
        });
    }
}
