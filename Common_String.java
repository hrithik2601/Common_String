package com.prep.pattern;

import java.util.Arrays;
import java.util.Scanner;

public class Common_String {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str1 = scn.nextLine().toLowerCase();
		String str2 = scn.nextLine().toLowerCase();
		if (twoStrings(str1, str2)) 
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
	static int MAX_CHAR = 26;
	 static boolean twoStrings(String s1, String s2) {
		 boolean v[] = new boolean[MAX_CHAR];
		 Arrays.fill(v, false);
		for(int i = 0; i < s1.length(); i++)
			v[s1.charAt(i) - 'a'] = true;
			for(int i = 0; i < s2.length(); i++) 
				if (v[s2.charAt(i) - 'a']) return true;
			return false;
			
		
	}
		
	}


