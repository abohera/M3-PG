/* 
* Nom: Artur
* Cognoms: Bohera Viejo
* INS Manuel Vázquez Montalbán
* Data d’edició: 01/02/2023
* Nom del cicle formatiu: Administració de Sistemes Informàtics i Xarxes
* Nom del mòdul: M03. Programació
*/

package cat.institutmvm.utils;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichero {
    private static final String MSG_1 = "Introduce un texto: ";
    
    public void fichero(){
// Pedimos al usuario que escriba un texto por teclado.
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        String text = sc.nextLine();
// Sobreescribimos la variable "text" en el fichero.
        try {
            FileWriter fw = new FileWriter("files/Activitat_5.txt");
            fw.write(text);
            fw.close();
// Excepción de error de Entrada/Salida (Input/Output).
        } catch (IOException ex) {
            System.out.println("Error: ");
            ex.printStackTrace();
        }
// Finalmente si no hay ningún error, mostramos que se ha creado correctamente.
        finally{
            System.out.println("\nEl fichero se ha creado correctamente.");
        }
    }
}