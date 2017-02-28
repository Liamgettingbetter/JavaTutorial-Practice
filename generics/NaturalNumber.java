package generics;

public class NaturalNumber<T extends Integer> {
	private T n;

	public NaturalNumber(T t) { this.n = t; }

	public boolean isEven() {
		return n.intValue() % 2 == 0;
	}

	public static void main(String[] args) {
		NaturalNumber<Integer> n = new NaturalNumber<>(122);
		System.out.println(n.isEven());
	}
}