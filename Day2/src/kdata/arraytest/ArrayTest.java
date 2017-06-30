package kdata.arraytest;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar;			//Stack
		ar = new int[5];	//Heap
		
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;		
		
		System.out.println(ar.length);		
		
		for(int i=0; i<ar.length; i++)
			System.out.println(ar[i]);
				
	}

}

