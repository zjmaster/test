package nntable;

public class nn {
	public static void main(String[] args) {
		System.out.println("¾Å¾Å³Ë·¨±í£º");
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
