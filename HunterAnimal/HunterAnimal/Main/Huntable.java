package Main;

import Animal.Animal; //�̰ſֵ�?? �ذ�Ǳ��޾�

public interface Huntable {

	public default void Hunt() {
		System.out.println("������ ����� �մϴ�.");
	}

	public default void Hunt(Animal animal) {
		System.out.println(animal.name + "�� ����մϴ�.");
	}

	public default void ����ϱ�(Animal[] animals) {
		System.out.println("� ������ � ������ ����մϴ�.");
		// ���� �������� �����ϰ� ��� ����ϱ� �������� ��������.
		// animals[i]�� animal[j]�� ����ϵ��� , i�� j�� ���� �޶�� �Ѵ�.

	}

}
