package com.apps.franco.drajasmin;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.List;

import static com.apps.franco.drajasmin.R.layout.activity_productos;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView linkinstagram = (ImageView) findViewById(R.id.instaImage);

        linkinstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                if (launchIntent != null) {
                    try {
                        startActivity(launchIntent);
                    } catch (ActivityNotFoundException ex) // in case Instagram not installed in your device
                    {
                        ex.printStackTrace();
                    }
                }

                Uri uri = Uri.parse("https://www.instagram.com/trueskinestetica1/?hl=es");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.instagram.com/trueskinestetica1/?hl=es")));
                }

            }
        });

        ImageView webIntent = (ImageView) findViewById(R.id.internetImage);
        webIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://trueskin-estetica.com/"));
                startActivity(browserIntent);

            }
        });

        ImageView linkFacebook = (ImageView) findViewById(R.id.facebookImage);
        linkFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                if (launchIntent != null) {
                    try {
                        startActivity(launchIntent);
                    } catch (ActivityNotFoundException ex) // in case facebook not installed in your device
                    {
                        ex.printStackTrace();
                    }
                }

                Uri uri = Uri.parse("https://www.facebook.com/newcosmiatria/");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.facebook.katana");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.facebook.com/newcosmiatria/")));
                }

            }
        });

        Button callButton =(Button)findViewById(R.id.contacto);

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:3023891427"));
                startActivity(intent);
            }
        });

        Button ingresa= (Button)findViewById(R.id.ingresa);

        ingresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresa=new Intent(getBaseContext(),Productos.class);
                startActivity(ingresa);
            }
        });


    }
}