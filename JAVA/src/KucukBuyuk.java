import java.util.Scanner;

public class KucukBuyuk {
    public static void main(String[] args) {
        int a, b, c;
        Scanner inp = new Scanner(System.in);
        System.out.println("Ilk sayiyi girin:");
        a = inp.nextInt();
        System.out.println("Ikinci sayiyi girin:");
        b = inp.nextInt();
        System.out.println("Ucuncu sayiyi girin:");
        c = inp.nextInt();
        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + "<" + b + "<" + c);
            } else {
                System.out.println(a + "<" + c + "<" + b);
            }
        }
        else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + "<" + a + "<" + c);
            }
            else{
                System.out.println(b+"<"+c+"<"+a);
            }
        }
        else if(c<a && c<b){
            if (a<b){
                System.out.println(c+"<"+a+"<"+b);
            }
            else{
                System.out.println(c+"<"+b+"<"+a);
            }
        }
        else if(a==b && a==c){
            System.out.println(a+"="+b+"="+c);
        }

    }
}
