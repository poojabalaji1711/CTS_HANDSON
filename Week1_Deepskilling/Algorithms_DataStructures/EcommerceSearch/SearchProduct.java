public class SearchProduct {

    public static Product linearSearch(Product[] products, String target) {

        for (Product product : products) {
            if (product.name.equalsIgnoreCase(target)) {
                return product;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories")
        };

        String searchItem = "Phone";

        Product result = linearSearch(products, searchItem);

        if (result != null) {
            System.out.println("Product Found");
            System.out.println("ID: " + result.id);
            System.out.println("Name: " + result.name);
            System.out.println("Category: " + result.category);
        } else {
            System.out.println("Product Not Found");
        }
    }
}