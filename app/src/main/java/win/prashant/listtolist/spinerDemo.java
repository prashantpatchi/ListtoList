package win.prashant.listtolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class spinerDemo extends AppCompatActivity {

    Spinner spinner;
    String aa []  = {"Select the course ", "Android","Java","Digital Marketing","Php"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiner_demo);
        spinner=findViewById(R.id.spinner);



        //to diaply we need array adapter

    }
}
