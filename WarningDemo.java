class Box<T> {
	public void set(T t) { /* ... */ }
}

public class WarningDemo {
	public static void main(String[] args) {
		Box<Integer> bi;
		bi = createBox();
	}

	@SuppressWarnings("unchecked")
	static Box createBox() {
		return new Box();
	}
}