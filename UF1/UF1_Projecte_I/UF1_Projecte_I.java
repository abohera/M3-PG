/* 
* Nom: Artur
* Cognoms: Bohera Viejo
* INS Manuel Vázquez Montalbán
* Data d’edició: 14/12/2022
* Nom del cicle formatiu: Administració de Sistemes Informàtics i Xarxes
* Nom del mòdul: M03. Programació
*/

package cat.institutmvm;
import java.util.Scanner;

public class UF1_Projecte_I {
    private static final String MSG_1 = "Introcude un número, recuerda que tienes 3 intentos: ";
    private static final String MSG_2 = "Tipus de venda?:\n venda lliure (0)\n pensionista (1)\n carnet jove (2)\n soci (3)";
    private static final String MSG_3 = "Error, vuelve a introducir un número dentro del rango: ";
    private static final int MAX_err = 3; //Constante del máximo de errores permitidos
    private static final int MIN_id = 111; //Constante del mínimo número en ID
    private static final int MAX_id = 999; //Constante del máximo número en ID
    private static final int MIN_edat= 14; //Constante del mínimo de edad
    private static final int MAX_edat = 120; //Constante del máximo de edad
    private static final int MIN_compra = 0; //Constante del mínimo de compra
    private static final int MAX_compra = 1000; //Constante del máximo de compra
    private static final int MIN_tlf = 111111111; //Constante del mínimo número de tlf
    private static final int MAX_tlf = 999999999; //Constante del máximo número de tlf
    
    public static void main(String[] args) {
        int id, edat = 0, tipus = -1, compra = -1, telefon = 0, intents = 1;
        String tipus_s = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Id?(111-999 inclosos): ");
        id = sc.nextInt();
//ID
        do {
            if (id < MIN_id || id > MAX_id){
                System.out.println("\nIntento " + (intents+1));
                System.out.println(MSG_3);
                id = sc.nextInt();
            }
            if (id < MIN_id || id > MAX_id){
                intents++;
            }
        } while ((id < MIN_id || id > MAX_id) && intents < MAX_err);
//EDAT
        while ((edat < MIN_edat || edat > MAX_edat) && intents < MAX_err){
            intents = 1;
            System.out.println("\nEdat?(14-120 inclosos):");
            edat = sc.nextInt();
            do {
                if (edat < MIN_edat || edat > MAX_edat){
                    System.out.println("\nIntento " + (intents+1));
                    System.out.println(MSG_3);
                    edat = sc.nextInt();
                }
                if (edat < MIN_edat || edat > MAX_edat){
                    intents++;
                }
            } while ((edat < MIN_edat || edat > MAX_edat) && intents < MAX_err);
        }
//TIPUS
        while ((tipus < 0 || tipus > 3) && intents < MAX_err){
            intents = 1;
            System.out.println("\n" + MSG_2);
            System.out.println("\n" + MSG_1);
            tipus = sc.nextInt();
            do {
                if (tipus < 0 || tipus > 3){
                    System.out.println("\nIntento " + (intents+1));
                    System.out.println(MSG_3);
                    tipus = sc.nextInt();
                }
                if (tipus < 0 || tipus > 3){
                    intents++;
                }
            } while ((tipus < 0 || tipus > 3) && intents < MAX_err);
        }
        
        switch (tipus){
            case 0: tipus_s = "lliure";
            case 1: tipus_s = "pensionista";
            case 2: tipus_s = "carnet jove";
            case 3: tipus_s = "soci";
        }
//COMPRA
        while ((compra < MIN_compra || compra > MAX_compra) && intents < MAX_err){
            intents = 1;
            System.out.println("\nImport de la compra, màxim 1000 inclos:");
            compra = sc.nextInt();
            do {
                if (compra < MIN_compra || compra > MAX_compra){
                    System.out.println("\nIntento " + (intents+1));
                    System.out.println(MSG_3);
                    compra = sc.nextInt();
                }
                if (compra < MIN_compra || compra > MAX_compra){
                    intents++;
                }
            } while ((compra < MIN_compra || compra > MAX_compra) && intents < MAX_err);
        }
//TELEFON
        while ((telefon < MIN_tlf || telefon > MAX_tlf) && intents < MAX_err){
            intents = 1;
            System.out.println("\nTelèfon de contacte,recorda que un telèfon té 9 xifres:");
            telefon = sc.nextInt();
            do {
                if (telefon < MIN_tlf || telefon > MAX_tlf){
                    System.out.println("\nIntento " + (intents+1));
                    System.out.println(MSG_3);
                    telefon = sc.nextInt();
                }
                if (telefon < MIN_tlf || telefon > MAX_tlf){
                    intents++;
                }
            } while ((telefon < MIN_tlf || telefon > MAX_tlf) && intents < MAX_err);
        }
//Mensaje de error
        if (intents == MAX_err){
            System.out.println("\nPrograma finalitzat per error en dades");
        }
//Print de los datos
        if (intents < MAX_err){
            System.out.println("\nId\tedat\ttipus\timport\ttelèfon");
            System.out.println(id + "\t" + edat + "\t" + tipus_s + "\t" + compra + "\t" + telefon);
        }
    }
}