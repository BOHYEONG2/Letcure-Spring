package aop.anno;

public class Designer implements Employee {

	@Override
	public void work() {
		System.out.println("디자이너가 출근을 거부합니다.");
	}
}
