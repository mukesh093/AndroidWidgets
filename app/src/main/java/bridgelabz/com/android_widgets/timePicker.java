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
    TextView textView1;
    TimePicker timePicker1;
    Button changeTime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_picker_main);

        textView1=(TextView)findViewById(R.id.textView1);
        timePicker1=(TimePicker)findViewById(R.id.timePicker1);

        timePicker1.setIs24HourView(true);
        changeTime=(Button)findViewById(R.id.button1);

        textView1.setText(getCurrentTime());

        changeTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                textView1.setText(getCurrentTime());
            }
        });

    }

    public String getCurrentTime(){
        String currentTime="Current Time: "+timePicker1.getCurrentHour()+":"+timePicker1.getCurrentMinute();
        return currentTime;
    }
}

