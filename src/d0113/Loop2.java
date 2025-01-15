package d0113;

public class Loop2 {
	
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i + " X " + j + " = " + (j*i));
				if(i==9) {
					System.out.println();
				}else {
					System.out.print(",");
			}
			}	
		}
	}
}