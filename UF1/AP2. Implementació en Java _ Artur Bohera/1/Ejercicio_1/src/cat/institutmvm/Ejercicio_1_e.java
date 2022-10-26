package cat.institutmvm;

public class Ejercicio_1_e {
    private static final int N = 10;
    
    public static void main(String[] args) { 
        int asteriscos = 1;
        int espacios = N - 1;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < espacios; j++)  {
                System.out.print(" ");
            }
            for (int x = 0; x < asteriscos; x++) {
                System.out.print("*");
            }
            System.out.println();
            asteriscos ++;
            espacios --;
        }
    }
}   
