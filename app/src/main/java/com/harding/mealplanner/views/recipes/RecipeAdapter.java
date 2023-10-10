package com.harding.mealplanner.views.recipes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.harding.mealplanner.R;
import com.harding.mealplanner.domain.Recipe;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    private List<Recipe> recipes;

    public static class RecipeViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView name;
        ImageView image;

        public RecipeViewHolder(View v) {
            super(v);
            view = v;
            name = v.findViewById(R.id.recipe_name);
            image = v.findViewById(R.id.recipe_image);
        }
    }

    public RecipeAdapter(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclable_recipe, parent, false);
        RecipeViewHolder vh = new RecipeViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        final Recipe recipe = recipes.get(position);

        holder.name.setText(recipe.getName());

    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }
}
