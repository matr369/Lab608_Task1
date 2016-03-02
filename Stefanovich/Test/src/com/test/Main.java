package com.test;

import java.util.Arrays;
import java.util.Optional;

public class Main {

	public static final int DEFAULT_SIZE = 5;
	public static final String DEFAULT_SYMBOL = "*";

	public static final String ARG_COUNT = "tsize=";
	public static final String ARG_SYMBOL = "tsymb=";

	public static String findStringParam(String[] args, String argName, String defVal) {
		if (args.length > 0) {
			Optional<String> findResult = Arrays.stream(args)
					.filter(arg -> arg.startsWith(argName))
					.findAny()
					.map(str -> str.substring(argName.length()));
			return findResult.orElse(defVal);
		}
		return null;
	}

	public static int findIntegerParam(String[] args, String argName, int defVal) throws NumberFormatException {
		String param = findStringParam(args, argName, null);
		return param == null ? defVal : Integer.parseInt(param.trim());
	}

	public static String buildTriangle(int size, String symbol) {
		StringBuilder resultStrBuilder = new StringBuilder();
		for (int i = 0; i <= size; ++i) {
			for (int j = i; j > 0; --j) {
				resultStrBuilder.append(" ");
				resultStrBuilder.append(symbol);
				resultStrBuilder.append(" ");
			}
			resultStrBuilder.append("\n");
		}
		return resultStrBuilder.toString();
	}

	public static void main(String[] args) {

		int size;
		String symbol = findStringParam(args, ARG_SYMBOL, DEFAULT_SYMBOL);

		try {
			size = findIntegerParam(args, ARG_COUNT, DEFAULT_SIZE);
		} catch (NumberFormatException nfe) {
			System.err.println("E: ! Can't parse param !");
			return;
		}

		if (size <= 0) {
			System.err.println("E: ! NOTING TO DRAW !");
			return;
		}

		System.out.println(buildTriangle(size, symbol));
	}
}
