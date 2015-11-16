////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//11/03/2015
//CSE 002
//hw12: Transpose
//
//This program searches an array of grades for any value

//Import scanner
import java.util.Scanner;
//define a class
public class Transpose{
    public static void main(String[] args){
        //initialize height and width
        int width;
        int height;
        
        //Prompt user for matrix width
        System.out.println("Enter width: ");
        //input loops
        do{//input safety net while loop
            //scanner
            Scanner scan = new Scanner (System.in);
            try{
                
                width = scan.nextInt();
                if(width>0){
                    break;
                }
                else{
                    System.out.println("Dimension must be greater than zero. Try again: ");
                }
                
            }
            catch(Exception e){
                System.out.println("Erroneous input. Please enter a positive integer: ");
            }
        }while(true);
        System.out.println("Enter height: ");
        do{
            //scanner
            Scanner scan = new Scanner (System.in);
            try{
                height = scan.nextInt();
                if(height>0){
                    break;
                }
                else{
                    System.out.println("Dimension must be greater than zero. Try again: ");
                }
                
            }
            catch(Exception e){
                System.out.println("Erroneous input. Please enter a positive integer: ");
            }
        }while(true);
        
        
        //call random matrix builder
        int[][] matrix = randomMatrix(width, height);
        //cosmetic space
        System.out.println("Initial Matrix:\n");
        //call printing matrix
        printMatrix(matrix);
        //call transpose and save
        int[][] trans = transposeMatrix(matrix);
        //cosmetic space
        System.out.println("\nTransposed:\n");
        //print once again
        printMatrix(trans);
        
    }
    public static int[][] randomMatrix(int width, int height){//fills matrix of given size with random ints
        int[][] matrix = new int[height][width];//declared matrix
        for(int i=0; i<width; i++){//loop to fill matrix
            for(int j=0;j<height; j++){
                matrix[j][i] = (int)(Math.random()*21)-10;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix){//print matrix
        //check for rectangularity
        for(int i=1; i<matrix.length; i++){
            //lengths of each column must be equal
            if(matrix[i].length==matrix[i-1].length){
                continue;
            }
            else{
                System.out.println("Error: non-rectangular matrix.");
                break;
            }
        }
        //Row-major format:
        System.out.println("Row - Major format:");
        for(int i=0; i<matrix.length; i++){//increment along rows
            
            for(int j=0; j<matrix[0].length; j++){
                //if statements to clean up print out
                if( matrix[i][j]==-10 ){
                    System.out.print(""+matrix[i][j]+"  ");
                }
                if( matrix[i][j]>-10 && matrix[i][j]<0){
                    System.out.print(""+matrix[i][j]+"   ");
                }
                if( matrix[i][j]>-1 && matrix[i][j]<10 ){
                    System.out.print(" "+matrix[i][j]+"   ");
                }
                if( matrix[i][j] == 10 ){
                    System.out.print(" "+matrix[i][j]+"  ");
                }
            }
            
        }
        //Normal format:
        System.out.println("\n\nMatrix format: ");
        for(int i=0; i<matrix.length; i++){//increment along rows
            System.out.print("|");
            for(int j=0; j<matrix[0].length; j++){
                //if statements to clean up print out
                if( matrix[i][j] == -10 ){
                    System.out.print(""+matrix[i][j]+"  ");
                }
                if( matrix[i][j] > -10 && matrix[i][j] < 0){
                    System.out.print(""+matrix[i][j]+"   ");
                }
                if( matrix[i][j] > -1 && matrix[i][j] < 10 ){
                    System.out.print(" "+matrix[i][j]+"   ");
                }
                if( matrix[i][j] == 10 ){
                    System.out.print(" "+matrix[i][j]+"  ");
                }
            }
            System.out.print("|\n");
        }
    }
    public static int[][] transposeMatrix(int[][] matrix){
        int[][] trans = new int[matrix[0].length][matrix.length];
        for(int i=0; i<trans.length; i++){
            for(int j=0; j<trans[0].length; j++){
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }
    
}