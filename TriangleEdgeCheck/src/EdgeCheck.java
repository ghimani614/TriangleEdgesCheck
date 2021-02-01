import java.util.Scanner;

public class EdgeCheck {

	public static void main(String[] args) {
		int sideA, sideB, sideC;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side of Triangle(between 1 to 8)");
		sideA = sc.nextInt();
		System.out.println("Enter second side of Triangle(between 1 to 8)");
		sideB = sc.nextInt();		
		System.out.println("Enter third side of Triangle(between 1 to 8)");
		sideC = sc.nextInt();		
		checkIfTriangleCanBeFormed(sideA, sideB, sideC);

	}

	private static void checkIfTriangleCanBeFormed(int sideA, int sideB, int sideC) {
		if(sideA>8 || sideB>8 || sideC>8) {
			System.out.println("Side entered is greater than 8 !!!");
			System.exit(0);
		}
		if((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA))
		{
			System.out.println("Triangle can be formed with given lengths");
		}
		else
			System.out.println("Triangle creation is not possible with given lengths");
	}

}
