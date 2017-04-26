package Praktikum6;
import java.util.*;
public class Pegawai {
    private String name;
    private int tahun;
    public long gaji1=0;
    public long gaji2=0;
    
    public Pegawai(String name, int tahun){
        this.name= name;
        this.tahun= tahun;
        
    }
    public long bonus(){
        if (tahun>5)
            return 500000;
        else
            return 0;
    }
    public String getName(){
        return name;
    }
    public long gajiPokok(){
        return 2500000;
    }
    public int getTahun(){
        return tahun;
    }
    public long getGaji1(){
        return gaji1;
    }
    public long getGaji2(){
        return gaji2;
    }
    
}
