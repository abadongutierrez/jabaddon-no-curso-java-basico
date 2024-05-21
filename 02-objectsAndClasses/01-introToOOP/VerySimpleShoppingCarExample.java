
import java.math.BigDecimal;

void main() {
    // producto (Product)
    // - name, price
    // carrito de compras (ShoppingCart)
    // - add product -> total $
    // - add product(quantity) -> total $

    Product laptop = new Product();
    laptop.name = "Laptop";
    laptop.price = new BigDecimal("20000.00");

    Product mouse = new Product();
    mouse.name = "Mouse";
    mouse.price = new BigDecimal("500.00");

    Product keyboard = new Product();
    keyboard.name = "Keyboard";
    keyboard.price = new BigDecimal("1500.00");

    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.addProduct(laptop);
    shoppingCart.addProduct(mouse, 2);
    shoppingCart.addProduct(keyboard, 1);

    System.out.println("Total = " + shoppingCart.total);
}

class Product {
    String name;
    BigDecimal price;
}

class ShoppingCart {
    BigDecimal total;

    // Constructor
    ShoppingCart() {
        total = new BigDecimal("0.00");
    }   

    void addProduct(Product product) {
        total = total.add(product.price);
    }

    void addProduct(Product product, int quantity) {
        total = total.add(product.price.multiply(new BigDecimal(quantity)));
    }
}

