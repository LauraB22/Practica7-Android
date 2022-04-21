package com.example.pract7_1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
public class MainActivity extends Activity {
    TextView tv;
/** Called when the activity is first created. */
@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= findViewById(R.id.textView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
            MenuItem item1 = menu.add(0,1,1,"Opción 1");
            MenuItem item2 = menu.add(0,2,2,"Opción 2");
            MenuItem item3 = menu.add(0,3,3,"Opción 3");
            item1.setIcon(R.drawable.ic_launcher_foreground);
            item2.setIcon(R.drawable.ic_launcher_foreground);
            item3.setIcon(R.drawable.ic_launcher_foreground);
            return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();
        tv.append("\n Ha pulsado la opción "+id);
        return true;
    }
}
