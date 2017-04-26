package Praktikum6;
public class Manajer extends Pegawai {
    private double bonus;
    private double tunjangan;
    public Manajer(String name, int tahun){
        super(name, tahun);
    } 
    private long tahun(){
        if (super.getTahun()>10)
            return 700000;
        else
            return 0;
    }
    private long gettunjangan(){
        return 6000000;
    }
    private long getBonus(){
        return 450000;
    }
    public long gajiTotal1(){
        gaji1 = gajiPokok()+tahun()+gettunjangan()+getBonus();
        return gajiPokok()+tahun()+gettunjangan()+getBonus();
    }
    public long gajiTotal2(){
        gaji2 = gajiPokok()+bonus()+tahun()+gettunjangan()+getBonus();
        return gajiPokok()+bonus()+tahun()+gettunjangan()+getBonus();
    }
    
}
