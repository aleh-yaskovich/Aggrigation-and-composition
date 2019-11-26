package by.htp.task5.view;

import java.util.List;
import java.util.Scanner;

import by.htp.task5.entity.Tour;
import by.htp.task5.entity.TourFirm;
import by.htp.task5.entity.TypeOfRest;
import by.htp.task5.entity.TypeOfTransport;

public class TourFirmView {
	
	public void tourFirmView(TourFirm tourFirm) {
		List<Tour> list = tourFirm.getTourFirm();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("\nВид отдыха: "+list.get(i).getTypeOfRest().getType());
			System.out.println("Транспорт: "+list.get(i).getTypeOfTransport().getType());
			System.out.println("Количество дней: "+list.get(i).getDuration());
			String str = "";
			boolean res = list.get(i).isMeal();
			if (res) {
				str = "включено";
			} else {
				str = "не включено";
			}
			System.out.println("Питание: "+str);
		}
	}
	
	public void tourFirmView(List<Tour> list) {
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println("\nВид отдыха: "+list.get(i).getTypeOfRest().getType());
				System.out.println("Транспорт: "+list.get(i).getTypeOfTransport().getType());
				System.out.println("Количество дней: "+list.get(i).getDuration());
				String str = "";
				boolean res = list.get(i).isMeal();
				if (res) {
					str = "включено";
				} else {
					str = "не включено";
				}
				System.out.println("Питание: "+str);
			}
		} else {
			System.out.println("По Вашему запросу предложений не найдено...");
		}
	}
	
	public int tourDuration (int minDuration, int maxDuration) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите минимальное количество дней в промежутке от "+minDuration+" до "+maxDuration+": ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите минимальное количество дней в промежутке от "+minDuration+" до "+maxDuration+": ");
        }
        int min = sc.nextInt();
        while (min < minDuration || min > maxDuration) {
        	System.out.print("Введите минимальное количество дней в промежутке от "+minDuration+" до "+maxDuration+": ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите минимальное количество дней в промежутке от "+minDuration+" до "+maxDuration+": ");
            }
            min = sc.nextInt();
        }
        return min;
	}
	
	public int tourRest (TypeOfRest[] arr) {
		int count = arr.length;
		System.out.println();
		for (int i = 0; i < count; i++) {
			System.out.println(i+". "+arr[i].getType());
		}
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер интересующего Вас вида отдыха: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите номер интересующего Вас вида отдыха: ");
        }
        int number = sc.nextInt();
        while (number < 0 || number > count-1) {
        	System.out.print("Введите номер интересующего Вас вида отдыха: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите номер интересующего Вас вида отдыха: ");
            }
            number = sc.nextInt();
        }
        return number;
	}
	
	public int tourTransport (TypeOfTransport[] arr) {
		int count = arr.length;
		System.out.println();
		for (int i = 0; i < count; i++) {
			System.out.println(i+". "+arr[i].getType());
		}
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер интересующего Вас транспорта: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите номер интересующего Вас транспорта: ");
        }
        int number = sc.nextInt();
        while (number < 0 || number > count-1) {
        	System.out.print("Введите номер интересующего Вас транспорта: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите номер интересующего Вас транспорта: ");
            }
            number = sc.nextInt();
        }
        return number;
	}
	
}
