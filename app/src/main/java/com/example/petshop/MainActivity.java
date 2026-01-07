package com.example.petshop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

        //Pet pet = new Pet("Alex");
        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");

        java.util.ArrayList<Pet> petList = new java.util.ArrayList<>();

        petList.add(cat);
        petList.add(dog);

        Scorpion scorpion = new Scorpion("Phil");
        petList.add(scorpion);

        java.util.ArrayList<Pettable> pettablePets = new java.util.ArrayList<>();
        pettablePets.add(cat);
        pettablePets.add(dog);
        //pettablePets.add(scorpion); will produce error bc Scorpion does not implement Pettable

        Mood mood1 = new HappyMood();
        Mood mood2 = new SadMood(new java.util.Date());

        System.out.println(mood1.getMoodString());
        System.out.println(mood2.getMoodString());




    }
}