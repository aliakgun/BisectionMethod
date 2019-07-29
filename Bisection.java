/**
 * 
 * @author Ali akgun
 * @todo develop algorithm !! :)
 * @brief
 * @date 30.07.2019
 * @bug
 * initial value, final value , and mid value data type problem
 * when they are int this program work successfully.
 */
public class Interval {
	
	double initial_value; /// Initial value of the root interval.
	double final_value; /// Final value of the root interval.
	double mid_value;
	double root; //root of the function.
	
	static double calculate(double point) {
		return point * point - 9;
	}
	
	public Interval(double new_initial_value, double new_final_value) {
		initial_value = new_initial_value;
		final_value = new_final_value;
		
		while(true) {
			if ((calculate(initial_value) * calculate(final_value)) < 0) {
				initial_value = (initial_value + final_value) / 2.0;
			
			}else if (calculate(initial_value) <= 0.1) {
				root = initial_value;
				break;
			}
		}
	}
	
}
