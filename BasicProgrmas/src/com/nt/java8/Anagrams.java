package com.nt.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 *  Java 8 program to check if two strings are anagrams or not?
 */
public class Anagrams {

	public static void main(String[] args) {
    
		String s1 = "RaceCar";
        String s2 = "RaceCar";
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2= Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if(s1.equals(s2)) {
        	System.out.println("both are anagrams");
        }else {
        	System.out.println("not anagrams");
        }


	}

}
