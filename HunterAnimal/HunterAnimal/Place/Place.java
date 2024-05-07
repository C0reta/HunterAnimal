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
			System.out.println("아직 만들어지지 않았습니다.");
			return null;
		} else
			return this.animals;
	}

	public Animal getAnimal() {
		if (this.animals == null) {
			System.out.println("아직 만들어지지 않았습니다.");
			return null;
		}

		// 랜덤으로 동물 한 마리 return
		int r = (int) (Math.random() * 1000) % numOfAnimals;
		return this.animals[r];

	}

	public void showAnimals() {
		System.out.print("(총 " + this.numOfAnimals + "마리)");

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

		System.out.print("(총 " + count + "마리)");

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
			System.out.println("숲속 공간에 동물이 가득 차 있습니다!");
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
