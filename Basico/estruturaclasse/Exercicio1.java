package basico.estruturaclasse;

import java.util.*;

class D {
	public static void main(String[] args) {
		ArrayList<String> existing = new ArrayList<String>();

		for (String arg: args) {
			if (new E().exists(args))
				existing.add(args);
		}
	}
}

import java.io.*;

class E {
	public boolean exists(String name) {
		File f = new File(name);
		return f.exists();
	}
}