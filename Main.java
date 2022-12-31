import java.util.Scanner;


// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 
// 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

public class Main {

	public static void main(String[] args) {
		
		int n;
		int total = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Sayı giriniz: ");
			n=scanner.nextInt();
			if(n %4 == 0) {
				total = total + n ;
			}
			
		}while(n%2 == 0) ;
			System.out.println("Toplam: " +total);
		}
		
	}


