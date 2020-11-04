import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        double yarıcap, pi= 3.14;
        System.out.println("Yarıçap giriniz: ");
        yarıcap= input.nextDouble();

        var cevre= (yarıcap*2*pi);
        System.out.println("Çevre: "+cevre);

        var alan= (pi*yarıcap*yarıcap);
        System.out.println("Alan: "+ alan);
        input.close();
    }
    
}
