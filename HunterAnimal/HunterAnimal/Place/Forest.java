package Place;

import Main.*;
import Animal.*;

public class Forest extends Place implements Huntable, Playable {
	private static Forest instance = null;

	private Forest() {
		this.where = "Forest";
		animals = new Animal[10];
	}

	public static Forest getInstance() {
		if (instance == null)
			instance = new Forest();
		return instance;
	}

	public void Show() {
		System.out.println("==========================================================================");
		System.out.print("##  숲 속에 있는 동물들 :");

		showAnimals(animals, numOfAnimals);
	}

	public void Play() {
		System.out.println("동물들이 숲 속에서 자유롭게 뛰어놉니다.");
		System.out.println("사냥도 합니다.");
		Playable[] p = getAnimals(); // Playable로 접근하도록 설정

		for (int i = 0; i < numOfAnimals; i++) {
			System.out.printf("[%2d] :", i);
			p[i].Play(); // p[i].로 접근하면 놀기() 만 보인다.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void Hunt() {
		System.out.println("동물들이 숲 속에서 자유롭게 뛰어놉니다.");
		System.out.println("사냥도 합니다.");
		Huntable[] h = getAnimals(); // 숲속기능으로 접근하도록 설정

		for (int i = 0; i < numOfAnimals; i++) {
			int rand = (int) (Math.random() * 10) % numOfAnimals;
			if (i == rand) {
				System.out.println("자신을 사냥할 순 없다구! 정신차려! 나라구!");
				continue;
			}

			h[i].Hunt(animals[rand]);

			// input.nextLine();
		}

	}

}
