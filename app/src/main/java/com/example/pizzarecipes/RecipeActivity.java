package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView title = findViewById(R.id.titleTextView);
        TextView recipe = findViewById(R.id.recipeTextView);
        TextView description = findViewById(R.id.descriptionTextView);
        ImageView image = findViewById(R.id.pizzaImageView);



        Intent intent = getIntent();
        if(intent != null){
            title.setText(intent.getStringExtra("title"));
            recipe.setText(intent.getStringExtra("recipe"));
            description.setText(intent.getStringExtra("description"));
            image.setImageResource(getIntent().getIntExtra("imageResource", R.id.pizzaImageView));
        }
    }
}
