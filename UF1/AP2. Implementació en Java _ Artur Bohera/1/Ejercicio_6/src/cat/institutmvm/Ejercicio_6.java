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

public class Ejercicio_6 {  
    private static final String MSG_1 = "Introduce un número: ";
    private static final String MSG_2 = "El mes tiene 31 días.";
    private static final String MSG_3 = "El mes tiene 30 días.";
    private static final String MSG_4 = "El mes tiene 28 días (o 29 días si es año bisiesto).";
    private static final String MSG_5 = "Error: el número introducido no se encuentra dentro del intervalo 1-12 incluidos.";
    
    public static void main(String[] args) {
        int month;
        Scanner userMonth = new Scanner(System.in);
        System.out.println(MSG_1);
        month = userMonth.nextInt();
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println(MSG_2);
        break;
        case 4: case 6: case 9: case 11:
            System.out.println(MSG_3);
            break;
        case 2:			
            System.out.println(MSG_4);
            break;			
        default:
            System.out.println(MSG_5);
}
    }
}