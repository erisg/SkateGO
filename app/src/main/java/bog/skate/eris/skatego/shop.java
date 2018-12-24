package bog.skate.eris.skatego;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class shop extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.navigation_home:
                Intent c = new Intent(shop.this,MainActivity.class);
                startActivity(c);
                break;

            case R.id.navigation_dashboard:
                Intent e = new Intent(shop.this, MapsActivity.class);
                startActivity(e);
                break;

            case R.id.navigation_notifications:
                break;
        }

        return false;

    }
}
