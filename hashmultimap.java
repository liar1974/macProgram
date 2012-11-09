//hash multi map
import java.util.*;

public class hashmultimap {

	/**
	 * @param args
	 */
	public static void createHashMultiMap(){
		HashMap <String,LinkedList <Integer>> hm = new HashMap <String, LinkedList <Integer>>();
		LinkedList <Integer> link1 = new LinkedList <Integer>();
		LinkedList <Integer> link2 = new LinkedList <Integer>();
		
		link1.add(1);
		link1.add(3);
		
		link2.add(4);
		link2.add(6);
		link2.add(9);
		hm.put("a", link1);
		hm.put("b", link2);
		
		System.out.println(hm.get("a").poll());
		System.out.println(hm.get("a").poll());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashmultimap.createHashMultiMap();
	}

}
