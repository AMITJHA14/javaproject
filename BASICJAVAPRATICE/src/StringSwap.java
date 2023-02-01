
public class StringSwap {

	public static void main(String[] args) {
		String w="Amit";
		String y="jha";
		w=w.concat(y); //amitjha
		
		y=w.substring(0,w.length()-y.length());//amit
		System.out.println();
		w=w.substring(y.length());
		
        System.out.println(w);
        System.out.println(y);
	}

}
