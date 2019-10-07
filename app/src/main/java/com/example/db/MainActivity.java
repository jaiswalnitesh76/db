package com.example.db;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.db.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User1 user;
    ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User1();
        user.setName("Ravi Tamada");
        user.setEmail("ravi@androidhive.info");
        binding.setUser(user);
    }
}
