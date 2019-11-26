package by.htp.task2.view;

import java.util.List;
import java.util.Scanner;

import by.htp.task2.entity.Auto;
import by.htp.task2.entity.Wheel;

public class AutoView {
	
	public void viewBrend (Auto auto) {
		System.out.println("Марка автомобиля: "+auto.getBrand());
	}
	
	public int whatWheel () {
		Scanner sc = new Scanner(System.in);
        System.out.print("Какое колесо меняем? Введите цифру от 1 до 4: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Какое колесо меняем? Введите цифру от 1 до 4: ");
        }
        int numberWheel = sc.nextInt();
        while (numberWheel < 1 || numberWheel > 4) {
            System.out.print("Какое колесо меняем? Введите цифру от 1 до 4: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Какое колесо меняем? Введите цифру от 1 до 4: ");
            }
            numberWheel = sc.nextInt();
        }
        return numberWheel;
	}
	
	public void showWheels (List<Wheel> wheels) {
		for (int i = 0; i < wheels.size(); i++) {
			Wheel temp = wheels.get(i);
			String str = "";
			if (temp.isPosition() == true) {
				str = "установлено";
			} else {
				str = "запасное";
			}
			System.out.println((i+1)+"-e колесо. Диаметр "+temp.getDiametr()+"\", ширина "+temp.getWidth()+"\", глубина протектора "
					+temp.getTreadDepth()+" мм, тип \""+temp.getType()+"\", состояние \""+str+"\"");
		}
	}
	
	public void amountOfFuel(Auto auto) {
		System.out.println("В баке топлива: "+auto.getAmountOfFuel()+" литров");
	}
	
	public int whatAmountOfFuel (Auto auto) {
		int currently = auto.getAmountOfFuel(); // сколько в баке в настоящий момент
		int full = auto.getTank().getVolume(); // вместимость бака
		Scanner sc = new Scanner(System.in);
        System.out.print("Сколько литров заливаем? Введите цифру от 0 до "+(full - currently)+": ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Сколько литров заливаем? Введите цифру от 0 до "+(full - currently)+": ");
        }
        int amountFuel = sc.nextInt();
        while (amountFuel < 0 || amountFuel > (full - currently)) {
            System.out.print("Сколько литров заливаем? Введите цифру от 0 до "+(full - currently)+": ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Сколько литров заливаем? Введите цифру от 0 до "+(full - currently)+": ");
            }
            amountFuel = sc.nextInt();
        }
        return amountFuel;
	}
	
	public String userRefuel (Auto auto) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Включить зажигание? Введите \"+\" или \"-\": ");
        while(!sc.hasNext("[+-]")) {
        	sc.next();
        	System.out.print("Включить зажигание? Введите \"+\" или \"-\": ");
        }
        String userRefuel = sc.next();
        return userRefuel;
	}
	
	public void goAutoView (boolean[] arr) {
		if (arr.length == 3) {
			String str = "Автомобиль не поедет: \n";
			if (arr[0] == false) {
				str = str + "- установите колеса правильно\n";
			}
			if (arr[1] == false) {
				str = str + "- заправьте бак\n";
			}
			if (arr[2] == false) {
				str = str + "- включите зажигание\n";
			}
			if (arr[0] == true && arr[1] == true && arr[2] == true) {
				str = "\nДыр-дыр-дыр";
			}
			System.out.println(str);
		} 
	}
	
}
