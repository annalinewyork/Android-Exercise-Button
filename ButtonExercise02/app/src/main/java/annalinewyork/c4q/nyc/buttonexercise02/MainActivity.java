package annalinewyork.c4q.nyc.buttonexercise02;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//in this exercise, set two button event handling, give both button & textview different color.
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonBoy = (Button)findViewById(R.id.button);
        buttonBoy.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textboy = (TextView)findViewById(R.id.textView);
                        textboy.setText("You goona get a toy car!");
                    }
                }
        );

        Button buttonGirl = (Button)findViewById(R.id.button2);
        buttonGirl.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textgirl = (TextView)findViewById(R.id.textView2);
                        textgirl.setText("You gonna get a pink mirror!");
                    }
                }
        );

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