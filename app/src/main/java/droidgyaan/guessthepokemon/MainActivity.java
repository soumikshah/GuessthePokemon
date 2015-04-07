package droidgyaan.guessthepokemon;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


public class MainActivity extends ActionBarActivity {

    private FrameLayout frame1;
    private Button guess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guess =(Button)findViewById(R.id.button);
        guess.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                rollDice();
            }
        });
        frame1 = (FrameLayout)findViewById(R.id.pokemon);

    }

    //get two random ints between 1 and 6
    public void rollDice(){
        int val1 = (int)(Math.random()*13)+1;
        int val2 = (int)(Math.random()*13)+1;
        setDie(val1,frame1);
    }

    // set the appropriate pic for each die per int

    public void setDie(int value, FrameLayout layout){
        Drawable pic = null;
        switch(value){
            case 1:
                pic = getResources().getDrawable(R.drawable.p1);
                break;

            case 2:
                pic = getResources().getDrawable(R.drawable.p2);
                break;
            case 3:
                pic = getResources().getDrawable(R.drawable.p3);
                break;
            case 4:
                pic = getResources().getDrawable(R.drawable.p4);
                break;
            case 5:
                pic = getResources().getDrawable(R.drawable.p5);
                break;
            case 6:
                pic = getResources().getDrawable(R.drawable.p6);
                break;
            case 7:
                pic = getResources().getDrawable(R.drawable.p7);
                break;
            case 8:
                pic = getResources().getDrawable(R.drawable.p8);
                break;
            case 9:
                pic = getResources().getDrawable(R.drawable.p9);
                break;
            case 10:
                pic = getResources().getDrawable(R.drawable.p10);
                break;
            case 11:
                pic = getResources().getDrawable(R.drawable.p11);
                break;
            case 12:
                pic = getResources().getDrawable(R.drawable.p12);
                break;
            case 13:
                pic = getResources().getDrawable(R.drawable.p13);
                break;

        }
        layout.setBackground(pic);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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