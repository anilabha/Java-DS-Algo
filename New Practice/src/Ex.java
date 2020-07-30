
class NewEx extends Throwable {
	@Override
	public String getMessage() {
		return "i am user defined exception";
	}

}

public class Ex {
	public static void main(String[] args) throws NewEx {

		try {

			throw new NewEx();

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
	}

}
