package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WordCountAssignment {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		TreeMap<String, Integer> charCountMap = new TreeMap<>();
		TreeMap<String, Integer> numCountMap = new TreeMap<>();
		TreeMap<String, Integer> splCharCountMap = new TreeMap<>();
		String text;
		try (BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\monalee.pawar\\git\\repository\\assignments\\src\\assignment\\char.txt"))) {
			while ((text = br.readLine()) != null) {
				String upperCaseString = text.toString().toUpperCase();
				char[] charArray = upperCaseString.toCharArray();
				for (char c : charArray) {
					String s = String.valueOf(c);
					if (s.matches("^[A-Z]*$")) {
						if (charCountMap.containsKey(s)) {
							charCountMap.put(s, charCountMap.get(s) + 1);
						} else {
							charCountMap.put(s, 1);
						}
					} else if (s.matches("^[0-9]*$")) {
						if (numCountMap.containsKey(s)) {
							numCountMap.put(s, numCountMap.get(s) + 1);
						} else {
							numCountMap.put(s, 1);
						}
					} else if (!(s.matches("\\s"))) {
						if (splCharCountMap.containsKey(s)) {
							splCharCountMap.put(s, splCharCountMap.get(s) + 1);
						} else {
							splCharCountMap.put(s, 1);
						}
					}
				}
			}
			
			//output
			System.out.println("Alphabets");
			if (charCountMap == null) {
				System.out.println("Nil");
			} else {
				for (Entry<String, Integer> entry : charCountMap.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
				}
			}
			System.out.println("......................................................");
			System.out.println("Numbers");
			if (numCountMap.isEmpty()) {
				System.out.println("Nil");
			} else {
				for (Entry<String, Integer> entry : numCountMap.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
				}
			}
			System.out.println("......................................................");
			System.out.println("Special Characters");
			if (splCharCountMap.isEmpty()) {
				System.out.println("Nil");
			} else {
				for (Entry<String, Integer> entry : splCharCountMap.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
				}
			}
			System.out.println("......................................................");
			
		} catch (IOException e) {
			System.out.println("IOException in try block =>" + e.getMessage());
		}
	}
}
