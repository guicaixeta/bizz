package biz;

public class Biz {
	static public String jogar(int num) {
		if (num % 15 == 0) {
			System.out.println("FizBuz");
			return "FizBuz";
		} else if (num % 3 == 0) {
			System.out.println("Fiz");
			return "Fiz";
		} else if (num % 5 == 0) {
			System.out.println("Buz");
			return "Buz";
		} else {
			System.out.println("Continue");
			return "Continue";
		}
	}
}
