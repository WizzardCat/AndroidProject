package local.httpandroidstudioprojetct.my_first_apps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView myText = (TextView) findViewById(R.id.text);


    Button myButton = (Button) findViewById(R.id.button1);
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Toast toast = Toast.makeText(getApplicationContext(), myText.getText(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
