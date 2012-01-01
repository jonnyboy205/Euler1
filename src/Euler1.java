import java.util.ArrayList;
import java.util.HashSet;

public class Euler1 {
	
	private static final int TARGET = 1000;
	private static final boolean DEBUG = false;
	
	public static int calc(){
		//compile multiples of 3 below 1000
		ArrayList<Integer> multiplesOf3 = getMultiplesOfAndBelow(3, TARGET);
		
		//compile multiple of 5 below 1000
		ArrayList<Integer> multiplesOf5 = getMultiplesOfAndBelow(5, TARGET);
		
		//compile together these lists, and calcSum
		
		HashSet<Integer> compiledSet = new HashSet<Integer>();
		compiledSet.addAll(multiplesOf3);
		compiledSet.addAll(multiplesOf5);
		
		ArrayList<Integer> compiledList = new ArrayList<Integer>();
		compiledList.addAll(compiledSet);
		
		int sum = 0;
		for (Integer i: compiledList){
			sum+=i;
		}
		
		return sum;
	}
	
	private static ArrayList<Integer> getMultiplesOfAndBelow(int of, int below){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for (int i=of; i<below; i+=of){
			if (DEBUG)
				System.out.println(i);
			ret.add(i);
		}
		
		return ret;
	}
	
}
