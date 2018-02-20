import java.io.*;

public class ProductTest {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("products.csv");
        BufferedReader bfr = new BufferedReader(fileReader);
        String line = null;

        Product[] tablica = new Product[3];

        while ((line = bfr.readLine()) != null) {
            String[] daneProduktu = line.split(";");
                Product prod = new Product(daneProduktu[0], daneProduktu[1], Integer.valueOf(daneProduktu[2]));
                System.out.println(prod.getNazwa() + " " + prod.getProducent() + " " + prod.getCena());
                for (int i = 0; i <= 2; i++) {
                    tablica[i] = new Product(prod.getNazwa(), prod.getProducent(), prod.getCena());
                }
        }
        bfr.close();
        System.out.println(tablica[0].toString());
        System.out.println(tablica[1].toString());
        System.out.println(tablica[2].toString());

        int sum = 0;
        for (int i = 0; i <= 2; i++) {
            sum = sum + tablica[i].calculateSum();
        }
    }
}


