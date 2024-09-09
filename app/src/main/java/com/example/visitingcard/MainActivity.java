package com.example.visitingcard;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Phone icon click
        ImageView phoneIcon = findViewById(R.id.phone_icon);
        phoneIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + getString(R.string.phone)));
                startActivity(intent);
            }
        });

        // Email icon click
        ImageView emailIcon = findViewById(R.id.email_icon);
        emailIcon.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v)
            {Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + getString(R.string.email)));
                startActivity(intent);}
        });
        // Facebook icon click
        ImageView facebookIcon = findViewById(R.id.facebook_icon);
        facebookIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.facebook)));
                startActivity(intent);
            }
        });

        // GitHub icon click
        ImageView githubIcon = findViewById(R.id.github_icon);
        githubIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.github)));
                startActivity(intent);
            }
        });

        // LinkedIn icon click
        ImageView linkedinIcon = findViewById(R.id.linkedin_icon);
        linkedinIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.linkedin)));
                startActivity(intent);
            }
        });
    }
}