package com.github.kdvolder.util;

public class Assert {

	public static void isLegalArgument(String name, Object value, boolean test) {
		if (!test) {
			throw new IllegalArgumentException(name+": "+value);
		}
	}

	public static void isLegalState(boolean test) {
		if (!test) {
			throw new IllegalStateException();
		}
	}

}
