package akash.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(56, "Akash");
		map.put(39, "Aneri");
		map.put(79, "Drashti");
		// map.put(null, null); //Null is not allowed as a key or value
		map.put(66, "Jay");
		map.put(18, "Jalpan");
		map.put(6, null);

		System.out.println(map);

		System.out.println("Map contain \"ds\" Value or Not " + map.containsValue("ds")); // It check value contain true
																							// / false
		System.out.println("Map contain 9  Key or Not " + map.containsKey(9)); // It check key is contain true / false
		System.out.println("Map is Empty: " + map.isEmpty()); // It check map is Empty
		System.out.println("Size of map: " + map.size()); // Size of map
		System.out.println("Give value of 16 number Key: " + map.get(16));
		System.out.println("Display data in entry styl: " + map.entrySet()); // Give entry set of map
		System.out.println("It remove 18 number value and key: " + map.remove(18)); // remove 18 number entry
		System.out.println(map);
		map.put(18, "kesh");
		System.out.println(map);
		map.clear(); // Clear map data
		System.out.println(map);

		// no null keys in tree map
		// Ascending order on the basis on key
		// all methods is non synchronize
	}
}
