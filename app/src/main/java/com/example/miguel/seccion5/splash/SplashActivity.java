package com.example.miguel.seccion5.splash;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import com.example.miguel.seccion5.activities.LoginActivity;
import com.example.miguel.seccion5.activities.MainActivity;
import com.example.miguel.seccion5.util.Util;

import org.w3c.dom.Text;

public class SplashActivity extends AppCompatActivity {

    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefs = getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        Intent intentLogin = new Intent(this, LoginActivity.class);
        Intent intentMain = new Intent(this, MainActivity.class);

        if(!TextUtils.isEmpty(Util.getUserMailPrefs(prefs)) && !TextUtils.isEmpty(Util.getUserPassPrefs(prefs))){
            startActivity(intentMain);
        }else{
            startActivity(intentLogin);
        }

        finish();
    }
}
