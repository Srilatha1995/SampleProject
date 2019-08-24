package stringmethods;

public class Removechar {

	public static void main(String[] args) {
     String str = "ABCDefgh1947@gmail.com";
     System.out.println(str.length());
    //  String s = str.replace("e","");//Single character
    //  String s = str.replaceAll("[A-Z]", "");//To Remove upper case
    //  String s = str.replaceAll("[a-z]","");//To Remove lower case
    //  String s = str.replaceAll("[0-9]","");//To remove numeric digits
        String s = str.replaceAll("[A-Z,a-z,0-9]","");//To remove upper case,lower case,digits
      System.out.println(s);
	}

}
