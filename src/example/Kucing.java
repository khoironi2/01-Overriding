package example;
public class Kucing extends Hewan {
    String suara;
    void setSuara(String x){
        this.suara = x;
    }
    
    @Override
    void setNama(String x){
        // this.nama = x;
        super.nama = x;
    }
    @Override
    void show(){
        System.out.println("Nama Kucing : " + this.nama + " Suara : " + this.suara);
    }

    
}
