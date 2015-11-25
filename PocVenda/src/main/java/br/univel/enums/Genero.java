package br.univel.enums;

public enum Genero {
	
	FEMININO,
	MASCULINO;
	
	public static String[] names() {
		Genero[] states = values();
	    String[] names = new String[states.length];

	    for (int i = 0; i < states.length; i++) {
	        names[i] = states[i].name();
	    }

	    return names;
	}

}
