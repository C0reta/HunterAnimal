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
		System.out.println("여기저리 날아다니면서 놀고 싶은 독수리가 오늘은 바빠서 놀 시간이 없음 수리수리~");

	}

}
