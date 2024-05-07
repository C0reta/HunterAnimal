package Animal;

public class Snake extends Animal {
	int toxic;

	public Snake() {
		this.name = "Snake";
		this.toxic = 100;
		this.setHuntProb(20);
	}

	public Snake(String name) {
		this();
		this.name = name;
	}

	public Snake(String name, int huntprob) {
		this.name = name;
		this.setHuntProb(huntprob);
	}

	public void Crawl() {

	}

	public void CoilUp() {
		System.out.println("�ʸ��ʸ� �ʸ��� Ʋ��� ����~");
	}

	@Override
	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("���� ~ ����~");
		CoilUp();

	}

}
