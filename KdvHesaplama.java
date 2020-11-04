import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double fiyat, kdvliFiyat, kdv= 0.18;
    System.out.println("Ürünün fiyatını giriniz : ");
    fiyat= input.nextDouble();
    kdvliFiyat= fiyat + (fiyat*kdv);
    System.out.println("Ürünün fiyatı: "+ kdvliFiyat);
    input.close();
    }
}
