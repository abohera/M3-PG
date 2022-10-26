package cat.institutmvm;

public class Ejercicio_1_d {
    private static final int N = 10;
    
    public static void main(String[] args) { 
        for(int i = 0; i < N; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0; i < N-2; i++) {
            System.out.print("*");
            for(int j = 0; j < N-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 0; i < N; i++) {
            System.out.print("*");
        }
    }
}
