package Animal;

public class Dog extends Animal {

	public Dog() {
		this.name = "Dog";
		this.setHuntProb(80);
	}

	public Dog(String name) {
		this();
		this.name = name;
	}

	public Dog(String name, int huntprob) {
		this.name = name;
		this.setHuntProb(huntprob);
	}

	public void Move() {

	}

	@Override
	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("�������� ���ӿ��� �پ�ϸ� ��ϴ� �۸۸�~");
		BiteDoll();
		RunAwayWithShoes();

	}

	public void Study() {

	}

	public void BiteDoll() {
		System.out.println("������ �������? �۸�~");
	}

	public void RunAwayWithShoes() {
		System.out.println("�Ź��� ���� ������ ������? �۸�~");
	}

	// ����������
	public void ���ֺθ���() {
		System.out.println("�۸�...�۸�....���� ���ָ� �θ��� ������ ");
		System.out.println("������ ���ؼ� ���� ���� power�� �淯�� Ż���� �õ��ؾ���!");
		this.power += 10;
	}

}
