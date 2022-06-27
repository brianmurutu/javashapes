/******************************************************************************
                                BRIAN MURUTU - BIT/2021/83742
                            
                            Object Oriented Design & Analysis CAT .
Java program that displays three shapes on a user screen; rectangle, triangle and circle. 
The program asks the user which shape to display on the screen  then after user has selected shape of choice,
the program asks for the dimensions of the shape after which the program then displays the requested shape in the dimensions requested.

*******************************************************************************/
import java.util.Scanner; 
public class shapes2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter c to display circle");
        System.out.println("Enter t to display triangle");
        System.out.println("Enter r to display rectangle");
        System.out.print("Enter your choice: ");
        char choice = in.next().charAt(0);
        
        switch(choice) {
            case 'c':
            double distance;
            int rad;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any value for radius: ");
            rad = sc.nextInt();
            System.out.println("Circle Pattern:\n");
            for (int row = 0; row <= 2 * rad; row++) {
                for (int col = 0; col <= 2 * rad; col++) {
                    distance = Math.sqrt((row - rad) * (row - rad) + (col - rad) * (col - rad));

                    if (distance > rad - 0.5 && distance < rad + 0.5)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
                break;
                
            case 't':
            sc = new Scanner(System.in);
            int size;
            Character c;

            System.out.println("Enter height of the triangle : ");
            size = sc.nextInt();

            System.out.println("Which character you want to use : ");
            c = sc.next().charAt(0);

            int i, j, k;

            for (i = 0; i < size + 1; i++) {
                for (j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < (i * 2 - 1); k++) {
                System.out.print(c);
            }
            System.out.println();
        }
                break;
                
            case 'r':
            int rows, columns, x, y;
            sc = new Scanner(System.in);
            
            System.out.print(" Please Enter Number of Rows : ");
            rows = sc.nextInt();    
            
            System.out.print(" Please Enter Number of Columns : ");
            columns = sc.nextInt();     
                
            for(x = 1; x <= rows; x++)
            {
                for(y = 1; y <= columns; y++)
                {
                    System.out.print("* "); 
                }
                System.out.print("\n"); 
            }
                break;
                
            default:
                System.out.println("Wrong choice!");
        }
    }
}