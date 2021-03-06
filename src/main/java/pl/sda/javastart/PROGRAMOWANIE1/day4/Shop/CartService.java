package pl.sda.javastart.PROGRAMOWANIE1.day4.Shop;

import pl.sda.javastart.day4.Car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CartService {

    private Map<Long, Cart> carts = new HashMap<>();
    private Map<Long, List<Cart>> oldCarts = new HashMap<>();


    public void addProduct(Product product) {
        Cart currentCart = getCart();
        currentCart.addProduct(product);
        addCartToMap(currentCart);

    }

    public Set<CartProduct> getCartProducts(){
       return getCart().getCartProducts();

    }

    public Cart getCart() {
        return carts.getOrDefault(MainShop.user.getId(), new Cart(MainShop.user));

    }

    private void addCartToMap(Cart newCart) {
        carts.put(MainShop.user.getId(), newCart);

    }
}
