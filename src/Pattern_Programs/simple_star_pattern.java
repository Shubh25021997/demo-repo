package Pattern_Programs;

public class simple_star_pattern {
	
	static String star = "*";
	static String space = " ";
	
	public static void main(String[] args){

//		rightAngleTraingle_Pattern();
//		reverseRightAngleTraingle_Pattern();
		rightAngleTraingleWithSpace_Pattern();
		
		}
	
	public static void singleStarEachLine() {
		for(int i=0; i<=5; i++){
			System.out.print(star);}	
	}
	
	public static void multipleStarEachLine() {
		for(int i=0; i<=5; i++){
			for(int j=0;j<=5; j++) {
			System.out.print(star);}
		System.out.println();}
	}

	public static void rightAngleTraingle_Pattern() {
		for(int i=1; i<=5; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print(star);}
			System.out.println();
		}
	}
	
	public static void reverseRightAngleTraingle_Pattern() {
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(star);}
			System.out.println();}
	}

	public static void rightAngleTraingleWithSpace_Pattern() {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(space);
			}
			for(int k=1; k<=i; k++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
	}
}
