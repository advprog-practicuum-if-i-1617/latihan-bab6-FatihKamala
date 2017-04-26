package Praktikum6;
public class Enjineer extends Pegawai {
    private long bonus;
    private long tunjangan;
    public Enjineer(String name, int tahun){
        super(name, tahun);
        bonus = 300000;
        tunjangan = 5500000;
    }
    private long getBonus(){
        return 300000;
    }
    private long gettunjangan(){
        return 5500000;
    }
    public long gajiTotal1(){
        gaji1 = gajiPokok()+getBonus()+gettunjangan();
        return gaji1;
    }
    public long gajiTotal2(){
        gaji2 = gajiPokok()+bonus()+getBonus()+gettunjangan();
        return gajiPokok()+bonus()+getBonus()+gettunjangan();
    }
    
}
