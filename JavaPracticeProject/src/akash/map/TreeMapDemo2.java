package akash.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<String, String>();

		map.put("akki", "Akash");
		map.put("noty", "Aneri");	
		// map.put(null, null); //Null is not allowed as a key or value
		map.put("JD", "Jay");
		map.put("AAAK", "Jalpan");
		map.put("Ds", "Drashti");
		map.put("KL", null);
		map.put("pl", null);

		System.out.println(map);

		System.out.println("Map contain \"ds\" Value or Not " + map.containsValue("ds")); // It check value contain true
																							// / false
		System.out.println("Map contain \"noty\"  Key or Not " + map.containsKey("noty")); // It check key is contain true / false
		System.out.println("Map is Empty: " + map.isEmpty()); // It check map is Empty
		System.out.println("Size of map: " + map.size()); // Size of map
		System.out.println("Give value of JD Key: " + map.get("JD"));
		System.out.println("Display data in entry styl: " + map.entrySet()); // Give entry set of map
		System.out.println("It remove 18 number value and key: " + map.remove("Ds")); // remove 18 number entry
		System.out.println(map);
		map.put("pizz", "kesh");
		System.out.println(map);
		map.clear(); // Clear map data
		System.out.println(map);

		// no null keys in tree map
		// Ascending order on the basis on key
	}
}
