import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        /*Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.*/

        String kullaniciAdi, sifre;
        boolean girisYapildi = false;
        boolean cikis = true;
        int islem = 0;
        int bakiye = 1500;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanici adinizi giriniz = ");

        kullaniciAdi = inp.nextLine();

        System.out.println("Sifrenizi giriniz = ");

        sifre = inp.nextLine();

        if(kullaniciAdi.equals("patika") && sifre.equals("dev123")){
            System.out.println("Giris basarili");
            girisYapildi = true;
        }else{
            System.out.println("Giris bilgileri gecerisiz");
            return;
        }

        while(cikis){
            System.out.println("Yapmak istediginiz islemi giriniz");
            System.out.println("1-Para Yatirma\n 2-Para Cekme\n 3-Bakiye Sorgulama\n 4-Cikis Yap");
            islem = inp.nextInt();
            switch(islem){
                case 1: {
                    System.out.println("Yatirmak istediginiz tutari giriniz = ");
                    int tutar = inp.nextInt();
                    bakiye = bakiye + tutar;
                    System.out.println("Yeni hesap bakiyeniz = "+bakiye+"TL");
                    break;
                }
                case 2: {
                    System.out.println("Cekmek istediginiz tutari giriniz = ");
                    int tutar = inp.nextInt();
                    if(tutar > bakiye ){
                        System.out.println("Yetersiz bakiye");
                    }else{
                        bakiye = bakiye - tutar;
                        System.out.println("Hesabinizdan basariyla cekilmistir. Yeni bakiyeniz = "+bakiye+"TL");
                    }
                    break;

                }
                case 3:{
                    System.out.println("Hesabinizdaki bakiye = "+bakiye+"TL");
                    break;
                }
                case 4:{
                    System.out.println("Cikis yapiliyor");
                    cikis = false;
                    break;
                }
                default:{
                    System.out.println("Gecersiz islem girisi");
                    break;
                }

            }
        }







    }
}
