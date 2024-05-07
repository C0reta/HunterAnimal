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
		System.out.println("강아지가 숲속에서 뛰어나니며 놉니다 멍멍멍~");
		BiteDoll();
		RunAwayWithShoes();

	}

	public void Study() {

	}

	public void BiteDoll() {
		System.out.println("인형을 물어뜯어볼까? 멍멍~");
	}

	public void RunAwayWithShoes() {
		System.out.println("신발을 물고 도망을 가볼까? 멍멍~");
	}

	// 동물원에서
	public void 재주부리기() {
		System.out.println("멍멍...멍멍....나는 재주를 부리는 강아지 ");
		System.out.println("열심히 일해서 돈도 벌고 power도 길러서 탈출을 시도해야지!");
		this.power += 10;
	}

}
