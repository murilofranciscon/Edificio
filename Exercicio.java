import java.util.Random;

public class Exercicio {
    public static void main(String[] args) {
        
        int[][] edificio = new int[10][8];
        preencherEdificio(edificio);
        printAndares(edificio);
        
        
    }
    public static void preencherEdificio(int[][] edificio) {
    	Random preencher = new Random();
    	for (int andar = 0; ap < edificio.length;andar ++) {
    		for (int ap=0;ap < edificio[andar];ap++) 
    			
    			edificio[andar][ap]=preencher.nextInt(7);
    		}
    }
    	public static void printAndares(int[][] edificio) {
            System.out.println("       Ap1 Ap2 Ap3 Ap4 Ap5 Ap6 Ap7 Ap8");
            for (int andar = 0; andar < edificio.length; andar++) {
                System.out.printf("Andar%2d ", andar + 1);
                for (int ap = 0; ap < edificio[andar].length; ap++) {
                    System.out.printf("%5d ", edificio[andar][ap]);
                }
                System.out.println();
            }
        }
}