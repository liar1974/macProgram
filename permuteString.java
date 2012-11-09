//permute a string. But this method doesn't work for duplicate char in a string.
public class permuteString {
	public static void permute(String str){
		int length = str.length();
		char [] in = str.toCharArray();
		StringBuffer out = new StringBuffer();
		boolean [] used = new boolean[length];
		doPermute(in,out,used,length,0);
	}
	
	public static void doPermute(char [] in, StringBuffer out, boolean [] used,int length, int level){
		if(length == level){
			System.out.println(out.toString());
			return ;
		}
		
		for(int i = 0; i < length; i++){
			if(used[i])
				continue;
			
			out.append(in[i]);
			used[i] = true;
			doPermute(in,out,used,length,level+1);
			used[i] = false;
			out.setLength(out.length()-1);
		}
	}
	public static void main(String [] args){
		permute("abc");
	}
}
