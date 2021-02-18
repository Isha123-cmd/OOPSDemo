package com.valuemomentum.training.InputOutput;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

public class PushbackReaderExample {

	public static void main(String[] args) {
		String input = "This is an example of PushbackReader.";
		StringReader stringReader = null;     //class of reading class to read the input string
		PushbackReader pushbackReader = null;
		try {
			stringReader = new StringReader(input);
			pushbackReader = new PushbackReader(stringReader, 20);

			// Read first character
			int ch = pushbackReader.read();
			System.out.println((char) ch);

			// Push back first character
			pushbackReader.unread(ch);

			char[] c = new char[4];
			// Get first four characters
			pushbackReader.read(c);
			System.out.println(new String(c));

			// Push back first four characters
			pushbackReader.unread(c, 0, 4);     //c refers to char array

			// Read all characters
			c = new char[input.length()];
			pushbackReader.read(c);
			System.out.println(new String(c, 0, input.length()));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pushbackReader != null) {
					pushbackReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}