package win.prashant.listtolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class States extends AppCompatActivity {
    ListView listView;
    String indiastates[] = {"Ap","up","Assam","kp","Bir","rj"};
    String usastates[] = {"Arizona","Califonia","Mussigon","ny","Texas"};
    String pakistanstates[] = {"karachi","lahore","sindh","Balochistan", "panjab"};
    String pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states);
        listView= findViewById(R.id.listviewStates);
        pos=getIntent().getExtras().getString("position");
        switch (pos)
        {
            case  "0":
                ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(States.this,R.layout.support_simple_spinner_dropdown_item,indiastates);
                listView.setAdapter(arrayAdapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        //
                        //Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_SHORT).show();

                        Intent indetails = new Intent(States.this,StatesDetails.class);
                        indetails.putExtra("position",""+position);
                        startActivity(indetails);
                    }
                });
                break;

            case "1":
                ArrayAdapter<String>arrayAdapter1 = new ArrayAdapter<String>(States.this,R.layout.support_simple_spinner_dropdown_item,usastates);
                listView.setAdapter(arrayAdapter1);
                break;

            case "2":
                ArrayAdapter<String>arrayAdapter2 = new ArrayAdapter<String>(States.this,R.layout.support_simple_spinner_dropdown_item,pakistanstates);
                listView.setAdapter(arrayAdapter2);
        }




    }
}
