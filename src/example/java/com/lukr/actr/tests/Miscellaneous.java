package com.lukr.actr.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.apache.commons.codec.digest.DigestUtils;

public class Miscellaneous {
	
	public static void main(String[] args) {
		//      <T-ype , R-esult >
		Function<String, Integer> function = x -> x.length();
		
		Integer apply = function.apply("lucia");
		
		System.out.println(apply);
		
		
		// -----------------
		Miscellaneous miscellaneous = new Miscellaneous();
		List<String> list = Arrays.asList("node", "c++", "java", "JavaScript");
		List<String> result = miscellaneous.map(list, miscellaneous::sha256);
		result.forEach(System.out::println);
	}
	
	
	public <T, R> List<R> map(List<T> list, Function<T, R> func) {
		
		List<R> result = new ArrayList<>();
		for (T t : list) {
			result.add(func.apply(t));
		}
		return result;
	}
	
	public String sha256(String str) {
		return DigestUtils.sha256Hex(str);
	}
}
