import java.util.Scanner;

public class VizeHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Vize notunu giriniz: ");
        int vize= input.nextInt();
        var vizef= vize*40/100;
        
        System.out.println("Final notunu giriniz: ");
        int final1= input.nextInt();
        var finalf= final1*40/100;

        System.out.println("Quiz notunu giriniz: ");
        int quiz= input.nextInt();
        var quizf= quiz*20/100;

        var ortalama= vizef+finalf+quizf;
        System.out.println("Not ortalamanız: "+ ortalama);
        String sonuc = (ortalama>= 50) ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);
        input.close();

    }
    
}
