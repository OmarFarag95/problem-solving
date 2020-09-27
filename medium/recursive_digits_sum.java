package medium;

import java.math.BigInteger;

public class recursive_digits_sum {

	// This solution works perfectly well, but with extremely huge numbers it
	// gives runtime error.

	/*
	 * static BigInteger superDigit(BigInteger num, int k) {
	 * 
	 * BigInteger big=sum(num).multiply(BigInteger.valueOf(k));
	 * 
	 * if ((big.divide(BigInteger.valueOf(10)).intValue()==0)) { return big; }
	 * 
	 * return superDigit(big,1); }
	 * 
	 * 
	 * static BigInteger sum(BigInteger num) { if(num.intValue()== 0) { return
	 * BigInteger.ZERO; }
	 * 
	 * int d =num.mod(BigInteger.valueOf(10)).intValue();
	 * 
	 * num=num.divide(BigInteger.valueOf(10));
	 * 
	 * return (sum(num).add(BigInteger.valueOf(d))); }
	 */

	static int superDigit(BigInteger num, int k) {

		BigInteger big = (num).multiply(BigInteger.valueOf(k));

		int d = big.mod(BigInteger.valueOf(9)).intValue();

		if (d == 0)
			d = 9;

		return d;
	}
}
