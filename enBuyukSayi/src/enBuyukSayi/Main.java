package enBuyukSayi;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 100;
		int sayi2 = 534;
		int sayi3 = 54;
		
		if (sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("En b�y�k sayi 1. dir.");
		} else if(sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("En b�y�k sayi 2. dir.");
		}
		else {
			System.out.println("En b�y�k sayi 3. d�r.");
		}

	}

}
