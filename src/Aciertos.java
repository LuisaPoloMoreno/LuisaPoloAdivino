import java.util.Scanner;

public class Aciertos {
			//correccion y propuesta
    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (10+50 *Math.random());//(Math.random() * (50 - 10 + 1)) +10;
        //System.out.print(x); 
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
