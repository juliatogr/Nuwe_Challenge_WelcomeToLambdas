package newo.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WelcomeToLambdas {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(4,5,898,34));
		System.out.println(nums);
		
		MyLambda l = new MyLambda();
		
		System.out.println(l.checker(nums));
		
	}
}
