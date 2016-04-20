package com.infinityfraction.amit;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity2 extends Activity {

    private static final String STORIES[] = {"The Amityville Horror", "The Entity", "The Exorcism of Emily Rose", "Wolf Creek", "The Haunting in Connecticut"};

    void initListView()
    {
        ListView lv1 = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, R.layout.costum_textview,STORIES);
        lv1.setAdapter(listAdapter);

        lv1.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if(position == 0)
                        {
                            Intent i = new Intent(MainActivity2.this,Story1.class);
                            startActivity(i);
                        }
                    }
                }
        );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initListView();
    }



}
