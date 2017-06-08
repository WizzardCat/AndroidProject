package local.httpandroidstudioprojetct.my_first_apps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView myText = (TextView) findViewById(R.id.text);

    Button myButton = (Button) findViewById(R.id.button1);
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            // Instant non-durable pop-up
                Toast toast = Toast.makeText(getApplicationContext(), "Bienvenu ", Toast.LENGTH_LONG);
                toast.show();

                Intent myIntent = new Intent(MainActivity.this, NextActivity.class);
                EditText editText = (EditText) findViewById(R.id.text);
                String message = editText.getText().toString();
                myIntent.putExtra(EXTRA_MESSAGE, message);
                startActivity(myIntent);
            }


        });
    }


}
