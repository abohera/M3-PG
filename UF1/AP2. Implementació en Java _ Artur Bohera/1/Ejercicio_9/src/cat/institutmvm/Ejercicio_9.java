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

public class Ejercicio_9 {  
    private static final String MSG_1 = "Introduce un numero (Escribe '0' para terminar): ";
    private static final String MSG_2 = "La media es: ";
    
    public static void main(String[] args) {
        int num, count= 0, sum= 0 ;
        Scanner userNum = new Scanner(System.in);
        do {
            System.out.println(MSG_1);
            num = userNum.nextInt();
            count++;
            sum = sum + num;
        } while(num != 0);
        System.out.println(MSG_2 + (sum/count));
    }
}
