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

public class Ejercicio_3_e {
    private static final String MSG_1 = "Introduce un número: ";
    private static final String MSG_2 = "El número no esta dentro del intervalo 25 y 50.";

    public static void main(String[] args) {
        int num;
        Scanner userNum = new Scanner(System.in);
        System.out.println(MSG_1);
        num = userNum.nextInt();
        if (num < 25 || num > 50){
            System.out.println(MSG_2);
        }
    }
}