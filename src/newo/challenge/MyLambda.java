package newo.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

@FunctionalInterface
interface BooleanFunction{
	boolean run(int n);
}

class MyLambda {

	
//	public boolean isOdd(int n) {
//		return ;
//	}
//	
	
	BooleanFunction isOdd = (n) -> {return (n>0 && n%2 != 0)? false: true;};
	BooleanFunction isPrime = (n) -> {
		for (int i=2; i<n; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;};
	BooleanFunction isPalindrome = (n) -> {
		String strNum = String.valueOf(n);
		int numChars = strNum.length();
		for (int i=0; i<numChars/2; i++) {
			if (strNum.charAt(i) != strNum.charAt(numChars-i-1)) {
				return false;
			}
		}
		return true;};
	
	public List<List<String>> checker(List<Integer> nums) {
		
		
		List<List<String>> result = new ArrayList<List<String>>();
		nums.forEach((n) ->{ 
			List<String> charac = new ArrayList<String>();
			charac.add("input:"+String.valueOf(n));
			charac.add("isOdd:"+String.valueOf(isOdd.run(n)));
			charac.add("isPrime:"+String.valueOf(isPrime.run(n)));
			charac.add("isPalindrome:"+String.valueOf(isPalindrome.run(n)));
			result.add(charac);});
		return result;
	}
}
