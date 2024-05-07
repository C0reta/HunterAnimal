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

	// �̰Ը���????
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
		System.out.print("## �������忡 �ִ� ������ :");

		showAnimals(animals, numOfAnimals);

	}

	public void Escape() {
		Forest forest = Forest.getInstance();
		// �����ϰ� 30% Ȯ���� Ż��.
		System.out.println("�������� ��ȸ�� ������ Ż���� �õ��մϴ�!. Ż��Ȯ���� 30% �Դϴ�.");
		// �����ϰ� ó���ϰų�, �������� ���س��ų�~

		for (int i = 0; i < numOfAnimals; i++) {
			int r = (int) (Math.random() * 1000) % 3;
			if (r == 1) {
				System.out.println(this.animals[i].name + "�� ��ɲ��� �������忡�� Ż���߽��ϴ�!!");
				forest.addAnimal(this.animals[i]);

				// removeAnimal
				this.animals[i] = this.animals[numOfAnimals - 1];
				this.animals[numOfAnimals - 1] = null;
				numOfAnimals--;
			} else
				System.out.println(this.animals[i].name + "�� Ż�⿡ �����߽��ϴ�.�� ");
		}
	}

}
