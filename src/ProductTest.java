import java.io.*;

public class ProductTest {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("products.csv");
        BufferedReader bfr = new BufferedReader(fileReader);
        String line = null;

        Product[] tablica = new Product[3];

        for (int i = 0; i < 3; i++) {
            line = bfr.readLine(); //wczytuje linię tekstu
            String[] daneProduktu = line.split(";"); //dzieli tekst po średniku
            Product prod = new Product(daneProduktu[0], daneProduktu[1], Integer.valueOf(daneProduktu[2]));
            tablica[i] = prod;
        }
        bfr.close();
        System.out.println(tablica[0].getNazwa() + " " + tablica[0].getProducent() + " " + tablica[0].getCena());
        System.out.println(tablica[1].getNazwa() + " " + tablica[1].getProducent() + " " + tablica[1].getCena());
        System.out.println(tablica[2].getNazwa() + " " + tablica[2].getProducent() + " " + tablica[2].getCena());

        double sumPrices=0;
        for (int i=0; i<tablica.length; i++){
            sumPrices= sumPrices+tablica[i].calculateSum();
        }
        System.out.println("Suma cen wszystkich produktów to "+sumPrices);

        int maxPrice= 0;
        for (int i = 0; i < tablica.length; i++) {
            if (maxPrice<tablica[i].getCena()){
                maxPrice=tablica[i].getCena();
            }
        }
        System.out.println("Najwyższa cena to "+maxPrice);
    }
}


