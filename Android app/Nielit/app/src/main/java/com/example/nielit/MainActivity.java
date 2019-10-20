package com.example.nielit;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Integer[] images = {
            R.drawable.i1,
            R.drawable.i2,
            R.drawable.i3,
            R.drawable.i4,
            R.drawable.i5
    };

    Integer[] shortcourse_image = {
            R.drawable.f1,
            R.drawable.v1,
            R.drawable.v2,
            R.drawable.f2,

            R.drawable.f3

    };

    String[] shortname = new String[]{

            "Apple",
            "Broccoli",
            "Brinjal",
            "Banana",

            "Orange"
    };

    String[] shortfee = new String[]{
            "Rs.100 per kg",
            "Rs.75 per kg",
            "Rs.48 per kg",
            "Rs.60 per dozen",

            "Rs.70 per kg"
    };

    String[] shortduration = new String[]{
            "",
            "",
            "",
            "",

            ""
    };

    Integer[] longcourse_image = {
            R.drawable.g1,
            R.drawable.flour,
            R.drawable.cjickpea,
            R.drawable.g3,
            R.drawable.g2

    };

    String[] longname = new String[]{

            "Arhar dal",
            "Ashirvaad Flour",
            "Chickpea",
            "Rajma",
            "Masoor dal"
    };

    String[] longfee = new String[]{
            "Rs.90 ",
            "Rs.350",
            "Rs.70",
            "Rs.60",
            "Rs.80"
    };

    String[] longduration = new String[]{
            "",
            "",
            "",
            "",
            ""
    };


    Integer[] shortcours_image = {
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p5,
            R.drawable.p4,

            R.drawable.p3

    };

    String[] shortnam = new String[]{

            "Fish",
            "Chicken",
            "Egg",
            "Meat",

            "Meat"
    };

    String[] shortfe = new String[]{
            "Rs.200 per kg",
            "Rs.400 per kg",
            "Rs.15 per kg",
            "Rs.450 per kg",

            "Rs.500 per kg"
    };

    String[] shortduratio = new String[]{
            "",
            "",
            "",
            "",

            ""
    };



    Integer[] longpcourse_image = {
            R.drawable.oil,
            R.drawable.chocolate,
            R.drawable.biscuit,
            R.drawable.namkeen,
            R.drawable.candy

    };

    String[] longpname = new String[]{

            "Oil",
            "Amul Chocolate",
            "Oreo Biscuits", "Shankar Bhujia",
            "Candy"
    };

    String[] longpfee = new String[]{
            "Rs.560",
            "Rs.200",
            "Rs.30",
            "Rs.50",
            "Rs.100"
    };

    String[] longpduration = new String[]{
            "",
            "",
            "",
            "",
            ""
    };

    Integer[] shortpcourse_image = {
            R.drawable.m1,
            R.drawable.m2,
            R.drawable.m3,
            R.drawable.m4

    };

    String[] shortpname = new String[]{

            "Milk",
            "Ghee",
            "Butter",
            "Whipped Cream"
    };

    String[] shortpfee = new String[]{
            "Rs.42 per litre",
            "Rs.410 per litre",
            "Rs.50",
            "Rs.100"
    };

    String[] shortpduration = new String[]{
            "",
            "",
            "",
            ""
    };




    RecyclerView rv, short_term, long_term, summer_training, shortTraining,longTraining;
    TextView shortmore, longmore, summermore, shortpmore, longpmore;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        rv = findViewById(R.id.top_horizontal_scroll);
        short_term = findViewById(R.id.shortterm_horizontal_scroll);
        long_term = findViewById(R.id.longterm_horizontal_scroll);
        summer_training = findViewById(R.id.summer_horizontal_scroll);
        shortTraining = findViewById(R.id.shortProject_scroll);
        longTraining = findViewById(R.id.longproject_horizontal_scroll);

        shortmore = findViewById(R.id.shortmore);
        longmore = findViewById(R.id.longmore);
        summermore = findViewById(R.id.summermore);
        shortpmore = findViewById(R.id.spmore);
        longpmore = findViewById(R.id.longpmore);

        btn = findViewById(R.id.ns);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        setRecyclerView();



        shortmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Courses.class);
                i.putExtra("pos","1");
                startActivity(i);
            }
        });

        longmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Courses.class);
                i.putExtra("pos","2");
                startActivity(i);
            }
        });

        summermore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Courses.class);
                i.putExtra("pos","3");
                startActivity(i);
            }
        });

        shortpmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Courses.class);
                i.putExtra("pos","4");
                startActivity(i);
            }
        });

        longpmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Courses.class);
                i.putExtra("pos","5");
                startActivity(i);
            }
        });

       btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, nsqf.class);
                startActivity(i);
            }
        });
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
//        if (id == R.id.nav_centres) {
//            Intent i = new Intent(this, Centers.class);
//            startActivity(i);
//
//        } else
          if (id == R.id.nav_feedback) {
            Intent i = new Intent(this, Feedback.class);
            startActivity(i);

        } else if (id == R.id.nav_shortTerm) {
            Intent i = new Intent(this, Courses.class);
            i.putExtra("pos","1");
            startActivity(i);

        } else if (id == R.id.nav_longTerm) {
            Intent i = new Intent(this, Courses.class);
            i.putExtra("pos","2");
            startActivity(i);

        } else if (id == R.id.nav_home) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_register) {
            Intent i = new Intent(this, Registration.class);
            startActivity(i);

        } else if (id == R.id.nav_our_team) {
            Intent i = new Intent(this, OurTeam.class);
            startActivity(i);

        } else if (id == R.id.nav_summerTraining) {
            Intent i = new Intent(this, Courses.class);
            i.putExtra("pos","3");
            startActivity(i);

        } else if (id == R.id.nav_shortTraining) {
            Intent i = new Intent(this, Courses.class);
            i.putExtra("pos","4");
            startActivity(i);

        } else if (id == R.id.nav_longTraining) {
            Intent i = new Intent(this, Courses.class);
            i.putExtra("pos","5");
            startActivity(i);

        } else if (id == R.id.nav_nsqf) {
            Intent i = new Intent(this, nsqf.class);
            startActivity(i);


        } else if (id == R.id.nav_contactus) {
            Intent i = new Intent(this, ContactUs.class);
            startActivity(i);

        } else if (id == R.id.nav_about_us) {
            Intent i = new Intent(this, AboutUs.class);
            startActivity(i);
        }


            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }

        public void setRecyclerView ()
        {


            LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
            rv.setLayoutManager(manager);
            top_scroller_adapter adapter = new top_scroller_adapter(images);
            rv.setAdapter(adapter);


            LinearLayoutManager m = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
            short_term.setLayoutManager(m);
            course_adapter ad = new course_adapter(shortcourse_image, shortname, shortfee,shortduration);
            short_term.setAdapter(ad);


            LinearLayoutManager m1 = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
            long_term.setLayoutManager(m1);
            course_adapter ad1 = new course_adapter(longcourse_image, longname, longfee,longduration);
            long_term.setAdapter(ad1);


            LinearLayoutManager m2 = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
            summer_training.setLayoutManager(m2);
            course_adapter ad2 = new course_adapter(shortcourse_image, shortname, shortfee,shortduration);
            summer_training.setAdapter(ad2);


            LinearLayoutManager m3 = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
            shortTraining.setLayoutManager(m3);
            course_adapter ad3 = new course_adapter(shortpcourse_image, shortpname, shortpfee,shortpduration);
            shortTraining.setAdapter(ad3);

            LinearLayoutManager m4 = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
            longTraining.setLayoutManager(m4);
            course_adapter ad4 = new course_adapter(longpcourse_image, longpname, longpfee,longpduration);
            longTraining.setAdapter(ad4);

        }
    }