package bridgelabz.com.android_widgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

/**
 * Created by bridgeit on 1/7/16.
 */
public class button extends AppCompatActivity {
        private EditText edittext1,edittext2;
        private Button buttonSum;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_button_main);

            addListenerOnButton();

        }
        public void addListenerOnButton(){
            edittext1= (EditText) findViewById(R.id.editText1);
            edittext2 = (EditText) findViewById(R.id.editText2);
            buttonSum = (Button) findViewById(R.id.button1);
            buttonSum.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    String value1=edittext1.getText().toString();
                    String value2=edittext2.getText().toString();
                    int a=Integer.parseInt(value1);
                    int b=Integer.parseInt(value2);
                    int sum=a+b;
                    Toast.makeText(button.this,String.valueOf(sum),Toast.LENGTH_LONG).show();
                }

            });

        }
    }
