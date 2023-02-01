package STRINGPRACTICE;

public class SwapStrings {

	public static void main(String[] args) {
		String a="codeograph";
		String b="solutions";
		a=a.concat(b);
//		System.out.println(a);
		
		
		b=a.substring(0,a.length()-b.length());//  (0 to 19-9 = 10)=codeoghraphsolutions-solutions
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
