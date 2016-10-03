package bridgelabz.com.android_widgets;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/**
 * Created by bridgeit on 1/7/16.
 */
public class autoCompleteTextView extends AppCompatActivity {
    String[] language ={"C","C++","Java",".NET","iOS","Android","ASP.NET","PHP","Angular",
    "C#"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto_complete_text_main);

        //Creating the instance of ArrayAdapter containing list of language names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,language);

        //Getting the instance of autoCompleteTextView
        AutoCompleteTextView auto= (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        auto.setThreshold(1);//will start working from first character
        auto.setAdapter(adapter);//setting the adapter data into the autoCompleteTextView
        auto.setTextColor(Color.RED);

    }

}
