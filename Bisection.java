
public class Bisection {
	
	double initial_value; /// Initial value of the root interval.
	double final_value; /// Final value of the root interval.
	double mid_value;
	
	static double calculate(double point) {
		return point * point - 9;
	}
	
	Interval(double new_initial_value, double new_final_value) {
		new_initial_value = initial_value;
		new_final_value = final_value;
		
		while(true) {
			if (calculate(new_initial_value) * calculate(new_final_value) < 0) {
				new_final_value = (new_initial_value + new_final_value) / 2;
			}
		}
	}
	
}
