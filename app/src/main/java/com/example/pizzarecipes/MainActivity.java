package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.text.CaseMap;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();

        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza1_marghuerita, Utils.PIZZA_1_TITLE, Utils.PIZZA_1_DESCRIPTION, Utils.PIZZA_1_RECIPE));

    }
}
