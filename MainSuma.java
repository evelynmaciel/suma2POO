import java.util.Scanner;
public class MainSuma {
    public static void main(String[]args){
        Scanner opc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int a= opc.nextInt();
        System.out.println("Ingresa el segundo numero");
        int b= opc.nextInt();
        Suma s1 = new Suma();
        s1.setA(a);
        s1.setB(b);
        System.out.println(s1.sumar());
        System.out.println(s1.toString());
    }
}