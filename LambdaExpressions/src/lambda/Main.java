package lambda;

public class Main {
	public static void main(String[] args) {
		Teste t = new Teste();
		Ixpto obj = new Cxpto();
		t.exec(obj, 15);
		t.exec(new Ixpto() {
			public void metod(int v) {
				System.out.println("Ixpto " + v);
			}
		}, 33);
		Ixpto ix = (v) -> {
			System.out.println("lambda ix " + v);
		};
		t.exec(ix, 55);
		t.exec((v) -> {
			System.out.println("lambda " + v);
		}, 77);
	}
}
