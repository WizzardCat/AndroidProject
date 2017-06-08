package local.httpandroidstudioprojetct.my_first_apps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Formation on 06/06/2017.
 */

public class NextActivity extends Activity{

    int qtécf;
    int qtécht1;
    int qtéchoco;
    int qtécht2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_next);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.pseudo);
        textView.setText(message);



//------------------------------------------Quantité de café--------------------------------------------------------------------
        qtécf = 0;



        Button myButtonMoinsCf = (Button) findViewById(R.id.moinscf1);

        myButtonMoinsCf.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                // Instant non-durable pop-up
                Toast toast = Toast.makeText(getApplicationContext(), "Quantity supp", Toast.LENGTH_LONG);
                toast.show();

                TextView zerocf = (TextView) findViewById(R.id.zerocf);
                TextView pxCf = (TextView) findViewById(R.id.zerocf2);

                if(qtécf>0) {
                    qtécf--;
                    zerocf.setText("" + qtécf);
                }

            }

        });

        Button myButtonpluscf = (Button) findViewById(R.id.pluscf);
        myButtonpluscf.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                // Instant non-durable pop-up
                Toast toast = Toast.makeText(getApplicationContext(), "Quantity add", Toast.LENGTH_LONG);
                toast.show();

                TextView zerocf2 = (TextView) findViewById(R.id.zerocf);
                TextView pxCf2 = (TextView) findViewById(R.id.zerocf2);

                if(qtécf<9) {
                    qtécf++;
                    zerocf2.setText("" + qtécf);
                }
            }

        });

//------------------------------------------Quantité de Chantilly pour le café--------------------------------------------------


        qtécht1 = 0;


        Button myButtonMoinsChtCf = (Button) findViewById(R.id.moinscht);

        myButtonMoinsChtCf.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                // Instant non-durable pop-up
                Toast toast = Toast.makeText(getApplicationContext(), "Quantity supp", Toast.LENGTH_LONG);
                toast.show();

                TextView zeroChtCf = (TextView) findViewById(R.id.zerocht);

                if(qtécht1>0) {
                    qtécht1--;
                    zeroChtCf.setText("" + qtécht1);
                }


            }

        });

        Button myButtonPlusChtCf= (Button) findViewById(R.id.pluscht);

        myButtonPlusChtCf.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                // Instant non-durable pop-up
                Toast toast = Toast.makeText(getApplicationContext(), "Quantity add", Toast.LENGTH_LONG);
                toast.show();

                TextView zeroChtCf2 = (TextView) findViewById(R.id.zerocht);

                if(qtécht1<9) {
                    qtécht1++;
                    zeroChtCf2.setText("" + qtécht1);
                }
            }

        });



//------------------------------------------------Quantité de Chocolat----------------------------------------------------------

        qtéchoco=0;

        Button myButtonMoinsChoco = (Button) findViewById(R.id.lessch);

        myButtonMoinsChoco.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                // Instant non-durable pop-up
                Toast toast = Toast.makeText(getApplicationContext(), "Quantity supp", Toast.LENGTH_LONG);
                toast.show();

                TextView zerochoco = (TextView) findViewById(R.id.zeroch);

                if(qtéchoco>0) {
                    qtéchoco--;
                    zerochoco.setText("" + qtéchoco);
                }
            }

        });

        Button myButtonplusChoco = (Button) findViewById(R.id.morech);

        myButtonplusChoco.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                // Instant non-durable pop-up
                Toast toast = Toast.makeText(getApplicationContext(), "Quantity add", Toast.LENGTH_LONG);
                toast.show();

                TextView zerochoco2 = (TextView) findViewById(R.id.zeroch);

                if(qtéchoco<9) {
                    qtéchoco++;
                    zerochoco2.setText("" + qtéchoco);
                }
            }

        });



//----------------------------------------Quantité de Chantilly pour le chocolat------------------------------------------------

        qtécht2 = 0;


        Button myButtonMoinsChtChoco = (Button) findViewById(R.id.lesscht2);

        myButtonMoinsChtChoco.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                // Instant non-durable pop-up
                Toast toast = Toast.makeText(getApplicationContext(), "Quantity supp", Toast.LENGTH_LONG);
                toast.show();

                TextView zeroChtChoco = (TextView) findViewById(R.id.zerocht3);

                if(qtécht2>0) {
                    qtécht2--;
                    zeroChtChoco.setText("" + qtécht2);
                }


            }

        });

        Button myButtonPlusChtChoco= (Button) findViewById(R.id.morecht2);

        myButtonPlusChtChoco.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                // Instant non-durable pop-up
                Toast toast = Toast.makeText(getApplicationContext(), "Quantity add", Toast.LENGTH_LONG);
                toast.show();

                TextView zeroChtCf = (TextView) findViewById(R.id.zerocht3);

                if(qtécht2<9) {
                    qtécht2++;
                    zeroChtCf.setText("" + qtécht2);
                }
            }

        });

//--------------------------------------------ORDER--------------------------------------------------------------------------

        Button myOrder= (Button) findViewById(R.id.order);

        myOrder.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                // Instant non-durable pop-up
                Toast toast = Toast.makeText(getApplicationContext(), "Redirection", Toast.LENGTH_LONG);
                toast.show();


                Intent myIntent = new Intent(NextActivity.this, Order.class);
                startActivity(myIntent);
            }

        });


    }
}