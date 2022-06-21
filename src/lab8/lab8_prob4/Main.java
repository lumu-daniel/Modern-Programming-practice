package lab8.lab8_prob4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public int countWords(List<String> words, char c, char d, int len) {
		
		return words.stream()
				.filter(name -> hasLengthOfLen(name, len))
				.filter(name -> containsChar(name, c))
				.filter(name -> doesNotContains(name, d))
				.collect(Collectors.toList()).size();
	}
	
	
	public boolean hasLengthOfLen(String word, int len) {
		return word.length() == len;
	}
	
	public boolean containsChar(String word, char c) {
		return word.contains(c+"");
	}
	
	public boolean doesNotContains(String word, char d) {
		return !word.contains(d+"");
		
	}
	
	
	public static void main(String[] args) {
		List<String> friends = 
			    Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Nowel", "Scott");
		Main test = new Main();
		System.out.println(test.countWords(friends, 'a', 't', 4));
	}

}
