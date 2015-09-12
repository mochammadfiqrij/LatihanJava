import java.util.Scanner;

class begin{
	public Scanner dataIn = new Scanner(System.in);
	protected int[] data;
	protected int top=0;
	
	public begin(int max) {
		data = new int[max];
	}
	
	public int setData() {
		int input;
		System.out.print("Masukan bilangan: ");
		input = dataIn.nextInt();
		return input;
	}
	
	public void push(int result) {
		top++;
		data[top]=result;
	}
	
	public int pop() {
		int hasil;
		hasil = data[top];
		top--;
		return hasil;
	}
	
	public int size() {
		int ukuran = top;
		System.out.println("Ukuran Stack: "+ukuran);
		return ukuran;
	}
	
	public int peek() {
		int result = data[top];
		System.out.println("Hasil peek: "+result);
		return result;
	}
	
	public boolean isEmpty() {
		if(top==0) {
			System.out.println("Kosong");
				return true;
		}
	
		else {
			System.out.println("Stack memiliki isi");
				return false;
			}
	}
	
	public void printStack() {
		for(int a=1; a<=top; a++) {
			System.out.println(data[a]);
		}
	}
	
	public void clear(){
		for(int a=1; a<=top; a++) {
			pop();
			System.out.println(data[a]);
		}
	}
}

class stack7fungsi {
	public static void main(String[]args) {
		Scanner dataIn = new Scanner(System.in);
		int x;
		
		String lagi = "";
			begin stack = new begin(100);
			do {
			System.out.println("Program Stack");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Size");
			System.out.println("4. Peek");
			System.out.println("5. isEmpty");
			System.out.println("6. PrintStack");
			System.out.println("7. Clear");
			System.out.print("Masukan pilihan: ");
			x = dataIn.nextInt();
			switch(x) {
				case 1: stack.push(stack.setData());
					break;
				case 2: stack.pop();
					break;
				case 3: stack.size();
					break;
				case 4: stack.peek();
					break;
				case 5: stack.isEmpty();
					break;
				case 6: stack.printStack();
					break;
				case 7: stack.clear();
					break;
				default: System.out.println("Keluar program salah input");
			}
			
			System.out.print("Lagi (ya/tidak): ");
			lagi = dataIn.nextLine();
			lagi = dataIn.nextLine();
		} while(!lagi.equals("tidak"));
	}
}
				