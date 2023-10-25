package example;

public class KucingHutan extends Kucing {

    @Override
    void setSuara(String x){
        super.suara = x;
    }
    
    @Override
    void setNama(String x){
        // this.nama = x;
        super.nama = x;
    }
    @Override
    void show(){
        System.out.println("Nama Kucing : " + this.nama + " Suara Kucing Hutan : " + this.suara);
    }
}
