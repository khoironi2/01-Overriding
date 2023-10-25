package example;

public class Main {
   public static void main(String[] args) {
    Kucing k1 = new Kucing();
    k1.nama = "loli";
    k1.show();

    k1.setNama("Fatah"); // setter 
    k1.show();

    Kucing k2 = new Kucing();
    k2.setNama("Kucing Biasa");
    k2.setSuara("Hmmmm");
    k2.show();

    KucingHutan k3 = new KucingHutan();
    k3.setNama("Kucing Hutan gaes");
    k3.setSuara("Rawrr...");
    k3.show();
   }
}
