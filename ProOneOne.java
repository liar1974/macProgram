//Check whether a string contains duplicate char
public class ProOneOne {

	/**
	 * @param args
	 */
	public static boolean isUniqueChar(String str){
		boolean [] charSet = new boolean[256];
		for(int i = 0; i < str.length(); i++){
			int val = str.charAt(i);
			if(charSet[val])
				return false;
			charSet[val] = true;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = ProOneOne.isUniqueChar("acvjbop");
		System.out.print(result);
	}

}
