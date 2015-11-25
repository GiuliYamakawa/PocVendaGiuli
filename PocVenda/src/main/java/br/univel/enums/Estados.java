package br.univel.enums;

public enum Estados {
	
	PR,
	SP,
	SC,
	RS;
	
	public static String[] names() {
	    Estados[] states = values();
	    String[] names = new String[states.length];

	    for (int i = 0; i < states.length; i++) {
	        names[i] = states[i].name();
	    }

	    return names;
	}
}
