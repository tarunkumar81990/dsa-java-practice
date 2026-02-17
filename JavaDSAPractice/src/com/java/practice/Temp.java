package com.java.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Temp {
	
	public static void stringExpansion1(String input) {
		StringBuilder builder = new StringBuilder();
		String letters = "";
		String count = "";
		for (char ch : input.toCharArray()) {

			if (Character.isLetter(ch)) {
				if (!count.isEmpty()) {
					int c = Integer.parseInt(count);
					for (int i = 0; i < c; i++) {
						builder.append(letters);

					}
					letters = "";
					count = "";

				}
				letters += ch;
			} else {
				count += ch;
			}

		}
		int c = Integer.parseInt(count);
		for (int i = 0; i < c; i++) {
			builder.append(letters);

		}
		System.out.println(builder.toString());

	}

	
	
	
	
	
	
	
	
	
	
	
	
	public static void stringExpansion(String input){
        StringBuilder builder= new StringBuilder();
        String count="";
        String letter="";
        for(char ch: input.toCharArray()){
            if(!Character.isDigit(ch)){
               letter=letter+ch;
            }
            else if(!(letter.isEmpty())){
                 count=count+ch;
                 continue;
            }
            int countValue= Integer.parseInt(count);
            for(int i=0;i<countValue;i++){
                builder.append(letter);
            }
            letter="";
            count="";
            
        }
        
        System.out.println(builder.toString());
        
        
        
        
        
        
    }
	
	
	
	
	
	
	
	
	
	

	 public static void countAnagram(String[] input){
		  HashMap<String,Integer> hmap= new HashMap<>();
	        HashMap<String, String> hmap2= new HashMap<>();
	    for(String entry:input){
	       char[] data= entry.toCharArray();
	       Arrays.sort(data);
	       String word=new String(data);
	        hmap.put(word,hmap.getOrDefault(word,0)+1);
	        hmap2.putIfAbsent(word,entry);
	    }
	    
	    
	    for(Map.Entry<String,Integer> entryData:hmap.entrySet()){
	        System.out.println(hmap2.get(entryData.getKey())+" : "+entryData.getValue());
	    }


	    }
	 
	 
	 
	 public static void splitLetterDigits(String input){
	        String letters="";
	        String number="";

	        
	    for(char ch:input.toCharArray()){
	        if(Character.isLetter(ch)){
	            if(!number.isEmpty()){
	                System.out.println(letters+" "+number);
	                letters="";
	                number="";
	            }
	            letters=letters+ch;
	        }
	            if(Character.isDigit(ch)){
	                number=number+ch;
	            }

	        }
	        if(!letters.isEmpty() || !number.isEmpty()){
	            System.out.println(letters+" "+number);
	        }


	    }
	    public static void main(String[] args){
	      String[] input=  {"eat","tea","ate","team","mate","test"};
	        countAnagram(input);
	    	//stringExpansion1("a3e12c4");
	    	//splitLetterDigits("100India100world20test30");
	        
	    }
	}
	

