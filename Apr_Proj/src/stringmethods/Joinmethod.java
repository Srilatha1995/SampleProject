package stringmethods;

public class Joinmethod {

	public static void main(String[] args) {
      String[] arr = {"ABCD","efgh","IJKL"};
      String str = String.join(" ", arr);
      System.out.println(str);
	}

}
