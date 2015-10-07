package cup.example;

public class Singleton {

	private Singleton() {
	}

	public static Singleton getInstance() {
		return NewSingletonHolder.INSTANCE;
	}

	private static class NewSingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}
}