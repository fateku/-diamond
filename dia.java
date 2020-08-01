public class Dia {
	public static void main(String[] args) {
		int grape = 3;//層式
		for(int i=0;i<=grape;i++) {
			for(int n=grape;n>=i;n--) {//每一層有幾個
				System.out.print(" ");
			}
			
			for(int a=0;a<=i *2+1;a++) {
				if (a%2==0) {
					System.out.print(" ");}
				else {
					System.out.print("*");
				}
			}
			
			
			
			System.out.println();
		}
		for(int i=1;i<=grape;i++) {
			for(int n=0;n<=i+1;n++) {//每一層有幾個
				System.out.print(" ");
			}
			
			for(int a=grape*2+1;a>=i *2+1;a--) {
				if (a%2==0) {
					System.out.print(" ");}
				else {
					System.out.print("*");
				}
			}
			
			
			
			System.out.println();
		}
	}
}
