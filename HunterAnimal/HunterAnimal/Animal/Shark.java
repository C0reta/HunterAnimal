package Animal;

public class Shark extends Animal {

	public Shark() {
		this.name = "Shark";
		this.setHuntProb(0);
	}

	public Shark(String name) {
		this(); // ����κ� �⺻������ ó��
		this.name = name;
	}

	public Shark(String name, int huntprob) {
		this.name = name;
		this.setHuntProb(huntprob);
	}

	public void Swim() {

	}

	public void Move() {

	}

	@Override
	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("����� �������ݾ�! ���� � �ٴٷ� ������!!!~ �����");

	}

}
