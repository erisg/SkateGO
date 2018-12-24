package bog.skate.eris.skatego;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem Menuitem) {

        Activity activity = null;
        switch (Menuitem.getItemId()) {
            case R.id.navigation_home:
                break;

            case R.id.navigation_dashboard:
                Intent a = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(a);
                break;

            case R.id.navigation_notifications:
                Intent b = new Intent(MainActivity.this,shop.class);
                startActivity(b);
                break;
        }

        return false;
    }
}