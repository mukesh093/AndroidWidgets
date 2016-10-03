package bridgelabz.com.android_widgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

/**
 * Created by bridgeit on 1/7/16.
 */
public class button extends AppCompatActivity {
        private EditText editText1,editText2;
        private Button buttonSum;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_button_main);

            addListenerOnButton();

        }
        public void addListenerOnButton(){
            editText1= (EditText) findViewById(R.id.editText1);
            editText2 = (EditText) findViewById(R.id.editText2);
            buttonSum = (Button) findViewById(R.id.button1);
            buttonSum.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    String value1=editText1.getText().toString();
                    String value2=editText2.getText().toString();
                    int a=Integer.parseInt(value1);
                    int b=Integer.parseInt(value2);
                    int sum=a+b;
                    Toast.makeText(button.this,String.valueOf(sum),Toast.LENGTH_LONG).show();
                }
            });
        }
    }
