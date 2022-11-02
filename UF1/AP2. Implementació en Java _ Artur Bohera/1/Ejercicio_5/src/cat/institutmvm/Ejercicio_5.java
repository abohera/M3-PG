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

public class Ejercicio_5 {
    private static final String MSG_1 = "Introduce un año: ";
    private static final String MSG_2 = "El año es bisiesto.";
    private static final String MSG_3 = "El año no es bisiesto.";
    
    public static void main(String[] args) {
        int year;
        Scanner userYear = new Scanner(System.in);
        System.out.println(MSG_1);
        year = userYear.nextInt();
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
            System.out.println(MSG_2);
        }
        else{
            System.out.println(MSG_3);
        }
    }
}
