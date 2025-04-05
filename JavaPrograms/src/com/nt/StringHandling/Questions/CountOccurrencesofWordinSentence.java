package com.nt.StringHandling.Questions;

import java.util.HashSet;
import java.util.Scanner;

public class CountOccurrencesofWordinSentence {

	/*public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Sentence: ");	
		String sentence=sc.nextLine().trim();
		String srr[]=sentence.split("\\s+");
		
		HashSet<String> counted = new HashSet<>();
		
		for(int i=0;i<srr.length;i++) // the
		{ if(!counted.contains(srr[i].toLowerCase())) {
			int count =0;
			for(int j=0;j<srr.length;j++) // birds
			{
				if(srr[i].equalsIgnoreCase(srr[j]))
					count++;
					
			}
			System.out.println(srr[i]+": Occurance - "+count);
			counted.add(srr[i].toLowerCase());
		  }
	    }
		
	}*/
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sentence = sc.nextLine().trim();
        String words[] = sentence.split("\\s+");
        
        boolean counted[] = new boolean[words.length]; // To track counted words
        
        for (int i = 0; i < words.length; i++) {
            if (!counted[i]) { // If the word is not counted yet
                int count = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        count++;
                        counted[j] = true; // Mark word as counted
                    }
                }
                System.out.println(words[i] + " Occurrence: " + count);
            }
        }
        sc.close();
    }

}
