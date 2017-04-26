package Praktikum6;
import java.util.Scanner;
public class MainPegawai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("========== Perusahaan X ==========");
        System.out.print("Nama : "); String nama = in.nextLine();
        System.out.print("1. Software Engineer\n2. Project manager\nPosisi : ");
        int pilih = in.nextInt();
        System.out.print("Tahun ke : ");
        int tahun = in.nextInt();
        Pegawai employ = new Pegawai(nama, tahun);
        System.out.println("===================================");
        switch(pilih){
            case 1:
                System.out.println(employ.getName()+" Seorang Software Engineer \nyang telah bekerja selama "
                        +employ.getTahun()+" tahun \nmendapat gaji sebesar "+employ.getGaji1());
                System.out.println(employ.getName()+" Seorang Software Engineer \nyang telah bekerja selama "
                        +employ.getTahun()+" tahun \nmendapat gaji sebesar "+employ.getGaji2()+" pada bulan ke2");
                break;
            case 2:
                System.out.println(employ.getName()+" Seorang Project manager\nyang telah bekerja selama "
                        +employ.getTahun()+" tahun \nmendapat gaji sebesar "+employ.getGaji1());
                System.out.println(employ.getName()+" Seorang Project manager\nyang telah bekerja selama "
                        +employ.getTahun()+" tahun \nmendapat gaji sebesar "+employ.getGaji2()+" pada bulan ke2");
                break;
        }
    }
    
}
