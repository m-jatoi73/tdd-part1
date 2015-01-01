package sibisoft.code;

import java.util.Hashtable;

public class Bank {

	private Hashtable<Pair, Integer> rates= new Hashtable<Pair, Integer>();
	
	Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}
	
	int rate(String from, String to) {
		Integer rate= (Integer) rates.get(new Pair(from, to));
		return rate.intValue();
	}
	
	void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), new Integer(rate));
	}
}
