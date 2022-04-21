package com.example.pract7_2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;
public class MainActivity extends Activity {
    TextView tv;
/** Called when the activity is first created. */
@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R .id.textView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        SubMenu sub1= menu.addSubMenu(0,1,1,"submenú 1");
        sub1.setHeaderIcon(R.drawable.ic_launcher_foreground);
        SubMenu sub2= menu.addSubMenu(0,2,2, "submenú 2");
        sub2.setHeaderIcon(R.drawable.ic_launcher_foreground);
        MenuItem item3=sub1.add(0,3, 3, "Opcion 3");
        MenuItem item4=sub1.add(0,4, 4, "Opcion 4");
        MenuItem item5=sub1.add(0,5, 5, "Opcion 5");
        MenuItem item6=sub1.add(0,6, 6, "Opcion 6");
        MenuItem item7=sub2.add(0,7, 7, "Opcion 7");
        MenuItem item8=sub2.add(0,8, 8, "Opcion 8");
        MenuItem item9=sub2.add(0,9, 9, "Opcion 9");
        MenuItem item1O=sub2.add(0,10, 10, "Opcion 10");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();
        if(id>2)
            tv.append("\n Ha pulsado la opción "+id);
        return true;

    }
}