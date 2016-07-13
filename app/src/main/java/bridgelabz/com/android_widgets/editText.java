package bridgelabz.com.android_widgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by bridgeit on 1/7/16.
 */
public class editText extends AppCompatActivity{
    private EditText editText;
    private Button submit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_text_main);

        addListenerOnButton();
    }

    public void addListenerOnButton(){
        editText= (EditText) findViewById(R.id.editText);
        submit= (Button) findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=editText.getText().toString();
                Toast.makeText(editText.this,String.valueOf(value),Toast.LENGTH_LONG).show();
            }
        });
    }

}

