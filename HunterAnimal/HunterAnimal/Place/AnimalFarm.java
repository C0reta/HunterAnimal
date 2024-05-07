package Place;

import Main.*;
import Animal.*;

public class AnimalFarm extends Place implements Escapeable {
	private static AnimalFarm instance = null;

	private AnimalFarm() {
		this.where = "AnimalFarm";
		animals = new Animal[10];
	}

	private AnimalFarm(int size) {
		this.where = "AnimalFarm";
		animals = new Animal[size];
	}

	// 이게마즘????
	public static AnimalFarm getInstance() {
		if (instance == null)
			instance = new AnimalFarm();
		return instance;
	}

	public static AnimalFarm getInstance(int size) {
		if (instance == null)
			instance = new AnimalFarm(size);
		return instance;
	}

	public void Show() {
		System.out.println("==========================================================================");
		System.out.print("## 동물농장에 있는 동물들 :");

		showAnimals(animals, numOfAnimals);

	}

	public void Escape() {
		Forest forest = Forest.getInstance();
		// 랜덤하게 30% 확률로 탈출.
		System.out.println("동물들은 기회만 있으면 탈출을 시도합니다!. 탈출확률은 30% 입니다.");
		// 랜덤하게 처리하거나, 마리수를 정해놓거나~

		for (int i = 0; i < numOfAnimals; i++) {
			int r = (int) (Math.random() * 1000) % 3;
			if (r == 1) {
				System.out.println(this.animals[i].name + "이 사냥꾼의 동물농장에서 탈출했습니다!!");
				forest.addAnimal(this.animals[i]);

				// removeAnimal
				this.animals[i] = this.animals[numOfAnimals - 1];
				this.animals[numOfAnimals - 1] = null;
				numOfAnimals--;
			} else
				System.out.println(this.animals[i].name + "이 탈출에 실패했습니다.ㅜ ");
		}
	}

}
