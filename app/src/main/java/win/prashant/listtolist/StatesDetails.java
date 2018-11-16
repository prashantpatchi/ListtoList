package win.prashant.listtolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StatesDetails extends AppCompatActivity {
    String pos1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states_details);

        pos1=getIntent().getExtras().getString("position");
        switch (pos1)
        {

        }
    }
}
