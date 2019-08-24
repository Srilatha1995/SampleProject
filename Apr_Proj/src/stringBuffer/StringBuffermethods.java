package stringBuffer;

public class StringBuffermethods {

	public static void main(String[] args) {
    String str = "Testingtech";
		
		StringBuffer sb = new StringBuffer(str); 
	    //sb = sb.reverse();
	    //sb = sb.append("Technologies");
		 sb = sb.insert(4, "MASTERS",2 , 7);
		//sb = sb.deleteCharAt(6);
		//sb = sb.delete(1, 5);
		//sb = sb.replace(2, 7, "Masters");
		System.out.println(sb);
	}

}
