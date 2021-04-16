package assignment.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.ArrayUtils;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		List<Integer> c = new ArrayList<Integer>();
		
		a.add(5);
		a.add(6);
		a.add(7);
		
		b.add(3);
		b.add(6);
		b.add(10);
		
		c.add(18);
		c.add(90);
		c.add(90);
		c.add(13);
		c.add(90);
		c.add(75);
		c.add(90);
		c.add(8);
		c.add(90);
		c.add(43);
		
//		System.out.println(birthdayCakeCandles(c));
		List<List<Integer>> result = new  ArrayList<List<Integer>>();
		result.add(a);
		result.add(b);
		result.add(c);
		
//		System.out.println(timeConversion("07:05:45PM"));
//		diff("abacba", "abcaba", 0);
//		int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};
//		miniMaxSum(arr);
//		plusMinus(arr);
//		int dd = diagonalDifference(result);
//		System.out.println("dd " + dd);
//		result.forEach(r -> System.out.println(r));
		int[] arr = {1 ,3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
//		String[] arr1 =  bigSorting(arr);
//		System.out.println(arr1);
//		for(int i = 0; i< arr1.length; i++) {
//    		System.out.println(arr1[i]);
//    	}
//		almostSorted(arr);
		
		System.out.println(introTutorial(23, arr));
	}
	
	// Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
    	for(int i = 0; i < n; i++) {
    		if(arr[i] < arr[n] && arr[i + 1] > arr[n]) {
    			
    		}
    	}

    }
    
	// Complete the introTutorial function below.
    static int introTutorial(int V, int[] arr) {
    	for (int i = 0; i < arr.length-1; ++i) {
	        if(arr[i] == V) {
	        	return i;
	        }
	    }
    	return 0;

    }
	 static String[] bigSorting(String[] unsorted) {

		 Arrays.sort(unsorted, new strcmp());
	        return unsorted;
   
	 }
	 static class strcmp implements Comparator<String> {

			@Override
			public int compare(String o1, String o2) {
				int l1 = o1.length(), l2 = o2.length();
				return l1 > l2 ? 1 : (l2 > l1 ? -1 : o1.compareTo(o2));
			}

		}
	public static boolean isAscSorted(int[] d) {
	    for (int i = 0; i < d.length-1; ++i) {
	        if (d[i] > d[i+1]) {
	        	return false;
	        }
	    }
	    return true;
	}
	
	static void swap(int[] arr, int f, int s) {
		int fEle = arr[f];
		int sEle = arr[s];
		arr[f] = sEle;
		arr[s] = fEle;
	}
	
	static void reverse(int[] arr, int from, int to) {
		
		int j = to;
		for(int i = from; i <= to && j > i; i++) {
			swap(arr, i, j);
			j--;
		}
	}
	
	
	static boolean isReverseWorks(int[] arr, int startingPoint) {
		int start = arr[startingPoint];
		int lastIndexOfSmaller = startingPoint;
		
		for(int i = startingPoint; i < arr.length; i++) {
			if(start > arr[i]) {
				lastIndexOfSmaller = i;
			}
		}
		reverse(arr, startingPoint, lastIndexOfSmaller);
		
		if(isAscSorted(arr)) {
			System.out.println("yes");
			System.out.println("reverse " + (startingPoint + 1) + " " + (lastIndexOfSmaller + 1));
		}
		return isAscSorted(arr);
	}
	static int indexOfMin(int[] arr, int startingPoint) {
		int minValue = arr[startingPoint];
		int indexOfMin = startingPoint;
		
		for(int i = startingPoint; i < arr.length; i++) {
			if(minValue > arr[i]) {
				minValue = arr[i];
				indexOfMin = i;
			}
		}
		return indexOfMin;
	}
	
	static void almostSorted(int[] arr) {
		int[] orgArr = arr.clone();
		int indexOfMin = 0;
		if(isAscSorted(arr)) {
			System.out.println("yes");
		} else {
			// try swap sort
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > arr[i + 1]) {
					indexOfMin = indexOfMin(arr, i);
					swap(arr, indexOfMin, i);
					
					if(isAscSorted(arr)) {
						System.out.println("yes");
						System.out.println("swap " + (i + 1) + " " + (indexOfMin + 1));
						break;
					} else {
						// try reverse sort
						if(! isReverseWorks(orgArr, i)) {
							System.out.println("no");
							break;
						} else {
							break;
						}
					}
				}
			}
		}
		/*
		 * int[] sortedArr; boolean sorted = false; // int indexOfMin = 0; // int[]
		 * orgArr = arr.clone(); if(! ArrayUtils.isSorted(arr)) { for(int i = 0; i <
		 * arr.length; i++) { if(i == arr.length - 1) {
		 * 
		 * } if(arr[i] > arr[i + 1]) { indexOfMin = indexOfMin(arr, i);
		 * ArrayUtils.swap(arr, indexOfMin, i);
		 * 
		 * if(ArrayUtils.isSorted(arr)) { System.out.println("yes");
		 * System.out.println("swap " + (i + 1) + " " + (indexOfMin + 1)); break; } else
		 * { if(!isReverseWorks(orgArr, i)) { System.out.println("no"); } break; }
		 * 
		 * } } } else { System.out.println("yes"); }
		 */

    }
	
	static int diff(String s1, String s2, int k) { 
		
		int n = s1.length(), L = s1.length();

		int MEM[][][] = new int[n][n][2];
		int length = 1;
		int maxLength = Integer.MIN_VALUE;
		while (length <= L) {
			for (int i = length - 1; i < n; i++) {
				for (int j = length - 1; j < n; j++) {
					if (length == 1) {
						MEM[i][j][0] = MEM[i][j][1] = (s1.charAt(i) == s2.charAt(j)) ? 0 : 1;
					} else {
						MEM[i][j][0] = MEM[i][j][1];
						MEM[i][j][1] = MEM[i - 1][j - 1][0]
								+ ((s1.charAt(i) == s2.charAt(j)) ? 0 : 1);
					}
					if (MEM[i][j][1] <= k) {
						maxLength = Math.max(maxLength, length);
					}
				}
			}

			length++;
		}

		return maxLength;
		
	} 
	/*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String time = null;
        Date date;
        SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss aa");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        
        Character c = s.charAt(s.length() - 3);
        
        if(! Character.isWhitespace(c)) {
        	String subString = s.substring(s.length() - 2, s.length());
        	s = s.replaceAll(subString, " " + subString);
        }
        
        try {
        
			date = sdf1.parse(s);
			time = sdf.format(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    	return time;
    }
    
	public static int birthdayCakeCandles(List<Integer> candles) {
	    int tallestCount = 0;
	    int tallest = 0;
	    for(int candel : candles) {
	    	if(candel > tallest) {
	    		tallest = candel;
	    		tallestCount = 0;
	    	}
	    	
	    	if(candel == tallest) {
	    		tallestCount++;
	    	}
	    }

	    return tallestCount;
	    		
	    }
	
	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	long min;
    	long max;
    	long sum = 0;
    	
    	min = arr[0];
		max = arr[0];
    	for(int i = 0; i < arr.length; i++) {
    		
    		if(max < arr[i]) {
    			max = arr[i];
    		}
    		if(min > arr[i]) {
    			min = arr[i];
    		}
    		
    		sum += arr[i];
    	}
    	
    	System.out.println((sum - max) + " " + (sum - min));

    }
	
	// Complete the staircase function below.
    static void staircase(int n) {
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			if(j <= i ) {
    				System.out.print("*");
    			}
    		}
    		System.out.println();
    	}
    	
//    	int c = n -1;
//    	for(int i = 0; i < n; i++) {
//    		for(int j = 0; j < n; j++) {
//    			if(j < c) {
//    				System.out.print(" ");
//    			} else {
//    				System.out.print("*");
//    			}
//    		}
//    		System.out.println();
//    		c = c -1;
//    	}
    }
    
	// Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	double neg = 0;
    	double pos = 0;
    	double zero = 0;
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] < 0) {
    			neg++;
    		} else if(arr[i] > 0) {
    			pos++;
    		} else {
    			zero++;
    		}
    	}
    	
    	DecimalFormat df = new DecimalFormat("#.######");
    	System.out.println(df.format(pos/arr.length));
    	System.out.println(df.format(neg/arr.length));
    	System.out.println(df.format(zero/arr.length));
    	
    }
	
	public static int diagonalDifference(List<List<Integer>> arr) {
		int dd = -6;
		int ltr = 0;
		int rtl = 0;
		System.out.println(arr.size());
		for(int i = 0; i < arr.size(); i++) {
			for(int j = 0; j < arr.size(); j++) {
				if(i == j) {
					ltr += arr.get(i).get(j);
				}
				
				if(i == arr.size() - 1 - j) {
					rtl += arr.get(i).get(j);
				}
			}
		}
		
		dd = rtl - ltr;
		return Math.abs(dd);
	}
	
	
	static long aVeryBigSum(long[] ar) {
        long sum = 0l;
        for(int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        
        return sum;

    }
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> score = new ArrayList<Integer>();
		int aliceScore = 0;
		int bobScore = 0;
		
		for(int i = 0; i < 3; i++) {
			if(a.get(i) > b.get(i)) {
				aliceScore++;
			} else if(a.get(i) < b.get(i)) {
				bobScore++;
			}
		}
		
		score.add(0, aliceScore);
		score.add(1, bobScore);
		
		return score;
	}

}
