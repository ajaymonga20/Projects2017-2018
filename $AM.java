import java.math.BigInteger;
import java.util.Scanner;

/** 
 * 
 * @author ajay.monga
 *
 *
 * This is my tools class where I will put test corrections and demonstrate various skills I learned throughout this course 
 */
public class $AM {
	/** 
	 * This is our tester method, it is simply used to test things in this class 
	 * Largely, we will be accessing methods in a different class. 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Hello "); 
		print("How are you"); 
	}
	
	/** 
	 * 
	 * This method prints the past string to this console. 
	 * 
	 * 
	 * @param s
	 */
	public static void print (String s ) { 
		System.out.print(s); 
	} // end print 
	
	/* 
	public static void println(String str) { 
		System.out.println(str); 
	
		/** 
		 * 
		 * This pauses the screen for a set amount of time 
		 * 
		 * @param delay
		 */
	public static void pause(int delay) { 
		try { 
			Thread.sleep(delay);
		}
		catch(Exception e) { 	
		}
	} 
	
	public String front3 (String str) { 	 
		if (str.length() < 3) { 
			return str;
		} 
		else { 	
			return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);   
		} 
		}
		
	public static void drawBox(int w, int h) {
		for (int i = 0; i <= w; i = i + 1) {
		System.out.print("*");
		}
		for (int i = 0; i <= h; i = i + 1)
		System.out.println("*");  
		
		
	} 
/** 
 * 
 * The Following are solutions to problems from Test 2 on Arrays and Loops 
 * 
 * 
 * @param str
 */
	public static int takeInteger(String prompt) {
		boolean found = false;
	while(found == false) {
	try {
		Scanner s = new Scanner(System.in);
		System.out.print(prompt);
		int x = s.nextInt();
		return x;
	}
	catch(Exception e) {
		System.out.println("DUDE THATS NOT AN INTEGER");
	};
	}
	return -1;
	}

	// Question 1e
	
	/* 

	public static String[] names = new String[151]
			
			names[names.length() / 2] = ""; 		
	}
	
	*/ 
	  
	
	// FUN JAVA STRING REVERSER VERSION 2 

	
	public static String reverse(String input){
	    char[] in = input.toCharArray();
	    int i =0;
	    int end=in.length-1;
	    char temp;
	    while(end>i){
	        temp = in[i];
	        in[i]=in[end];
	        in[end] = temp;
	        end--;
	        i++;
	    }
	    return new String(in);
	
	
	// FUN JAVA STRING REVERSER VERSION 2 
	    
	    
	    
	    Scanner word = new Scanner(System.in); 

	new StringBuilder(word).reverse().toString(); 

	
	
	
	
	/* 
Scanner input = new Scanner(System.in);
int index = input.indexOf("is");
int count = 0;

	while (index != -1) {
		count++;
		input = input.substring(index + 1);
		index = input.indexOf("is");
}


System.out.println("No of *is* in the input is : " + count); 

*/ 



	

	// THE FOLLOWING ARE A COLLECTION OF THE MANY PROJECT EULER PROBLEMS I DID.
	// I REALLY FOUND MY NICHE IN AND REALLY ENJOYED DOING THESE 
	// THAT I WHY I DID SO MANY!!!
	
	
 // Project Euler: 

// Problem #1 Solution



	public String run() {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		return Integer.toString(sum);
	}
	
	// Project Euler - Problem #2

	
	public String run2() {
		int sum = 0;
		int x = 1;  // Represents the current Fibonacci number being processed
		int y = 2;  // Represents the next Fibonacci number in the sequence
		while (x <= 4000000) {
			if (x % 2 == 0)
				sum += x;
			int z = x + y;
			x = y;
			y = z;
		}
		return Integer.toString(sum);
	}
	
	
	// Project Euler - Problem #3

	
	public String run3() {
		long n = 600851475143L;
		while (true) {
			long p = smallestFactor(n);
			if (p < n)
				n /= p;
			else
				return Long.toString(n);
		}
	}
	
	
	// Returns the smallest factor of n, which is in the range [2, n]. The result is always prime.
	private static long smallestFactor(long n) {
		if (n <= 1)
			throw new IllegalArgumentException();
		for (long i = 2, end = (long) Math.sqrt(n); i <= end; i++) {
			if (n % i == 0)
				return i;
		}
		return n;  // n itself is prime
	}
	
	// Project Euler - Problem #4

	
	public String run4() {
		int maxPalin = -1;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int prod = i * j;
				if (.isPalindrome(prod) && prod > maxPalin)
					maxPalin = prod;
			}
		}
		return Integer.toString(maxPalin);
	}
	
	// Project Euler - Problem #5
	
	
	public String run5() {
		BigInteger allLcm = BigInteger.ONE;
		for (int i = 1; i <= 20; i++)
			allLcm = lcm(BigInteger.valueOf(i), allLcm);
		return allLcm.toString();
	}
	
	
	private static BigInteger lcm(BigInteger x, BigInteger y) {
		return x.divide(x.gcd(y)).multiply(y);
	}

	// Project Euler - Problem #6
	
	private static final int N = 100;

	
	public String run6() {
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
			sum2 += i * i;
		}
		return Integer.toString(sum * sum - sum2);
	}

	// Project Euler - Problem #7
	
	public String run7() {
		for (int i = 2, count = 0; ; i++) {
			if (int.isPrime(i)) {
				count++;
				if (count == 10001)
					return Integer.toString(i);
			}
		}
	}

	// Project Euler - Problem #8
	
	private static final String NUMBER = ""; 
	
	public String run8() {
		long maxProd = -1;
		for (int i = 0; i + ADJACENT <= NUMBER.length(); i++) {
			long prod = 1;
			for (int j = 0; j < ADJACENT; j++)
				prod *= NUMBER.charAt(i + j) - '0';
			maxProd = Math.max(prod, maxProd);
		}
		return Long.toString(maxProd);
	}
	
	
	private static final int ADJACENT = 13;
	
	
	// Project Euler - Problem #9
	
private static final int PERIMETER = 1000;
	
	public String run9() {
		for (int a = 1; a < PERIMETER; a++) {
			for (int b = a + 1; b < PERIMETER; b++) {
				int c = PERIMETER - a - b;
				if (a * a + b * b == c * c) {
					// It is now implied that b < c, because we have a > 0
					return Integer.toString(a * b * c);
				}
			}
		}
		throw new AssertionError("Not found");
	}


	// Project Euler - Problem #10
	
private static final int LIMIT = 2000000;
	
	public String run10() {
		long sum = 0;
		for (int p : .listPrimes(LIMIT - 1))
			sum += p;
		return Long.toString(sum);
	}
	
	
	// Project Euler - Problem #11
	
	
private static final int CONSECUTIVE = 4;
	
	public String run11() {
		int max = -1;
		for (int y = 0; y < SQUARE.length; y++) {
			for (int x = 0; x < SQUARE[y].length; x++) {
				max = Math.max(product(x, y, 1,  0, CONSECUTIVE), max);
				max = Math.max(product(x, y, 0,  1, CONSECUTIVE), max);
				max = Math.max(product(x, y, 1,  1, CONSECUTIVE), max);
				max = Math.max(product(x, y, 1, -1, CONSECUTIVE), max);
			}
		}
		return Integer.toString(max);
	}
	
	
	private static int product(int x, int y, int dx, int dy, int n) {
		// First endpoint is assumed to be in bounds. Check if second endpoint is in bounds.
		if (!isInBounds(x + (n - 1) * dx, y + (n - 1) * dy))
			return -1;
		
		int prod = 1;
		for (int i = 0; i < n; i++, x += dx, y += dy)
			prod *= SQUARE[y][x];
		return prod;
	}
	
	
	private static boolean isInBounds(int x, int y) {
		return 0 <= y && y < SQUARE.length && 0 <= x && x < SQUARE[y].length;
	}
	
	
	private static int[][] SQUARE = {
		{ 8, 2,22,97,38,15, 0,40, 0,75, 4, 5, 7,78,52,12,50,77,91, 8},
		{49,49,99,40,17,81,18,57,60,87,17,40,98,43,69,48, 4,56,62, 0},
		{81,49,31,73,55,79,14,29,93,71,40,67,53,88,30, 3,49,13,36,65},
		{52,70,95,23, 4,60,11,42,69,24,68,56, 1,32,56,71,37, 2,36,91},
		{22,31,16,71,51,67,63,89,41,92,36,54,22,40,40,28,66,33,13,80},
		{24,47,32,60,99, 3,45, 2,44,75,33,53,78,36,84,20,35,17,12,50},
		{32,98,81,28,64,23,67,10,26,38,40,67,59,54,70,66,18,38,64,70},
		{67,26,20,68, 2,62,12,20,95,63,94,39,63, 8,40,91,66,49,94,21},
		{24,55,58, 5,66,73,99,26,97,17,78,78,96,83,14,88,34,89,63,72},
		{21,36,23, 9,75, 0,76,44,20,45,35,14, 0,61,33,97,34,31,33,95},
		{78,17,53,28,22,75,31,67,15,94, 3,80, 4,62,16,14, 9,53,56,92},
		{16,39, 5,42,96,35,31,47,55,58,88,24, 0,17,54,24,36,29,85,57},
		{86,56, 0,48,35,71,89, 7, 5,44,44,37,44,60,21,58,51,54,17,58},
		{19,80,81,68, 5,94,47,69,28,73,92,13,86,52,17,77, 4,89,55,40},
		{ 4,52, 8,83,97,35,99,16, 7,97,57,32,16,26,26,79,33,27,98,66},
		{88,36,68,87,57,62,20,72, 3,46,33,67,46,55,12,32,63,93,53,69},
		{ 4,42,16,73,38,25,39,11,24,94,72,18, 8,46,29,32,40,62,76,36},
		{20,69,36,41,72,30,23,88,34,62,99,69,82,67,59,85,74, 4,36,16},
		{20,73,35,29,78,31,90, 1,74,31,49,71,48,86,81,16,23,57, 5,54},
		{ 1,70,54,71,83,51,54,69,16,92,33,48,61,43,52, 1,89,19,67,48},
	};


	// Project Euler - Problem #12

	
	public String run12() {
		int triangle = 0;
		for (int i = 1; ; i++) {
			if (Integer.MAX_VALUE - triangle < i)
				throw new ArithmeticException("Overflow");
			triangle += i;  // This is the ith triangle number, i.e. num = 1 + 2 + ... + i = i * (i + 1) / 2
			if (countDivisors(triangle) > 500)
				return Integer.toString(triangle);
		}
	}
	
	
	// Returns the number of integers in the range [1, n] that divide n.
	private static int countDivisors(int n) {
		int count = 0;
		int end = (int) Math.sqrt(n);
		for (int i = 1; i < end; i++) {
			if (n % i == 0)
				count += 2;
		}
		if (end * end == n)  // Perfect square
			count++;
		return count;
	}
	
	
	
	// Project Euler - Problem #14 
	
	
	
	public String run14() {
		int maxArg = -1;
		int maxChain = 0;
		for (int i = 1; i < LIMIT; i++) {
			int chainLen = collatzChainLength(BigInteger.valueOf(i));
			if (chainLen > maxChain) {
				maxArg = i;
				maxChain = chainLen;
			}
		}
		return Integer.toString(maxArg);
	}
	
	
	// Can be set to any non-negative number, but there are diminishing returns as you go larger
	private static final BigInteger CACHE_SIZE = BigInteger.valueOf(LIMIT);
	
	// Memoization
	private int[] collatzChainLength = new int[CACHE_SIZE.intValue()];
	
	// Returns the Collatz chain length of the given integer with automatic caching.
	private int collatzChainLength(BigInteger n) {
		if (n.signum() < 0)
			throw new IllegalArgumentException();
		
		if (n.compareTo(CACHE_SIZE) >= 0)  // Caching not available
			return collatzChainLengthDirect(n);
		
		int index = n.intValue();  // Index in the cache
		if (collatzChainLength[index] == 0)
			collatzChainLength[index] = collatzChainLengthDirect(n);
		return collatzChainLength[index];
	}
	
	
	// Returns the Collatz chain length of the given integer, with the
	// first step uncached but the remaining steps using automatic caching.
	private int collatzChainLengthDirect(BigInteger n) {
		if (n.equals(BigInteger.ONE))  // Base case
			return 1;
		else if (!n.testBit(0))  // If n is even
			return collatzChainLength(n.shiftRight(1)) + 1;
		else  // Else n is odd
			return collatzChainLength(n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE)) + 1;
	}

	
	// Project Euler - Problem #16
	
	public String run16() {
		String temp = BigInteger.ONE.shiftLeft(1000).toString();
		int sum = 0;
		for (int i = 0; i < temp.length(); i++)
			sum += temp.charAt(i) - '0';
		return Integer.toString(sum);
	}
	
	
	
	// Project Euler - Problem #17
	
	
	public String run17() {
		int sum = 0;
		for (int i = 1; i <= 1000; i++)
			sum += toEnglish(i).length();
		return Integer.toString(sum);
	}
	
	
	private static String toEnglish(int n) {
		if (0 <= n && n < 20)
			return ONES[n];
		else if (20 <= n && n < 100)
			return TENS[n / 10] + (n % 10 != 0 ? ONES[n % 10] : "");
		else if (100 <= n && n < 1000)
			return ONES[n / 100] + "hundred" + (n % 100 != 0 ? "and" + toEnglish(n % 100) : "");
		else if (1000 <= n && n < 1000000)
			return toEnglish(n / 1000) + "thousand" + (n % 1000 != 0 ? toEnglish(n % 1000) : "");
		else
			throw new IllegalArgumentException();
	}
	
	
	private static String[] ONES = {
		"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
		"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	
	private static String[] TENS = {
		"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	
	
	// Project Euler - Problem #18
	
	
	public String run18() {
		int count = 0;
		for (int y = 1901; y <= 2000; y++) {
			for (int m = 1; m <= 12; m++) {
				if (dayOfWeek(y, m, 1) == 0)  // Sunday
					count++;
			}
		}
		return Integer.toString(count);
	}
	
	
	// Return value: 0 = Sunday, 1 = Monday, ..., 6 = Saturday.
	private static int dayOfWeek(int year, int month, int day) {
		if (year < 0 || year > 10000 || month < 1 || month > 12 || day < 1 || day > 31)
			throw new IllegalArgumentException();
		
		// Zeller's congruence algorithm
		int m = (month - 3 + 4800) % 4800;
		int y = (year + m / 12) % 400;
		m %= 12;
		return (y + y/4 - y/100 + (13 * m + 2) / 5 + day + 2) % 7;
	}
	
	
	// Project Euler - Problem #587!!!!!!

	
	
	public String run587() {
		double lSectionArea = 1 - Math.PI / 4;
		for (int i = 1; ; i++) {
			double slope = 1.0 / i;
			double a = slope * slope + 1;
			double b = -2 * (slope + 1);
			double c = 1;
			double x = (2 * c) / (-b + Math.sqrt(b * b - 4 * a * c));
			double concaveTriangleArea = (x * x * slope / 2) + (integral(1) - integral(x));
			if (concaveTriangleArea / lSectionArea < 0.001)
				return Integer.toString(i);
			if (i == Integer.MAX_VALUE)
				throw new AssertionError();
		}
	}
	
	
	// The indefinite integral of (1 - sqrt(2x - x^2)) dx.
	private static double integral(double x) {
		double t = x - 1;
		return t - (Math.sqrt(x * (2 - x)) * t + Math.asin(t)) / 2;
	}

}





