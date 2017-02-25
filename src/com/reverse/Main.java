package com.reverse;


public class Main {
	 public int reverseBits(int n) {
	      String binary = Integer.toBinaryString(n);
	      binary = prependZeros(binary);
	      String reverse = new StringBuilder(binary).reverse().toString(); 
	      return Integer.parseInt(reverse, 2);
	 }
	 
	 private String prependZeros(String binary) {
		int len = binary.length();
		StringBuilder fullLenBinary = new StringBuilder(binary);
		for (int i = 0; i < 32 - len; i++) {
			fullLenBinary.insert(0, '0');			
		}
		return fullLenBinary.toString();
	}

	public static void main(String[] args) {
		 int n = 43261596;
		 Main obj = new Main();
		 System.out.println(obj.reverseBits(n));
	 }
}