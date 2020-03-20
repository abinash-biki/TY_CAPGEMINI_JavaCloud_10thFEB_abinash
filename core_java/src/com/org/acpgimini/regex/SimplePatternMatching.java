package com.org.acpgimini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimplePatternMatching {
public static void main(String[] args) {
	Pattern pattern=Pattern.compile("\\d");
	Matcher matcher=pattern.matcher("1");
	System.out.println(matcher.matches());
}
}
