package pl.sda.javastart.PROGRAMOWANIE1.day4.Shop;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class MainShop {
    public static User user;
    public static ProductService productService = new ProductService();
    public static final Scanner scanner = new Scanner(System.in);
    public static UserService userService = new UserService();
    public static CartService cartService = new CartService();

    public static void main(String[] args) {


        initProducts();
        start();


    }

    private static void start() {
        if (user == null) {
            inicialMenu();
        } else {
            loggedMenu();
        }
    }

    private static void showCartProducts() {
        Set<CartProduct> cartProducts = cartService.getCartProducts();
        cartProducts.stream()
                .map(CartProduct::viewProduct)
                .forEach(System.out::println);
        start();
    }

    private static void initProducts() {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        product1.setId(1L);
        product2.setId(2L);
        product3.setId(3L);
        product4.setId(4L);
        product1.setName("chleb");
        product2.setName("śledź");
        product3.setName("paluszki");
        product4.setName("dziecko");
        product1.setPrice(new BigDecimal("2.04"));
        product2.setPrice(new BigDecimal("3.5"));
        product3.setPrice(new BigDecimal("4.6"));
        product4.setPrice(new BigDecimal("3.55"));
        productService.addAll(product1, product2, product3, product4);


    }

    private static void loggedMenu() {
        System.out.println("Wybierz opcje: ");
        System.out.println("1.Zakoncz");
        System.out.println("2.Pokaż dostępne produkty");
        System.out.println("3. Dodaj do koszyka produkt");
        System.out.println("4.Podaj zawarotsc koszyka");
        Integer choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.exit(0);
            case 2:
                showProducts();
            case 3:
                addtoCart();
            case  4:
                showCartProducts();
                break;
            default:
                System.out.println("Wybrałeś nieprawidłową opcje");

        }
        start();                         //zeby aplikacja sie powtarzała
    }

    private static void addtoCart() {
        System.out.println("Podaj ID produktu");
        Long productId = scanner.nextLong();
        Optional<Product> product = productService.getById(productId);
        product.ifPresent(cartService::addProduct);
        if (!product.isPresent()) {
            System.out.println("Nie ma takiego produktu, podaj prawidłowe ID");
        } else {
            System.out.println("Dodano produkt.");
        }


        start();
    }

    private static void showProducts() {
        productService.showListOfProducts();
    }


    private static void inicialMenu() {
        System.out.println("Wybierz opcję: ");
        System.out.println("1.Zaloguj");
        System.out.println("2.Zarejestruj");
        System.out.println("3.Zakoncz");

        Integer choice = scanner.nextInt();

        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Wybrałeś nieprawidłową opcję!");


        }

        start();
    }

    private static void login() {

        System.out.println("Podaj LOGIN");
        String login = scanner.next();
        System.out.println("Podaj HASŁO");
        String password = scanner.next();
        boolean ifSuccess = userService.login(login, password);
        if (ifSuccess) {
            System.out.println("Udało się zalogowac");
        } else {
            System.out.println("Nie udało się zalogowac");
        }


    }

    private static void register() {
        System.out.println("Podaj LOGIN");
        String login = scanner.next();
        System.out.println("Podaj HASŁO");
        String password = scanner.next();
        boolean ifSuccess = userService.registration(login, password);
        if (ifSuccess) {
            System.out.println("Udało się zarejestrować");
        } else {
            System.out.println("Nie udało się zarejestrować");
        }


    }
}
