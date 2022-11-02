/* 
* Nom: Artur
* Cognoms: Bohera Viejo
* INS Manuel Vázquez Montalbán
* Data d’edició: 26/10/2022
* Nom del cicle formatiu: Administració de Sistemes Informàtics i Xarxes
* Nom del mòdul: M03. Programació
*/

package cat.institutmvm;

public class Ejercicio_7_c {  
    private static final int DIV = 2;
    
    public static void main(String[] args) {
        int num=0;
        do{
            if ((num % DIV) == 0){
                System.out.println(num);
            }
            num++; //num = num + 1
        } while(num < 100);
    }
}
