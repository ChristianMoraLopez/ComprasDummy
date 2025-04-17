package com.example.onlinestore;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.onlinestore.databinding.ActivityShoppingCartBinding;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartActivity extends AppCompatActivity {
    private ActivityShoppingCartBinding binding;
    private CartAdapter cartAdapter;
    private List<Product> cartItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShoppingCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupRecyclerView();
        loadCartItems();
        setupCheckoutButton();
        setupToolbar();
    }

    private void setupRecyclerView() {
        cartItems = new ArrayList<>();
        cartAdapter = new CartAdapter(cartItems, this::onItemRemoved);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(cartAdapter);
    }

    private void loadCartItems() {
        // TODO: Implementar carga de items del carrito desde base de datos
        cartItems.add(new Product("Venus HD Make-up & Perfume", 89.99, "https://images.pexels.com/photos/2697786/pexels-photo-2697786.jpeg"));
        cartItems.add(new Product("Reloj de Lujo", 299.99, "https://images.pexels.com/photos/2783873/pexels-photo-2783873.jpeg"));
        cartItems.add(new Product("Set de Pinturas Profesional", 49.99, "https://images.pexels.com/photos/1749452/pexels-photo-1749452.jpeg"));
        cartItems.add(new Product("Audífonos Premium", 129.99, "https://images.pexels.com/photos/3587478/pexels-photo-3587478.jpeg"));
        cartItems.add(new Product("Anillo de Diamante", 599.99, "https://images.pexels.com/photos/2849742/pexels-photo-2849742.jpeg"));
        updateTotal();
        cartAdapter.notifyDataSetChanged();
    }

    private void setupCheckoutButton() {
        binding.toolbar.setOnClickListener(v -> {
            if (cartItems.isEmpty()) {
                Toast.makeText(this, "El carrito está vacío", Toast.LENGTH_SHORT).show();
                return;
            }
            // TODO: Implementar proceso de pago
            Toast.makeText(this, "Proceso de pago iniciado", Toast.LENGTH_SHORT).show();
        });
    }

    private void onItemRemoved(Product product) {
        cartItems.remove(product);
        updateTotal();
        cartAdapter.notifyDataSetChanged();
    }

    private void updateTotal() {
        double total = 0;
        for (Product item : cartItems) {
            total += item.getPrice();
        }
        binding.totalTextView.setText(String.format("Total: $%.2f", total));
    }

    private void setupToolbar() {
        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setLogo(R.drawable.logo2);
            getSupportActionBar().setDisplayUseLogoEnabled(true);
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }
} 