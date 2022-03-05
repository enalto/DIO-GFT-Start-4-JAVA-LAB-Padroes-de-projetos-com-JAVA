package one.digitalinnovation.gof.singleton;

/**
 * 
 * @author falvojr
 * @hidden hands on bootcamp DIO
 * 
 */
public class SingletonLazy {

	/*
	 * A palavra-chave volatile garante que vários segmentos lidem com a variável
	 * uniqueInstance corretamente quando está sendo inicializada para a instancia
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
