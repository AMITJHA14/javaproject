

public class CountString {

	public static void main(String[] args) {
		String str="India is my country";
        char arr[]=str.toCharArray();
      
        int count=0;
        for(int i=0;i<arr.length-1;i++) {
        if(arr[i]!=' ')
        	count++;
        
        }
        System.out.println(count);
	}

}
