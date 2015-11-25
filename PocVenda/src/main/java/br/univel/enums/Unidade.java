package br.univel.enums;

public enum Unidade {
	
	KG, 
	UN, 
	PCT, 
	CX;
	
	public static String[] names() {
	    Unidade[] states = values();
	    String[] names = new String[states.length];

	    for (int i = 0; i < states.length; i++) {
	        names[i] = states[i].name();
	    }

	    return names;
	}

}
