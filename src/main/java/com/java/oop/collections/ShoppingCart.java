package com.java.oop.collections;

import java.util.List;

public class ShoppingCart {
    private int cartId;
    private List<Product> products;

    public ShoppingCart(int cartId, List<Product> products) {
        this.cartId = cartId;
        this.products = products;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
