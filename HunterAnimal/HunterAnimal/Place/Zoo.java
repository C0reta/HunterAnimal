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
		System.out.print("## �������� �ִ� ������ :");

		showAnimals(animals, numOfAnimals);
	}

	// ��... �̰� ���� �� �𸣰���
	public void Work() {
		System.out.println("�������� ���������� ���� �մϴ�.");
		System.out.println("���ָ� �η��� ���� ���� ���� Ż���� �� �־��.");
		Workable[] w = getAnimals(); // Workable �� ������� �����ϵ��� ����

		for (int i = 0; i < numOfAnimals; i++) {
			w[i].���ֺθ���();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void escape() {
		Escapeable[] e = getAnimals(); // ���� [] �� ����
		// Ż���� ���� ����
		int rand = (int) (Math.random() * 100) % this.numOfAnimals;

		// �� ������ Ȯ���� ���� Ż���� �õ��Ѵ�.
		// e[i]. ���� �����ϸ� escape() �� ���δ�!
		e[rand].Escape();

	}
}
