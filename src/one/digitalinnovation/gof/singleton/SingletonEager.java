package one.digitalinnovation.gof.singleton;

/**
 * 
 * @author falvojr
 *
 * 
 */
public class SingletonEager {

	private static SingletonEager uniqueInstance = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {
		return uniqueInstance;
	}

}
