package bridgelabz.com.android_widgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by bridgeit on 1/7/16.
 */
public class timePicker extends AppCompatActivity {
    TextView textview1;
    TimePicker timepicker1;
    Button changetime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_picker_main);

        textview1=(TextView)findViewById(R.id.textView1);
        timepicker1=(TimePicker)findViewById(R.id.timePicker1);
        //Uncomment the below line of code for 24 hour view
        timepicker1.setIs24HourView(true);
        changetime=(Button)findViewById(R.id.button1);

        textview1.setText(getCurrentTime());

        changetime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                textview1.setText(getCurrentTime());
            }
        });

    }

    public String getCurrentTime(){
        String currentTime="Current Time: "+timepicker1.getCurrentHour()+":"+timepicker1.getCurrentMinute();
        return currentTime;
    }
}

