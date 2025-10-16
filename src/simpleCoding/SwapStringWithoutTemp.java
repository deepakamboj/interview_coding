package simpleCoding;

public class SwapStringWithoutTemp {

	public static void main(String[] args) {
		String str1 = "Deepa";
		String str2 = "Rani";

		str1 = str1 + str2; // DeepaRani(length=9)
		str2 = str1.substring(0, str1.length() - str2.length());// Deepa(0->(9-4)) // str2 length=5
		str1 = str1.substring(str2.length()); //(5-9)Rani
		
		System.out.println("\nAfter Swap:");
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);

	}

}
