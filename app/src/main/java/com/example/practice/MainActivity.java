package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout2;
    RelativeLayout layout;
    Handler handler  = new Handler();
    Runnable run = new Runnable() {
        @Override
        public void run() {

            layout.setVisibility(View.VISIBLE);
            layout2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        layout = (RelativeLayout) findViewById(R.id.mainlay);
        layout2 = (LinearLayout) findViewById(R.id.lay2);

        TextView txt = (TextView) findViewById(R.id.regsterrr);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }
        });

        handler.postDelayed(run,2000);

        ImageView codeimage = (ImageView) findViewById(R.id.imgcodee);
        codeimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,homepage.class);
                intent.putExtra("key","<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<RelativeLayout\n" +
                        "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:background=\"@color/white\"\n" +
                        "    android:animateLayoutChanges=\"true\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "    <ImageView\n" +
                        "        android:layout_width=\"60dp\"\n" +
                        "        android:layout_height=\"60dp\"\n" +
                        "        android:id=\"@+id/imgcodee\"\n" +
                        "        android:src=\"@drawable/ic_code\"\n" +
                        "        android:layout_marginLeft=\"350dp\"/>\n" +
                        "    <RelativeLayout\n" +
                        "        android:id=\"@+id/lay1\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:layout_marginRight=\"40dp\"\n" +
                        "        android:layout_marginLeft=\"40dp\">\n" +
                        "\n" +
                        "        <androidx.cardview.widget.CardView\n" +
                        "            android:layout_width=\"120dp\"\n" +
                        "            android:id=\"@+id/imgg\"\n" +
                        "            app:cardCornerRadius=\"100dp\"\n" +
                        "            android:layout_height=\"120dp\">\n" +
                        "\n" +
                        "            <com.google.android.material.imageview.ShapeableImageView\n" +
                        "                android:layout_width=\"120dp\"\n" +
                        "                android:layout_height=\"120dp\"\n" +
                        "                android:layout_gravity=\"center\"\n" +
                        "                android:adjustViewBounds=\"true\"\n" +
                        "                android:scaleType=\"centerCrop\"\n" +
                        "                android:src=\"@drawable/fox\" />\n" +
                        "\n" +
                        "        </androidx.cardview.widget.CardView>\n" +
                        "\n" +
                        "\n" +
                        "        <RelativeLayout\n" +
                        "            android:id=\"@+id/mainlay\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:layout_below=\"@+id/imgg\"\n" +
                        "            android:visibility=\"gone\">\n" +
                        "\n" +
                        "            <TextView\n" +
                        "                android:layout_width=\"wrap_content\"\n" +
                        "                android:layout_height=\"wrap_content\"\n" +
                        "                android:layout_marginTop=\"15dp\"\n" +
                        "                android:id=\"@+id/txt11\"\n" +
                        "                android:text=\"@string/logname\"\n" +
                        "                android:textColor=\"@color/black\"\n" +
                        "                android:textSize=\"24dp\" />\n" +
                        "\n" +
                        "            <EditText\n" +
                        "                android:layout_width=\"match_parent\"\n" +
                        "                android:layout_height=\"wrap_content\"\n" +
                        "                android:layout_marginTop=\"30dp\"\n" +
                        "                android:layout_below=\"@+id/txt11\"\n" +
                        "                android:id=\"@+id/et11\"\n" +
                        "                android:background=\"@drawable/outline\"\n" +
                        "                android:drawableLeft=\"@drawable/ic_baseline_perm_identity_24\"\n" +
                        "                android:drawablePadding=\"5dp\"\n" +
                        "                android:hint=\"@string/usrhint\"\n" +
                        "                android:paddingLeft=\"15dp\" />\n" +
                        "\n" +
                        "            <EditText\n" +
                        "                android:id=\"@+id/et12\"\n" +
                        "                android:layout_width=\"match_parent\"\n" +
                        "                android:layout_height=\"wrap_content\"\n" +
                        "                android:layout_below=\"@+id/et11\"\n" +
                        "                android:layout_marginTop=\"10dp\"\n" +
                        "                android:background=\"@drawable/outline\"\n" +
                        "                android:drawableLeft=\"@drawable/ic_baseline_lock\"\n" +
                        "                android:drawablePadding=\"5dp\"\n" +
                        "                android:hint=\"@string/password\"\n" +
                        "                android:paddingLeft=\"15dp\" />\n" +
                        "\n" +
                        "            <androidx.appcompat.widget.AppCompatButton\n" +
                        "                android:layout_width=\"wrap_content\"\n" +
                        "                android:layout_height=\"wrap_content\"\n" +
                        "                android:layout_below=\"@+id/et12\"\n" +
                        "                android:layout_centerInParent=\"true\"\n" +
                        "                android:layout_gravity=\"center_vertical\"\n" +
                        "                android:layout_marginTop=\"24dp\"\n" +
                        "                android:background=\"@drawable/gradient\"\n" +
                        "                android:gravity=\"center\"\n" +
                        "                android:text=\"@string/login\"\n" +
                        "                android:textColor=\"@color/white\" />\n" +
                        "\n" +
                        "\n" +
                        "        </RelativeLayout>\n" +
                        "\n" +
                        "    </RelativeLayout>\n" +
                        "    <LinearLayout\n" +
                        "        android:id=\"@+id/lay2\"\n" +
                        "        android:layout_below=\"@+id/lay1\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:orientation=\"vertical\"\n" +
                        "        android:visibility=\"gone\">\n" +
                        "\n" +
                        "        <TextView\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:layout_gravity=\"center\"\n" +
                        "            android:layout_marginTop=\"20dp\"\n" +
                        "            android:text=\"@string/forget\"\n" +
                        "            android:textColor=\"@color/vio\" />\n" +
                        "\n" +
                        "        <LinearLayout\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:layout_gravity=\"center\"\n" +
                        "            android:layout_marginTop=\"50dp\"\n" +
                        "            android:gravity=\"center\"\n" +
                        "            android:orientation=\"horizontal\">\n" +
                        "\n" +
                        "\n" +
                        "            <TextView\n" +
                        "                android:layout_width=\"wrap_content\"\n" +
                        "                android:layout_height=\"wrap_content\"\n" +
                        "                android:layout_gravity=\"right\"\n" +
                        "                android:gravity=\"right\"\n" +
                        "                android:text=\"@string/register\"\n" +
                        "                android:textColor=\"@color/black\" />\n" +
                        "\n" +
                        "            <TextView\n" +
                        "                android:layout_width=\"wrap_content\"\n" +
                        "                android:layout_height=\"wrap_content\"\n" +
                        "                android:layout_gravity=\"right\"\n" +
                        "                android:gravity=\"right\"\n" +
                        "                android:id=\"@+id/regsterrr\"\n" +
                        "                android:text=\"@string/create\"\n" +
                        "                android:textColor=\"@color/vio\" />\n" +
                        "\n" +
                        "        </LinearLayout>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                startActivity(intent);
            }
        });

    }
}