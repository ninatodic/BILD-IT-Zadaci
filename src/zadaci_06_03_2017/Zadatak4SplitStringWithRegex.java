package zadaci_06_03_2017;

import java.util.ArrayList;

public class Zadatak4SplitStringWithRegex {

	public static void main(String[] args) {
		String s = "bla#bla#bla";
		String[] split = split(s, "#");
		
		
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i] + " ");
		}
	}
	public static String[] split(String s, String regex){
		char [] reg = getRegArr(regex);
		ArrayList <String> list = new ArrayList<>();
		int indexOfReg = 0;
		
		while(indexOfReg!=-1){
			indexOfReg = getIndexOfReg(s, reg);
			if (indexOfReg>=0) {
				String subS = s.substring(0, indexOfReg);
				list.add(subS);
				String subS2 = s.charAt(indexOfReg)+"";
				list.add(subS2);
				s = s.substring(indexOfReg + 1);
			}
			
		}
		String[] split = new String [list.size()];
		split = list.toArray(split);
		return split;
	}
	private static int getIndexOfReg(String s, char[] reg) {
		int min = s.length();
		for (int i = 0; i < reg.length; i++) {
			if(s.indexOf(reg[i])<min && s.indexOf(reg[i])!=-1){
				min = s.indexOf(reg[i]);
			}
		}
		return min;
	}
	private static char[] getRegArr(String regex) {
		char[] reg = new char [regex.length()];
		if(regex.charAt(0)=='['){
			for (int i = 1; i < reg.length-1; i++) {
				reg[i] = regex.charAt(i);
			}
		}else{
			reg[0] = regex.charAt(0);
		}
		return reg;
	}

}
