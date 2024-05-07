package Main;

import Place.*;
import Animal.*;

import java.util.Scanner;

public class Main {

	public static void menu����() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(
				"���ӿ� ��������:  1.������      2.��               3.������                     4. ���     ......... 9.��������   ");
		System.out.println("   	     ����  : 11.����ϱ�  12.���ӿ���? 13. �������忡��?  14.����������? ");
		System.out.println("   ���� ����  : 21.���Ӻ���  22.��ɲ��� �������庸��   23.����������   24. ��� ����        0.����");
		System.out.println("-----------------------------------------------------------------------");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Forest forest = Forest.getInstance();
		Zoo zoo = Zoo.getInstance();
		AnimalFarm farm = AnimalFarm.getInstance();
		int menu = 0;

		// ��ɲ� ����
		Hunter hunter = new Hunter();
		hunter.showInfo();

		// ������ �Ѹ��� ���� �� ���!
		Dog d = new Dog("�����");
		boolean sig = hunter.Hunt(d);

		// ����� �����ߴٸ�, �������忡 �ֱ�, �� ������ addAnimal()�� ���ȭ�� �� �ְ� "��ɰ�"���� �ӹ��� �ñ� �� ����
		if (sig == true)
			farm.addAnimal(d);
		hunter.Show();
		farm.Show();
		//////////////////////////////////////////////////////

		// �޴��� ���۽�Ű��
		System.out.println("------------------------------------------------------");
		System.out.println("�޴��� ���۽�Ű��");
		int i = 0;
		while (true) {

			menu����();
			System.out.print("menu: ");
			menu = input.nextInt();
			if (menu == 0) {
				System.out.println("���α׷� ����!");
				break;
			}
			switch (menu) {
			case 1:
				forest.addAnimal(new Dog("�����" + (i++)));
				break;
			case 2:
				forest.addAnimal(new Snake("������" + (i++)));
				break;
			case 3:
				forest.addAnimal(new Hawk("��������" + (i++)));
				break;
			case 4:
				forest.addAnimal(new Shark("��ũ" + (i++)));
				break;

			/////////////////////////////////////////
			case 11:
				hunter.Hunt();
				break;
			case 12: // ����Ȱ������- ���()
				forest.Play();
				break;
			case 13:// ��������Ȱ������ - Ż��õ�!
				farm.Escape();
				break;
			case 14: // ������ Ȱ������ - ���ϱ�();
				zoo.Work();
				break;
			case 21:
				forest.Show();
				break;
			case 22:
				hunter.Show();
				break;
			case 23:
				zoo.Show();
				break;
			case 24:
				forest.Show();
				farm.Show();
				zoo.Show();
				break;
			default:
				System.out.println("�׷� �޴��� �����ϴ�.");
				break;
			}
		}
		// �޴����� ���ӵ��� �����ϰ� ��� .
		while (true) {
			if (forest.numOfAnimals == 1) {
				System.out.println("���°踦 ���� �Ѹ����� ����Ӵϴ�.");
				break;
			}

			hunter.Hunt();
			hunter.Show();
			forest.Show();

			// ���� ��ٷȴ� ��µǵ��� 1�� delay
			Thread.sleep(1000);
		}
	}

}
