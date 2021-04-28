package oopIntro;

public class Main {

	public static void main(String[] args) {
	
		Product product1 = new Product (1,"Lenovo V14",15.000,"16 GB Ram"); //Classý oluþturmak için bunu yapmamýz lazým
		Product product2 = new Product(2,"Lenovo V15",16.999,"32 GB Ram"); 
		//HER ÝKÝSÝ DE YAZILABÝLÝR.
		Product product3 = new Product(); 
		product3.id=3;
		product3.name="HP 5";
		product3.unitPrice = 12.000;
		product3.detail = "8 GB Ram";
		
		
		
		
		Product[] products = {product1,product2,product3}; /* array oluþturup birden fazla veriyi çektik.*/
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		
		
		System.out.println(products.length);
		
		
		/*----------------------------------------------------------------------------------------------------------------------------- */
			Category category1 = new Category();
			category1.id=1;
			category1.name="Bilgisayar";
			
			
			Category category2 = new Category();
			category2.id=2;
			category2.name="Ev/Bahçe";
			
			
			ProductManager productmanager = new ProductManager();
			productmanager.addToCart(product1);
			productmanager.addToCart(product2);
			productmanager.addToCart(product3);
			
	
		

	}

}
