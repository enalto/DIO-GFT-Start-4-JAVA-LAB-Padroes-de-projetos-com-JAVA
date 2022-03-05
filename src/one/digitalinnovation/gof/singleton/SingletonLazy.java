package one.digitalinnovation.gof.singleton;

/**
 * 
 * @author falvojr
 * @hidden hands on bootcamp DIO
 * 
 */
public class SingletonLazy {

	/*
	 * A palavra-chave volatile garante que v�rios segmentos lidem com a vari�vel
	 * uniqueInstance corretamente quando est� sendo inicializada para a instancia
	 * singleton
	 */
	private volatile static SingletonLazy uniqueInstance;

	private SingletonLazy() {
		super();
	}

	public static SingletonLazy getInstancia() {
		
		if (uniqueInstance == null) {
			
			synchronized (SingletonLazy.class) {
				
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonLazy();
				}
				
			}
			
		}
		
		return uniqueInstance;
	}

}
