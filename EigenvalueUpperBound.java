import java.util.Scanner;

import java.math.*;
public class EigenvalueUpperBound {
	public static double obtainFrobeniusNorm(double[][] matrix_A) {
		int frobeniusNorm=0,R,C;
		for(R=0;R<3;R++) {
			for(C=0;C<3;C++) {
				frobeniusNorm+=Math.pow(matrix_A[R][C], 2);
			}
	}
		return frobeniusNorm;
	}
	public static void main(String[]args) {
	Scanner scan = new Scanner (System.in);
	double [][] matrix_A = new double [3][3];
	int R,C;
	for(R=0;R<3;R++) {
		for(C=0;C<3;C++) {
			matrix_A[R][C]=scan.nextDouble();
		}
	}
	
	
	
	
	
	
	
	
	
	
	}
}
