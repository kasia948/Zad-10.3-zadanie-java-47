import java.io.*;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("products.csv");
        Scanner scan = new Scanner(new File ("products.csv"));

        String tekst ="";
        while (scan.hasNextLine()) {
            Product[] array = new Product[3];
            array[0] = new Product(scan.nextLine(), scan.nextLine(), scan.nextInt());
            System.out.println(array[0].getNazwa()+" "+array[0].getProducent()+" "+array[0].getCena());
        }
    }
}
