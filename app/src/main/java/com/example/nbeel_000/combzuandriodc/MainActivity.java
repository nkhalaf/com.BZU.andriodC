package com.example.nbeel_000.combzuandriodc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText  number1  = (EditText)findViewById(R.id.editText);
                int  random = (int)(Math.random()*1000);
                int uNumber = Integer.parseInt(number1.getText().toString());

                if(random==uNumber)
                    Toast.makeText(getBaseContext()," excellent nice  one :D  ",Toast.LENGTH_SHORT).show();
                else{
                    if(Math.abs(random-uNumber)<=5)
                        Toast.makeText(getBaseContext()," very Close :D",Toast.LENGTH_SHORT).show();
                    else{
                        Toast.makeText(getBaseContext()," too far ",Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    protected void onStart() {

        super.onStart();
        Toast.makeText(this,"on Start",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume() {

        super.onResume();
        Toast.makeText(this,"on resume",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause() {

        super.onPause();
        Toast.makeText(this,"on pause",Toast.LENGTH_SHORT).show();


    }
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"on stop",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"on Destroy",Toast.LENGTH_SHORT).show();


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
