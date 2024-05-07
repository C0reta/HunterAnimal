package Place;

import java.util.ArrayList;

import Animal.Animal;

public abstract class Place {
	String where;

	protected Animal[] animals = null;
	public int numOfAnimals = 0;
	int size = 10;

	public int getSize() {
		return this.size;
	}

	public Animal[] getAnimals() {
		if (this.animals == null) {
			System.out.println("���� ��������� �ʾҽ��ϴ�.");
			return null;
		} else
			return this.animals;
	}

	public Animal getAnimal() {
		if (this.animals == null) {
			System.out.println("���� ��������� �ʾҽ��ϴ�.");
			return null;
		}

		// �������� ���� �� ���� return
		int r = (int) (Math.random() * 1000) % numOfAnimals;
		return this.animals[r];

	}

	public void showAnimals() {
		System.out.print("(�� " + this.numOfAnimals + "����)");

		for (int i = 0; i < this.animals.length; i++) {
			if (animals[i] != null)
				System.out.print(animals[i].name);
			else
				System.out.print(" x  ");
		}
		System.out.println();
		System.out.println("==========================================================================");
	}

	public static void showAnimals(Animal[] animals, int count) {

		System.out.print("(�� " + count + "����)");

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null)
				System.out.print(animals[i].name + " ");
			else
				System.out.print(" x  ");
		}
		System.out.println();
		System.out.println("==========================================================================");

	}

	public void setAnimal(Animal animal, int r) {
		animals[r] = animal;
	}

	public void addAnimal(Animal animal) {
		try {
			animals[numOfAnimals] = animal;
			numOfAnimals++;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� ������ ������ ���� �� �ֽ��ϴ�!");
		}
	}

	public void removeAnimal(Animal animal) {
		int i = 0;
		for (i = 0; i < numOfAnimals; i++) {
			if (animals[i] == animal) {
				animals[i] = null;
				break;
			}
		}
		animals[i] = animals[numOfAnimals - 1];
		animals[numOfAnimals - 1] = null;
		numOfAnimals--;

	}

}
