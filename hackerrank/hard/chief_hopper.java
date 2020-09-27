package hard;

public class chief_hopper {

	// Complete the chiefHopper function below.

	// calculate energy
	static double find_energy(double E_new, double height) {
		// equation for energy --> E_new = 2*E_old - height
		// E_new and height are given ---> E_old = (E_new + height) / 2
		double E_old = (E_new + height) / 2;
		if (E_old % 1 != 0) {
			E_old = (int) (E_old) + 1;
		}

		return E_old;
	}

	static int chiefHopper(int[] arr) {

		// starting from the end of builidings, and assuming minimum energy to be 0

		int E = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			E = (int) find_energy(E, arr[i]);
		}

		return E;

	}
}