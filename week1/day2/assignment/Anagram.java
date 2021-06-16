package week1.day2.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="stops";
		String str2="potss";
		int flag=0;
		char char1[]=new char[str1.length()];
		char char2[] =str1.toCharArray();
		 if(str1.length()==str2.length()) {
			 for (int i = 0; i < str1.length(); i++) {
				 
				  char1[i]=str1.charAt(i);
				 // char2[i]=str1.charAt(i);	
			}
			 
			 Arrays.sort(char1);
			 Arrays.sort(char2);
			 for (int i = 0; i < char2.length; i++) {
				 if(char1[i]!=char2[i]) {
					 flag=1;
				 }
				
			}
			if(flag==0){
				System.out.println("Both strings are equal");
			}
		 }

	}

}
