import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        int a,b;
        double c,area,perimeter;
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Kenarı Giriniz: ");
        a=input.nextInt();
        System.out.print("İkinci Kenarı Giriniz: ");
        b=input.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        perimeter=a+b+c;
        area=(a*b)/2;
        System.out.println("Üçgeninizin 1.Kenarı: "+a);
        System.out.println("Üçgeninizin 2.Kenarı: "+b);
        System.out.println("Üçgeninizin Hipotenüsü: "+c);
        System.out.println("Üçgeninizin Çevresi: "+perimeter);
        System.out.println("Üçgeninizin alanı: "+area);
    }
}
