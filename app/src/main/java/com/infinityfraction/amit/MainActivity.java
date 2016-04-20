package com.infinityfraction.amit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String STATES[] = {"Andra Pradesh","Hyderabad","Arunachal Pradesh","Itangar","Assam","Dispur","Bihar","Patna","Chhattisgarh","Raipur","Goa","Panaji","Gujarat","Gandhinagar","Haryana","Chandigarh","Himachal Pradesh","Shimla","Jammu and Kashmir","Srinagar and Jammu","Jharkhand","Ranchi","Karnataka","Bangalore","Kerala","Thiruvananthapuram","Madya Pradesh","Bhopal","Maharashtra","Mumbai","Manipur","Imphal","Meghalaya","Shillong","Mizoram","Aizawi","Nagaland","Kohima","Orissa","Bhubaneshwar","Punjab","Chandigarh","Rajasthan","Jaipur","Sikkim","Gangtok","Tamil Nadu","Chennai","Tripura","Agartala","Uttaranchal","Dehradun","Uttar Pradesh","Lucknow","West Bengal","Kolkata","Union Territories","Capital","Andaman and Nicobar Islands","Port Blair","Chandigarh","Chandigarh","Dadar and Nagar Haveli","Silvassa","Daman and Diu","Daman","Delhi","Delhi","Lakshadeep","Kavaratti","Pondicherry","Pondicherry"};

    void initAutoCompleteTextView()
    {
        AutoCompleteTextView actv1 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,STATES);
        actv1.setAdapter(adapter);
    }

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAutoCompleteTextView();

        button1 = (Button)findViewById(R.id.button);
    }

    public void openListOfStories(View v)
    {
        EditText et1, et2;
        AutoCompleteTextView actv1;
        et1 = (EditText)findViewById(R.id.editText);
        et2 = (EditText)findViewById(R.id.editText2);
        actv1 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);

        String name = et1.getText().toString().trim();
        String age = et2.getText().toString().trim();
        String location = actv1.getText().toString().trim();

        if(name.matches("") && age.matches("") && location.matches("")) {
            Toast.makeText(this, "Fill The Details ", Toast.LENGTH_LONG).show();
            return ;
        }
        else if(name.matches("") || age.matches("") || location.matches("")) {
            Toast.makeText(this, "Fill Complete Details", Toast.LENGTH_LONG).show();
            return;
        }
        else
        {
            Toast.makeText(this, "Hiasdfghjkl"+name+"1",Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, MainActivity2.class);
            startActivity(i);
        }
    }

}
