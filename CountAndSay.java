
import java.util.*;
public class CountAndSay {

	/**
	 * @param args
	 */
	public static void funForCountAndSay(String target){
		HashMap <Integer,Integer> hm = new HashMap <Integer,Integer>();
		char [] targetChar = target.toCharArray();
		for(int i = 0; i < targetChar.length; i++){
			int charToInteger = (int) targetChar[i];
			if(hm.containsKey(charToInteger)){
				int count = hm.get(charToInteger);
				hm.put(charToInteger,count+1);
			}else
				hm.put(charToInteger,1);
		}
		Iterator iter = hm.entrySet().iterator();
		while(iter.hasNext()){
			System.out.println(" "+hm.get(iter.next())+"");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funForCountAndSay("111122221111");
	}

}
