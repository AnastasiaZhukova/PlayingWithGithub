package com.github.anastasiazhukova.playingwithgihub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SomeMethod()
    {
        //I'm Branch2 and I'm making a change in all methods
        //Creating new method from master Branch
    }

    public void FeatureOne()
    {
        //I'm Branch2 and I'm making a change in all methodss
        //Creating new method from Feature1 branch
    }
    public void FeatureTwo()
    {
        //I'm Branch2 and I'm making a change in all methods
        //Creating new method from Feature2 branch
    }
    public void FeatureThree()
    {
        //I'm Branch2 and I'm making a change in all methods
        //Creating new method from Feature3 branch
    }
}
