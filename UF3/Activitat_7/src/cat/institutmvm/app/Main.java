/* 
* Nom: Artur
* Cognoms: Bohera Viejo
* INS Manuel Vázquez Montalbán
* Data d’edició: 01/02/2023
* Nom del cicle formatiu: Administració de Sistemes Informàtics i Xarxes
* Nom del mòdul: M03. Programació
*/

package cat.institutmvm.app;
import cat.institutmvm.utils.Fichero;
import java.util.Scanner;

public class Main {
    private static final String MSG_1 = "\nMenú:\n1. Leer fichero\n2. Guardar texto en fichero\n3. Añadir texto en fichero\n4. Contar longitud del documento\n5. Salir";
    private static final String MSG_2 = "Introduce la opción que deseas: ";
    private static final int MIN = 1;
    private static final int MAX = 5;
    
    public static void main(String[] args) {
        int option;
        do{
            System.out.println(MSG_1);
            System.out.println("\n" + MSG_2);
            Scanner sc = new Scanner(System.in);
// Creación del método.
            Fichero ac = new Fichero();
            option = sc.nextInt();
            while(option < MIN || option > MAX){
                System.out.println(MSG_2);
                option = sc.nextInt();
            }
            switch (option){
            case 1:
// Llamada al método.
                ac.read_text();
                break;
            case 2:
// Llamada al método.
                ac.save_text();
                break;
            case 3:
// Llamada al método.
                ac.append_text();
                break;
            case 4:
// Llamada al método.
                ac.long_text();
                break;
            case 5:
                break;
            default:
                System.out.println("Error");
            }
        }while(option != MAX);
    }
}