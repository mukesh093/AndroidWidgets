package bridgelabz.com.android_widgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

/**
 * Created by bridgeit on 1/7/16.
 */
public class datePicker extends AppCompatActivity {
    DatePicker picker;
    Button displayDate;
    TextView textview1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_picker_main);

        textview1=(TextView)findViewById(R.id.textView1);
        picker=(DatePicker)findViewById(R.id.datePicker1);
        displayDate=(Button)findViewById(R.id.button1);

        textview1.setText(getCurrentDate());

        displayDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textview1.setText(getCurrentDate());
            }

        });
    }
    public String getCurrentDate(){
        StringBuilder builder=new StringBuilder();
        builder.append("Current Date: ");
        builder.append((picker.getMonth() + 1)+"/");//month is 0 based
        builder.append(picker.getDayOfMonth()+"/");
        builder.append(picker.getYear());
        return builder.toString();
    }
}


