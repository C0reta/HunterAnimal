package Animal;

public class Hawk extends Animal {

	public Hawk() {
		this.name = "Hawk";
		this.setHuntProb(30);
	}

	public Hawk(String name) {
		this();
		this.name = name;
	}

	public Hawk(String name, int huntprob) {
		this.name = name;
		this.setHuntProb(huntprob);
	}

	public void Move() {

	}

	public void Fly() {

	}

	@Override
	public void Play() {
		System.out.println("�������� ���ƴٴϸ鼭 ��� ���� �������� ������ �ٺ��� �� �ð��� ���� ��������~");

	}

}
