package Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort {
public static void main(String[] args) {
	int number[] = {3,2,3,4,5,6,7,8,9,9,2,2,33,2,3,4,4,1234,5,5,56,
			6,6,6,4,4,2,3,4
			,5,3,4,5,3,34,234234,43543,5433333,
			23423,23423,
			231232,23432,43245325,5435435,
			435,34,543534563,56365426,34654635,63556542,
			43234324,4324,323,2,3,4,5,5,6,7,7,5,7,4};
	for (int i = 0; i < number.length-1; i++) {
		for (int j = 0; j < number.length-1; j++) {
			if( number[j] < number[j+1])
			{
				int temp=number[j];
				number[j]=number[j+1];
				number[j+1]=temp;
			}
		}
	}
	
	System.out.println(Arrays.toString(number));
}
}
