package ale.br.com.workingnavigationbottom;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import ale.br.com.workingnavigationbottom.fragments.FragmentBottom;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragmentSelected = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragmentSelected = FragmentBottom.newInstance();
                    break;
                case R.id.navigation_dashboard:
                    fragmentSelected = FragmentBottom.newInstance();
                    break;
                case R.id.navigation_notifications:
                    fragmentSelected = FragmentBottom.newInstance();
                    break;
            }
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.content, fragmentSelected);
            transaction.commit();
            return true;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //Exibe um fragment por default
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content, FragmentBottom.newInstance());
        transaction.commit();

        //Usado para selecionar um item de forma programática
        //bottomNavigationView.getMenu().getItem(2).setChecked(true);
    }

}
