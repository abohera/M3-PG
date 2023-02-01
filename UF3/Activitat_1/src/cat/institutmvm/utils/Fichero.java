/* 
* Nom: Artur
* Cognoms: Bohera Viejo
* INS Manuel Vázquez Montalbán
* Data d’edició: 31/01/2023
* Nom del cicle formatiu: Administració de Sistemes Informàtics i Xarxes
* Nom del mòdul: M03. Programació
*/

package cat.institutmvm.utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fichero {
    public void fichero(){
        try {
            File file = new File("files/Activitat_1.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                System.out.println(linea);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }
    } 
}