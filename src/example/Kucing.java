package example;
public class Kucing extends Hewan {
    
    @Override
    void setNama(String x){
        // this.nama = x;
        super.nama = x;
    }
    @Override
    void show(){
        System.out.println("Nama Kucing : " + this.nama);
    }

    
}
