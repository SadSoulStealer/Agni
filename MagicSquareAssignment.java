//Name: Sanjay Persad
//Magic Square Assignment

import java.util.Scanner;
public class MagicSquareAssignment {
   public static void main (String args[]){
	   Scanner in = new Scanner(System.in);
		System.out.println("Please input the size of the square");	//Gets the square's dimensions
		int dim = in.nextInt();
		int totalNum = dim*dim;						//used later on for largest number used
		double square[][] = new double[dim][dim]; 	//Declaration of Array
		for(int i = 0; i < dim; i++){				//Loop to load the array
			System.out.println("please enter integers between 1 and " + totalNum + " for row "+ (i+1));	
			for(int h = 0; h < dim; h++){
				System.out.println("Column "+ (h+1));
				square[i][h]= in.nextInt();				//fills column [h] in row [i]
				if(square[i][h] < 1 || square[i][h] > totalNum){		//if the input does not fall under the restrictions, prompted to input
					System.out.println("Invalid input, try again");		//new number
					h--;
				}
			}
		}
		getSum(square);		//check square method because why not
	}
	public static void getSum(double[][] userSquareInput){ 		//procedural method declared
		int sumCol[] = new int[userSquareInput.length];				//declares array[] for the sum of rows, columns and diagonal
		int sumRow[] = new int[userSquareInput.length];
		int sumDiagonal[] = new int[2];
		
		for(int i = 0; i<userSquareInput.length; i++){				//Sum of coloumns
			for(int h = 0; h<userSquareInput.length; h++){
			sumCol[i] += userSquareInput[i][h]; 
			}
			System.out.println(sumCol[i]);
		}
		
		
		for(int i = 0; i<userSquareInput.length; i++){			//Sum of rows
			for(int h = 0; h<userSquareInput.length; h++){
			sumRow[i] += userSquareInput[h][i]; 
			}
			System.out.println(sumRow[i]);
		}
		
		
		for(int i = 0;i < userSquareInput.length;i++ ){			//gets sum of diagonal in this direction of the square "\"
			sumDiagonal[0] += userSquareInput[i][i];
			System.out.println("diagonal 1 "+ sumDiagonal[0]);
		}
		
		
		for(int i = userSquareInput.length-1;i >= 0 ;i-- ){			// Gets sum of diagonal in this direction of the square "/"
			sumDiagonal[1] += userSquareInput[i][i];
			System.out.println("diagonal 2 "+ sumDiagonal[1]);
		}
		   int aLen = sumCol.length;
		   int bLen = sumRow.length;
		   int cLen = sumDiagonal.length;
		   int sumAll[] = new int[aLen + bLen + cLen];
		   System.arraycopy(sumCol, 0, sumAll, 0, aLen);
		   System.arraycopy(sumRow, 0, sumAll, aLen, bLen);
		   System.arraycopy(sumDiagonal, 0, sumAll, (aLen + bLen), cLen);
		
		boolean isMagic = isSquare(sumAll);
		if(isMagic == true){
			System.out.println("This is a magic square");
		}
		else if(isMagic == false){
			System.out.println("This is not a magic square");
		}
	}
	
	
	public static boolean isSquare(int[] allSums){
		for(int i = 1; i < allSums.length;i++ ){
			if(allSums[i] != allSums[i-1]){
				return false;
			}
		}
		
		return true;
		
	}
	
	
}
 

