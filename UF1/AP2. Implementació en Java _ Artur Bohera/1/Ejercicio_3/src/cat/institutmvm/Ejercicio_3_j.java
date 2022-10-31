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

public class Ejercicio_3_j {
    private static final String MSG_1 = "Introduce el primer número: ";
    private static final String MSG_2 = "Introduce el segundo número: ";
    private static final String MSG_3 = "Introduce el tercer número: ";
    private static final String MSG_4 = "El múmero máximo es: ";

    public static void main(String[] args) {
        int num1, num2, num3, max = 0;
        Scanner userNum = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = userNum.nextInt();
        System.out.println(MSG_2);
        num2 = userNum.nextInt();
        System.out.println(MSG_3);
        num3 = userNum.nextInt();
        if (num1 > num2){
            max = num1;
        }
        else {
            max = num2;
        }
        if (max > num3){
            System.out.println(MSG_4 + max);
        }
        else {
            System.out.println(MSG_4 + num3);
        }
    }
}