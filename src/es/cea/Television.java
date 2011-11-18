package es.cea;

public class Television {

	public Programa enciende(Espectador espectador) {
		if(espectador==null)
			throw new RuntimeException("esto no puede ser");
		Programa programa=new Programa();
		programa.titulo="Pocoyo";
		if(espectador.edad<18) return programa;
		programa.titulo="Salvados";
		return programa;
	}

}
