//Given some strings. Find out all anagram. And store them into LinkedList
import java.util.*;

public class anagramWord {

	/**
	 * @param args
	 */
	public static HashMap <String,LinkedList <String>> findAnagramWord(String [] targetSet){
		HashMap <String,LinkedList<String>> hm = new HashMap <String,LinkedList <String>>();
		for(int i = 0; i < targetSet.length; i++){
			char [] targetChar = targetSet[i].toCharArray();
			Arrays.sort(targetChar);
			String targetSortedString = new String(targetChar);
			if(hm.containsKey(targetSortedString)){
				LinkedList <String> ll = hm.get(targetSortedString);
				ll.add(targetSet[i]);
	            hm.put(targetSortedString, ll);
			}else{
				LinkedList <String> lr = new LinkedList <String> ();
				lr.add(targetSet[i]);
				hm.put(targetSortedString, lr);
			}
		}
		return hm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] targetSet = {"abc","cvb","nmb","cba","cab","mbn","fgh","ghf","bac","cbv","opd"};
		
		HashMap <String,LinkedList <String>> result = findAnagramWord(targetSet);
		
		LinkedList <String> printLinkedList = result.get("bcv");
		for(int i = 0; i < printLinkedList.size(); i++)
			System.out.println(printLinkedList.get(i));
	}

}
