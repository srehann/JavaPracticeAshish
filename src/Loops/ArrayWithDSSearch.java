package Loops;

public class ArrayWithDSSearch {
	// searching 
	public static int  arrayNumberFinding(int arr[],int a) {
		
		// 0 ; 0 < 20; i++
		// 1 ; 1 < 20; i++
		// 19 ; 19< 20; i++
		// 20 ; 20< 20 ; i++
		// 21 ; 21 < 20 ; i++
		
		for (int j = 0; j <arr.length; j++) {
			if(arr[j]==a) {
				return j;
			}
		}
		System.out.println("Numb  not founf");
		return -1;
	}
public static void main(String[] args) {
	int number[] = {1,2,3,4,5,6,7,8,9,9,2,2,33,2,3,4,4,1234,5,5,56,
			6,6,6,4,4,2,3,4
			,5,3,4,5,3,34,234234,43543,5433333,
			23423,23423,
			231232,23432,43245325,5435435,
			435,34,543534563,56365426,34654635,63556542,
			43234324,4324,323,2,3,4,5,5,6,7,7,5,7,4};
	
	int num=12934;
	
	
		System.out.println(num+" is found "+arrayNumberFinding(number,num));
	
		
		}
	
		
		
	
		

	

}
