

public class ConstructorConcept {
	int a=3;
	int b=5;
//default constructor
	public ConstructorConcept() {
		System.out.println("constructor call");
	}
	
	public ConstructorConcept(int a, int b) {
		System.out.println(a+b);
		
	}

	public static void main(String[] args) {
		ConstructorConcept cc=new ConstructorConcept();
        ConstructorConcept ccp=new ConstructorConcept(3,4);
	}