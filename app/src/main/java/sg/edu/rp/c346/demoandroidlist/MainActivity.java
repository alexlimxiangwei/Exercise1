package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lvAnd;
    ArrayList<AndroidVersion> alAnd;
    CustomAdapter aaAnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAnd = findViewById(R.id.lvAndroid);
        alAnd = new ArrayList<>();
        alAnd.add(new AndroidVersion("Pie","9.0"));
        alAnd.add(new AndroidVersion("Oreo"," 8.0 - 8.1"));

        aaAnd = new CustomAdapter(MainActivity.this,R.layout.row,alAnd);
        lvAnd.setAdapter(aaAnd);
    }

}
