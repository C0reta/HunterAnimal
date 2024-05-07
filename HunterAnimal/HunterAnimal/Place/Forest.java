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
		System.out.print("##  �� �ӿ� �ִ� ������ :");

		showAnimals(animals, numOfAnimals);
	}

	public void Play() {
		System.out.println("�������� �� �ӿ��� �����Ӱ� �پ��ϴ�.");
		System.out.println("��ɵ� �մϴ�.");
		Playable[] p = getAnimals(); // Playable�� �����ϵ��� ����

		for (int i = 0; i < numOfAnimals; i++) {
			System.out.printf("[%2d] :", i);
			p[i].Play(); // p[i].�� �����ϸ� ���() �� ���δ�.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void Hunt() {
		System.out.println("�������� �� �ӿ��� �����Ӱ� �پ��ϴ�.");
		System.out.println("��ɵ� �մϴ�.");
		Huntable[] h = getAnimals(); // ���ӱ������ �����ϵ��� ����

		for (int i = 0; i < numOfAnimals; i++) {
			int rand = (int) (Math.random() * 10) % numOfAnimals;
			if (i == rand) {
				System.out.println("�ڽ��� ����� �� ���ٱ�! ��������! ����!");
				continue;
			}

			h[i].Hunt(animals[rand]);

			// input.nextLine();
		}

	}

}
