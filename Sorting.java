import java.util.*;

public class Sorting {
	public static void main(String[]args) {
	int ulang;
	do {	
		Scanner in = new Scanner(System.in);

		int n;	
		System.out.println("------------------------------------------------------");
		System.out.print("Ingin menginputkan berapa: ");
		n = in.nextInt();
		System.out.println("------------------------------------------------------");
		int[]angka = new int[n];

		
		for(int i=0; i<n; i++) {
			System.out.print("Bilangan ke-"+(i+1)+" : ");
			angka[i] = in.nextInt();
		}
		
			System.out.println("Bilangan sebelum diurutkan:");
				
				for(int i=0; i<n; i++) {
					System.out.print(angka[i]+" ");
				}
			System.out.println("");	
			System.out.println("------------------------------------------------------");
			System.out.println("Menu Program Sorting:");
			System.out.println("------------------------------------------------------");
			System.out.println("1. Bubble Sort:");
			System.out.println("2. Selection Sort:");
			System.out.println("3. Insertion Sort:");
			System.out.println("------------------------------------------------------");
			System.out.print("Pilih yang mana? ");
			int pilih = in.nextInt();
			System.out.println("------------------------------------------------------");
			switch(pilih)
			{
			
				case 1: 
					bubble(angka, n);
					System.out.println("Bilangan setelah diurutkan dengan Bubble Sort:");
				
					for(int i=0; i<n; i++) {
						System.out.print(angka[i]+" ");
					}
					break;
					
				case 2:
					selection(angka, n);
					System.out.println("Bilangan setelah diurutkan dengan Selection Sort:");
				
					for(int i=0; i<n; i++) {
						System.out.print(angka[i]+" ");
					}
					break;
					
				case 3:
					insertion(angka, n);
					System.out.println("Bilangan setelah diurutkan dengan Insertion Sort:");
				
					for(int i=0; i<n; i++) {
						System.out.print(angka[i]+" ");
					}
					break;
				}
			System.out.println();	
			System.out.println("------------------------------------------------------");
			System.out.println("Untuk ulangi ketik 1 ");
			System.out.println("Untuk keluar ketik 0 ");
			System.out.println("------------------------------------------------------");
			System.out.print("Pilihan anda:");
			ulang = in.nextInt();
		} 
			while(ulang==1);
				
	}
	
	public static void selection(int[]data, int n) {
		for(int i=0; i<n; i++) {
			int temp;
			int min = i;
				for(int j=i; j<n; j++) {
					min = j;
					if(data[min]<data[i]) {
						temp = data[min];
						data[min] = data[i];
						data[i] = temp;
					} 
				}
		}
	}

	
	public static void bubble( int[]data, int n ){
		int i, j,t=0;
		for(i = 0; i < n; i++){
			for(j = 1; j < (n-i); j++){
				if(data[j-1] > data[j]){
					t = data[j-1];
					data[j-1]=data[j];
					data[j]=t;
				}
			}
		}
	}
	
	
	public static void insertion(int[]data, int n){
		for (int i = 1; i < n; i++){
			int j = i;
			int B = data[i];
			while ((j > 0) && (data[j-1] > B)){
				data[j] = data[j-1];
				j--;
			}
			data[j] = B;
		}
	}


}