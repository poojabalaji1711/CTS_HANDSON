import java.util.Arrays;
import java.util.Comparator;


public class SearchProduct {

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {
        for (Product product : products) {
            if (product.productId == id) {
                return product;
            }
        }
        return null;
    }

    
    public static Product binarySearch(Product[] products, int id) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            } else if (products[mid].productId < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(108, "Shoes", "Fashion"),
                new Product(101, "Book", "Education"),
                new Product(110, "Watch", "Accessories")
        };

        int searchId = 102;

    
        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, searchId);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product Not Found");
        }

        // Sort array for Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        // Binary Search
        System.out.println("\nBinary Search Result:");
        Product result2 = binarySearch(products, searchId);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product Not Found");
        }

      
        System.out.println("\nTime Complexity Analysis:");
        System.out.println("Linear Search - Best: O(1), Average: O(n), Worst: O(n)");
        System.out.println("Binary Search - Best: O(1), Average: O(log n), Worst: O(log n)");
        System.out.println("Binary Search is more suitable for large sorted datasets because it reduces the search space by half in every step.");
    }
}