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

public class Ejercicio_3_k {
    private static final String MSG_1 = "Introduce el primer número: ";
    private static final String MSG_2 = "Introduce el segundo número: ";
    private static final String MSG_3 = "El primer número es multiplo del segundo";
    private static final String MSG_4 = "El segundo número es multiplo del primero";

    public static void main(String[] args) {
        int num1, num2;
        Scanner userNum = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = userNum.nextInt();
        System.out.println(MSG_2);
        num2 = userNum.nextInt();
        if ((num1 % num2) == 0){
            System.out.println(MSG_3);
        }
        else {
            if ((num2 % num1) == 0){
                System.out.println(MSG_4);
            }
        }
    }
}