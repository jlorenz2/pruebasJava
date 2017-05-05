package pruebas;

public class pStringBuilder {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder ("mi string");
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder(5);
		sb2.append("01234567890123456789");
		System.out.println("-" + sb2 + "-");
		

		System.out.println("-" + sb2 + "-");
		System.out.println("-" + sb2.length() + "-");
		System.out.println("-" + sb2.reverse() + "-");
		
	}
}
