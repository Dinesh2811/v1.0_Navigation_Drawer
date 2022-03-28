package com.example.v10_navigation_drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.v10_navigation_drawer.Nav_Menu_Fragment.Menu1;
import com.example.v10_navigation_drawer.Nav_Menu_Fragment.Menu2;
import com.example.v10_navigation_drawer.Nav_Menu_Fragment.Menu3;
import com.example.v10_navigation_drawer.Nav_Menu_Fragment.Menu4;
import com.example.v10_navigation_drawer.Nav_Menu_Fragment.Menu5;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav=(NavigationView)findViewById(R.id.menu);
//        nav=(NavigationView)findViewById(R.id.navmenu);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                switch (menuItem.getItemId())
                {
                    case R.id.menu1:

                        Menu1 fragment_one=new Menu1();
                        fragmentTransaction.replace(R.id.frameLayout1,fragment_one);
                        fragmentTransaction.commit();

                        Toast.makeText(getApplicationContext(),"menu1",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu2:
                        Menu2 fragment_two=new Menu2();
                        fragmentTransaction.replace(R.id.frameLayout1,fragment_two);
                        fragmentTransaction.commit();

                        Toast.makeText(getApplicationContext(),"menu2",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu3:
                        Menu3 fragment_three=new Menu3();
                        fragmentTransaction.replace(R.id.frameLayout1,fragment_three);
                        fragmentTransaction.commit();

                        Toast.makeText(getApplicationContext(),"menu3",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu4:
                        Menu4 fragment_four=new Menu4();
                        fragmentTransaction.replace(R.id.frameLayout1,fragment_four);
                        fragmentTransaction.commit();

                        Toast.makeText(getApplicationContext(),"menu4",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu5:
                        Menu5 fragment_five=new Menu5();
                        fragmentTransaction.replace(R.id.frameLayout1,fragment_five);
                        fragmentTransaction.commit();

                        Toast.makeText(getApplicationContext(),"menu5",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }

                return true;
            }
        });

    }
}
