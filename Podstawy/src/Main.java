import java.util.Random;
import java.util.Scanner;


// This program initialize 2 matrixes with random values.
// At the end it adds both matrixes and returns average of main diagonal.
public class Main {

    public static void main(String[] args) {
        // Matrixes declaration
        float matrix1[][];
        float matrix2[][];


        // Get input
        System.out.print("Podaj wymiar dla dwóch macierzy macierzy kwadratowych: ");
        Scanner input = new Scanner(System.in);
        int dim = input.nextInt();

        // Initialize matrixes and random generator
        matrix1 = new float [dim][dim];
        matrix2 = new float [dim][dim];
        Random numGenerator = new Random();

        // Filling in matrix1
        for(int row=0; row < dim; row++){
            for(int col = 0; col < dim; col++){
                matrix1[row][col] = numGenerator.nextFloat();
            }
        }

        //Filling in matrin2
        for(int row=0; row < dim; row++){
            for(int col = 0; col < dim; col++){
                matrix2[row][col] = numGenerator.nextFloat();
            }
        }

        System.out.println();

        // Printing matrix1
        for(int row=0; row < dim; row++){
            for(int col = 0; col < dim; col++){
                System.out.format("%.2f   ",matrix1[row][col]);
            }
            System.out.println("\n");
        }

        System.out.println("-------------------------\n");

        // Printing matrix2
        for(int row=0; row < dim; row++){
            for(int col = 0; col < dim; col++){
                System.out.format("%.2f   ",matrix2[row][col]);
            }
            System.out.println("\n");
        }


        float sum = 0;

        for(int i=0; i < dim; i++){
            sum = sum + matrix1[i][i] +matrix2[i][i];
        }

        float avg = sum/dim;

        System.out.format("Średnia głownej przekątnej sumy macierzy wynosi: %.2f\n", avg);
    }
}
