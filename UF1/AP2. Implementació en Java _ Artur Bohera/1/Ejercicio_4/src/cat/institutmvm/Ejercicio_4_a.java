/* 
* Nom: Artur
* Cognoms: Bohera Viejo
* INS Manuel Vázquez Montalbán
* Data d’edició: 26/10/2022
* Nom del cicle formatiu: Administració de Sistemes Informàtics i Xarxes
* Nom del mòdul: M03. Programació
*/

package cat.institutmvm;
import java.util.Scanner;

public class Ejercicio_4_a {  
    private static final String MSG_1 = "Introduce un número: ";
    private static final String MSG_2 = "Error: el número introducido no se encuentra dentro del intervalo 1-12 incluidos.";

    public static void main(String[] args) {
        int numMonth;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        numMonth = sc.nextInt();
        if (numMonth == 1){
                System.out.println("Enero");
        }
        else {
            if (numMonth == 2){
                System.out.println("Febrero");
            }
            if (numMonth == 3){
                System.out.println("Marzo");
            }
            if (numMonth == 4){
                System.out.println("Abril");
            }
            if (numMonth == 5){
                System.out.println("Mayo");
            }
            if (numMonth == 6){
                System.out.println("Junio");
            }
            if (numMonth == 7){
                System.out.println("Julio");
            }
            if (numMonth == 8){
                System.out.println("Agosto");
            }
            if (numMonth == 9){
                System.out.println("Septiembre");
            }
            if (numMonth == 10){
                System.out.println("Octubre");
            }
            if (numMonth == 11){
                System.out.println("Noviembre");
            }
            if (numMonth == 12){
                System.out.println("Diciembre");
            }
            else {
                if (numMonth < 1 || numMonth > 12){
                    System.out.println(MSG_2);
                }
            }
        }
    }
}
