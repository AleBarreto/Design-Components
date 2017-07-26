package ale.br.com.workingtabs;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import ale.br.com.workingtabs.adapter.ViewPagerAdapter;
import ale.br.com.workingtabs.fragment.FragmentTab;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar); // Toolbar
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager); // View Pager
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs); // TabLayout lib Material Design
        tabLayout.setupWithViewPager(viewPager); // Vincula com o ViewPager

    }

    /**
     * Inicia o Adapter com seu fragments,
     * como é um simples exemplo utilizei so um fragment.
     * @param viewPager
     */
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentTab(), "UM"); // fragment aqui
        adapter.addFragment(new FragmentTab(), "DOIS"); // outro fragment
        adapter.addFragment(new FragmentTab(), "TRES"); // outro fragment
        viewPager.setAdapter(adapter);
    }
}
