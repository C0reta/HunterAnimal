package Animal;

public class Shark extends Animal {

	public Shark() {
		this.name = "Shark";
		this.setHuntProb(0);
	}

	public Shark(String name) {
		this(); // 공통부분 기본생성자 처리
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
		System.out.println("여기는 숲속이잖아! 나를 어서 바다로 보내줘!!!~ 상어상어");

	}

}
