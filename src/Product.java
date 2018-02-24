public class Product {
    private String nazwa;
    private String producent;
    private  int cena;

    public Product(String nazwa, String producent, int cena) {
        this.nazwa = nazwa;
        this.producent = producent;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getProducent() {
        return producent;
    }
    public void setProducent(String producent) {
        this.producent = producent;
    }

    public int getCena() {
        return cena;
    }
    public void setCena(int cena) {
        this.cena = cena;
    }

    public int calculateSum(){
            return getCena();
        }
}