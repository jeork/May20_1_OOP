import java.util.Random;

public class Computer {

	User u = new User();
	int num_coin;
	int coin;
	String user_answer;
	String result;

	// 동전 갯수 물어보기
	public void ask_coin() {
		System.out.print("동전 몇개로 하시나요 : ");
	}

	// 동전 섞기
	public int mix_coin(int num_coin) {
		Random r = new Random();
		coin = r.nextInt(num_coin) + 1;
		return coin;
	}

	// 사용자에게 홀짝 물어보기
	public void ask_answer() {
		System.out.print("홀 or 짝 :");
	}

	// 게임 결과 알려주기
	public void result_game(int coin, String user_answer) {
		String result = null;
		System.out.println("동전 : " + coin);
		if (coin % 2 == 0) {
			result = "짝";
			System.out.println("정답 : 짝");
		} else {
			result = "홀";
			System.out.println("정답 : 홀");
		}
		if (user_answer.equals(result))
			System.out.println("정답!");
		else
			System.out.println("땡!");
	}

	public void start() {
		this.ask_coin();
		int num_coin = u.coin_answer();
		int mixed_coin = mix_coin(num_coin);
		ask_answer();
		String user_answer = u.result_answer();
		result_game(mixed_coin, user_answer);
	}
}
