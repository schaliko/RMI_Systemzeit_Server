public class DemoAgent implements Agent {
	private int n;
	private int sum;

	public DemoAgent(int n) {
		this.n = n;
	}

 	public void execute() {
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
	}

	public int getResult() {
		return sum;
	}
}