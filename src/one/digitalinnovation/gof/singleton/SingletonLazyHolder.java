package one.digitalinnovation.gof.singleton;

/**
 * 
 * @author falvojr
 *
 * 
 */
public class SingletonLazyHolder {

	private static class Holder {
		private static SingletonLazyHolder uniqueInstance = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstancia() {
		return Holder.uniqueInstance;
	}

}
