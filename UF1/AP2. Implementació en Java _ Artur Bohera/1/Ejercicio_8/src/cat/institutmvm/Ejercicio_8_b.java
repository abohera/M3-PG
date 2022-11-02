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

public class Ejercicio_8_b {  
    private static final String MSG_1 = "¿Cuantos números vas a introducir?: ";
    private static final String MSG_2 = "Introduce un número: ";
     
    public static void main(String[] args) {
        int num = 0, count, i;
        Scanner numCount = new Scanner(System.in);
        Scanner userNum = new Scanner(System.in);
        System.out.println(MSG_1);
        count = numCount.nextInt();
        for(i = 0; i < count; i++){
            System.out.println(MSG_2);
            num = userNum.nextInt();
        }
    }
}
