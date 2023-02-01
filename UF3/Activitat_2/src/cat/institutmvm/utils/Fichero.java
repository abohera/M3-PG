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
    private static final String MSG_1 = "Introduce el nombre del fichero: ";
    private static final String txt = ".txt";
    
    public void fichero(){
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        String nombre = sc.nextLine();
        if (!nombre.contains(".txt")){
            nombre += txt;
        }
        try {
            File file = new File("files/", nombre);
            Scanner scf = new Scanner(file);
            while (scf.hasNextLine()) {
                String linea = scf.nextLine();
                System.out.println(linea);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }
    } 
}