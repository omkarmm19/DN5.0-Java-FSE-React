import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        Product result1 = linearSearch(products, "Shoes");
        if (result1 != null) {
            System.out.println("Linear Search Found: " + result1.productName);
        }

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        Product result2 = binarySearch(products, "Shoes");
        if (result2 != null) {
            System.out.println("Binary Search Found: " + result2.productName);
        }

        System.out.println();
        System.out.println("Complexity Analysis");
        System.out.println("Linear Search : O(n)");
        System.out.println("Binary Search : O(log n)");
    }
}