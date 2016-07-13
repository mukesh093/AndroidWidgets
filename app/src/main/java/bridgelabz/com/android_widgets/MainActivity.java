package bridgelabz.com.android_widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    android.widget.Button button,editText,autoComplete,toggleButton,datePicker,timePicker,progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.button);
        editText=(Button) findViewById(R.id.button1);
        autoComplete=(Button) findViewById(R.id.button2);
        toggleButton=(Button) findViewById(R.id.button3);
        datePicker=(Button) findViewById(R.id.button4);
        timePicker=(Button) findViewById(R.id.button5);
        progressBar=(Button) findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, bridgelabz.com.android_widgets.button.class);
                startActivity(intent);

            }
        });

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, bridgelabz.com.android_widgets.editText.class);
                startActivity(intent);

            }
        });

        autoComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, autoCompleteTextView.class);
                startActivity(intent);

            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, bridgelabz.com.android_widgets.toggleButton.class);
                startActivity(intent);

            }
        });

        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, bridgelabz.com.android_widgets.datePicker.class);
                startActivity(intent);

            }
        });

        timePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, bridgelabz.com.android_widgets.timePicker.class);
                startActivity(intent);

            }
        });

        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, bridgelabz.com.android_widgets.progressBar.class);
                startActivity(intent);

            }
        });
    }
}
