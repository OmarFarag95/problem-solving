package leetcode;

public class complement_of_base_10_integer {
	public int bitwiseComplement(int N) {

		int num_digits = decimal_to_binary_digits_number(N);

		int complement = get_complement(num_digits);

		return complement - N;
	}

	public int decimal_to_binary_digits_number(int N) {

		int number_digits = 0;
		while (N != 0) {
			N /= 2;
			number_digits += 1;
		}
		return number_digits;
	}

	public int get_complement(int num_digits) {
		int number = 1;
		int prod = 1;
		for (int i = 1; i < num_digits; i++) {
			prod *= 2;
			number += prod;
		}
		return number;
	}
}
