package com.collections;



	import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
public class MapSortByValues {
	

	private static void sortByValues(Map<String, Integer> budget) {
		Map<String, Integer> sorted = budget
	        .entrySet()
	        .stream()
	        .sorted(Entry.comparingByValue())
	        .collect(
	            Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
	                LinkedHashMap::new));
	 
	    System.out.println("map after sorting by values: " + sorted);
	    System.out.println();
	 
	    // above code can be cleaned a bit by using method reference
	    
	    sortByValuesDecendingOrder(budget);
	}

	private static void sortByValuesDecendingOrder(Map<String, Integer> budget) {
		Map<String, Integer> sorted;
		sorted = budget
	        .entrySet()
	        .stream()
	        .sorted(Entry.comparingByValue())
	        .collect(
	            Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
	                LinkedHashMap::new));
	 
		System.out.println("map after sorting by values in Ascending  order: "
		        + sorted);
		System.out.println();
	    // now let's sort the map in decreasing order of value
	    sorted = budget
	        .entrySet()
	        .stream()
	        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
	        .collect(
	            Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
	                LinkedHashMap::new));
	 
	    System.out.println("map after sorting by values in descending order: "
	        + sorted);
	}
	
	public static void main(String args[]) { 

	    // a Map with string keys and integer values
	    Map<String, Integer> budget = new HashMap<>();
	    budget.put("clothes", 120);
	    budget.put("grocery", 150);
	    budget.put("transportation", 100);
	    budget.put("utility", 130);
	    budget.put("rent", 1150);
	    budget.put("miscellneous", 90);
	 
	    System.out.println("map before sorting: " + budget);
	 System.out.println();
	    // let's sort this map by values first
	 manualSortingBasedOnValue(budget);
	 sortBYValuesJava8(budget);
	 
	    sortByValues(budget);
	  }

	private static void sortBYValuesJava8(Map<String, Integer> budget) {
		System.out.println("Java 8 sorting valuesssssssssssssss");
		budget.entrySet().stream()
		   .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
		   .limit(5) 
		   .forEach(System.out::println); // or any other terminal method
	}

	private static void manualSortingBasedOnValue(Map<String, Integer> budget) {
		Set<Map.Entry<String, Integer>> entryset= budget.entrySet();
		 ArrayList<Map.Entry<String,Integer>> ar=new ArrayList(entryset);
		 ar.sort(Entry.<String, Integer>comparingByValue().reversed());
		 LinkedHashMap<String, Integer> lm=new LinkedHashMap<>();
		 for(Entry<String,Integer> e:ar){
			 String key=e.getKey();
			 Integer value=e.getValue();
			 lm.put(key, value);
		 }
		 System.out.println();
		 System.out.println("Value after manual sort without java 8"+lm);
	}
	
}
	 
	
