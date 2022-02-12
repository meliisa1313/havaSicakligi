package Giris;

import java.util.Scanner;
//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
public class Baslangic {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input=new Scanner(System.in);
        System.out.println("bir sicaklik degeri giriniz");
        sicaklik=input.nextInt();
        if(sicaklik<5){
            System.out.println("kayak yap");
        }
        else if ((5<sicaklik)&&(sicaklik<15)){
            System.out.println("sinema");
        }
        else if((15<sicaklik)&&(sicaklik<25)){
            System.out.println("piknik");
        }
        else
        {
            System.out.println("yuzme");
        }





        }






    }

