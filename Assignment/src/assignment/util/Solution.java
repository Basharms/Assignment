package assignment.util;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.hibernate.internal.build.AllowSysOut;

public class Solution {
	
	// Complete the bigSorting function below.
   
	public static void main(String[] args) {
		byte b = 5;
		doCalc(b , b);

	}
	
	static void doCalc(byte... a) {
		System.out.println("byte");
	}
	
	static void doCalc(long a, long b) {
		System.out.println("lon longe");
	}
	
	
	static void doCalc(byte a, byte b) {
		System.out.println("byte byte");
	}
	
	public static void approximatePI(int number) {
		
		
		double pi = 0;
		double nn = 0;
		double nnn = 0;
		for(double i = 1; i < number; i++) {
			System.out.println(Math.pow(-1,i+1)); 
			
			
		}
		nnn = 1 - nn;
		pi = 4 * nnn;
		
//		double pi = 0;
//		for (int i = 1; i < number; i++) {
//			pi += Math.pow(-1,i+1) / (2*i - 1);
//		} 
//		return 4 * pi;
    }
	
	public static List<Integer> generateBinaries(int number) {

        if(number == 1) {
        	
        }
        return null;
    }
		
}
