import java.util.Scanner;

public class delete_an_element_at_position_k {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = input();
		output(num);
		int k=sc.nextInt();
		num=xoavt(num,k);
		output(num);		
	}
	public static int[] xoavt(int[] a, int k) {
		int[] e = new int[a.length - 1];
		for (int i = 0; i < k; i++)
			e[i] = a[i];
		for (int i = k; i < e.length; i++)
			e[i] = a[i + 1];
		return e;
	}
	public static int[] input() {
		System.out.println("input the number: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i]=sc.nextInt();
		return arr;
	}

	public static void output(int[] a) {
		for (int i : a)
			System.out.print(i + "  ");
		System.out.println();
	}
}
