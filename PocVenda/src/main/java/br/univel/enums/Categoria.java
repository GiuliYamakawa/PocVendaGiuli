package br.univel.enums;

public enum Categoria {
	
	LIMPEZA, 
	PE�AS, 
	ALIMENTA��O;

	public static String[] names() {
		Categoria[] states = values();
	    String[] names = new String[states.length];

	    for (int i = 0; i < states.length; i++) {
	        names[i] = states[i].name();
	    }

	    return names;
	}
}
