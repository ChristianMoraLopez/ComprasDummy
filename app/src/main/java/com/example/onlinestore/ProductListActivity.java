package com.example.onlinestore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.onlinestore.databinding.ActivityProductListBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ProductListActivity extends AppCompatActivity {

    private ActivityProductListBinding binding;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Set up the toolbar
        setupToolbar();

        // Configurar RecyclerView
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productAdapter = new ProductAdapter(getSampleProducts());
        binding.recyclerView.setAdapter(productAdapter);

        binding.fab.setOnClickListener(v -> {
            Intent intent = new Intent(ProductListActivity.this, ShoppingCartActivity.class);
            startActivity(intent);
        });
    }

    private void setupToolbar() {
        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            // Usar logo2.xml como logo principal
            getSupportActionBar().setLogo(R.drawable.logo2);
            getSupportActionBar().setDisplayUseLogoEnabled(true);
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    private List<Product> getSampleProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Venus HD Make-up & Perfume", 89.99, "https://images.pexels.com/photos/2697786/pexels-photo-2697786.jpeg"));
        products.add(new Product("Reloj de Lujo", 299.99, "https://images.pexels.com/photos/2783873/pexels-photo-2783873.jpeg"));
        products.add(new Product("Set de Pinturas Profesional", 49.99, "https://images.pexels.com/photos/1749452/pexels-photo-1749452.jpeg"));
        products.add(new Product("Audífonos Premium", 129.99, "https://images.pexels.com/photos/3587478/pexels-photo-3587478.jpeg"));
        products.add(new Product("Anillo de Diamante", 599.99, "https://images.pexels.com/photos/2849742/pexels-photo-2849742.jpeg"));
        return products;
    }

    private class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
        private List<Product> products;

        public ProductAdapter(List<Product> products) {
            this.products = products;
        }

        @Override
        public ProductViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
            View view = getLayoutInflater().inflate(R.layout.item_product, parent, false);
            return new ProductViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ProductViewHolder holder, int position) {
            Product product = products.get(position);
            holder.productNameTextView.setText(product.getName());
            holder.productPriceTextView.setText(String.format("$%.2f", product.getPrice()));
            
            // Cargar imagen con Glide
            Glide.with(ProductListActivity.this)
                .load(product.getImageUrl())
                .centerCrop()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into(holder.productImageView);
        }

        @Override
        public int getItemCount() {
            return products.size();
        }

        class ProductViewHolder extends RecyclerView.ViewHolder {
            ImageView productImageView;
            TextView productNameTextView;
            TextView productPriceTextView;

            public ProductViewHolder(View itemView) {
                super(itemView);
                productImageView = itemView.findViewById(R.id.productImage);
                productNameTextView = itemView.findViewById(R.id.productName);
                productPriceTextView = itemView.findViewById(R.id.productPrice);
                
                itemView.setOnClickListener(v -> {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        Product product = products.get(position);
                        Toast.makeText(ProductListActivity.this, 
                            "Producto agregado al carrito: " + product.getName(), 
                            Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    }
} 