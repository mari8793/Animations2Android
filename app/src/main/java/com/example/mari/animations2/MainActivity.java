package com.example.mari.animations2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    ViewGroup theContainer;
    Scene scene1;
    Scene scene2;
    Transition transitionMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Colocamos la escena1
        theContainer= (ViewGroup) findViewById(R.id.container);
        transitionMgr = TransitionInflater.from(this).inflateTransition(R.transition.transition);

        scene1 = Scene.getSceneForLayout(theContainer, R.layout.scene1, this);
        scene1.enter();

        scene2 = Scene.getSceneForLayout(theContainer, R.layout.scene2, this);



    }

    public void goToScene2(View view){
        TransitionManager.go(scene2, transitionMgr);}
    public void goToScene1(View view){
        TransitionManager.go(scene1, transitionMgr);}
}
