package de.uk.java;

public class Application {

	public static void main(String[] args) {
		int[] initArray = {1, 500, 33, 42, 5};
		
		initArray = ArrayUtil.shrinkArray(initArray, 2);
		ArrayUtil.printArray(initArray);
	}
}
