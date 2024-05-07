package Place;

import Animal.Animal;
import Main.*;

public class Zoo extends Place implements Workable, Escapeable {
	private static Zoo instance = null;

	private Zoo() {
		this.where = "Zoo";
		animals = new Animal[size];
	}

	public static Zoo getInstance() {
		if (instance == null)
			instance = new Zoo();
		return instance;
	}

	public void Show() {
		System.out.println("==========================================================================");
		System.out.print("## 동물원에 있는 동물들 :");

		showAnimals(animals, numOfAnimals);
	}

	// 오... 이거 뭔지 잘 모르겟음
	public void Work() {
		System.out.println("동물들이 동물원에서 일을 합니다.");
		System.out.println("재주를 부려서 돈을 많이 벌면 탈출할 수 있어요.");
		Workable[] w = getAnimals(); // Workable 한 기능으로 접근하도록 설정

		for (int i = 0; i < numOfAnimals; i++) {
			w[i].재주부리기();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void escape() {
		Escapeable[] e = getAnimals(); // 동물 [] 을 리턴
		// 탈출할 동물 고르기
		int rand = (int) (Math.random() * 100) % this.numOfAnimals;

		// 각 동물의 확률에 따라 탈출을 시도한다.
		// e[i]. 으로 접근하면 escape() 만 보인다!
		e[rand].Escape();

	}
}
