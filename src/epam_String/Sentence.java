package epam_String;

import java.util.Scanner;


public class Sentence {
	
	

	public static void main(String args[]) {
		System.out.println("Enter text.The sentence ends with a dot and a space. Words are groomed with one space ");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String[] sentences = text.split("\\. ");
		for(String sentence : sentences){
			System.out.println(sentence);
		}
		int size = sentences.length;
		String [][] words = new String[size][];
	
		for(int i = 0;i<size;i++){
			words[i] = sentences[i].split(" ");
		
			
		}
	
		 
		
		
		
		for(int i = 0; i < words.length; i++){
			int min = 0;
			int max = 0;
			String maxWord = words[i][0]; 
			
			String minWord = words[i][0];
			for(int j=0; j < words[i].length; j++ ){
				if(words[i][j].length() > maxWord.length()){
					max = j;
				}
				if(words[i][j].length() < minWord.length()){
					min = j;
				}
				
			}
			words[i][min]=words[i][max];
		}
		
		for(int i =0;i<words.length;i++){
			for(String word : words[i]){
				System.out.print(word);
			}
			System.out.println();
			
		}
		
	
	}
	
	
		
	}


