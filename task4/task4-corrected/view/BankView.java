package by.htp.task4.view;

import java.util.List;
import java.util.Scanner;

import by.htp.task4.entity.Account;
import by.htp.task4.entity.Bank;
import by.htp.task4.entity.Client;

public class BankView {

	// Вывод одного счета
	public boolean viewAccount(Bank bank, int id) {
		boolean res = true;
		for (int i = 0; i < bank.getBank().size(); i++) {
			Client client = bank.getBank().get(i);
			for (int j = 0; j < client.getAccount().size(); j++) {
				Account account = client.getAccount().get(j);
				if (account.getId() == id) {
					System.out.println("\nID счета: "+ account.getId());
					System.out.println("Сумма на счете: "+ account.getSum());
					String str;
					if (account.isStatus()) {
						str = "действующий";
					} else {
						str = "заблокирован";
					}
					System.out.println("Статус: "+ str);
					System.out.println("Владелец счета: "+ client.getSurname() +" "+ client.getName());
					res = false;
				}
			}
		}
		if (res) {
			System.out.println("Счет с ID "+ id +" не найден");
		}
		return res;
	}
	
	// Вывод клиентов по запросу
		public void viewClient(List<Client> list, String surname) {
			if (list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println("\nКлиент: "+ list.get(i).getSurname() +" "+ list.get(i).getName());
					System.out.println("Счет (счета) клиента: ");
					for (int j = 0; j < list.get(i).getAccount().size(); j++) {
						Account account = list.get(i).getAccount().get(j);
						System.out.println("\nID счета: "+ account.getId());
						System.out.println("Сумма на счете: "+ account.getSum());
						String str;
						if (account.isStatus()) {
							str = "действующий";
						} else {
							str = "заблокирован";
						}
						System.out.println("Статус: "+ str);
					}
				}
			} else {
				System.out.println("Клиент с фамилией "+ surname +" не найден");
			}
		}
	
	// Вывод всех счетов
	public void viewBank (Bank bank) {
		for (int i = 0; i < bank.getBank().size(); i++) {
			Client client = bank.getBank().get(i);
			System.out.println("\nКлиент: "+ client.getSurname() +" "+ client.getName());
			for (int j = 0; j < client.getAccount().size(); j++) {
				Account account = client.getAccount().get(j);
				System.out.println("ID счета: "+ account.getId());
				System.out.println("Сумма на счете: "+ account.getSum());
				String str;
				if (account.isStatus()) {
					str = "действующий";
				} else {
					str = "заблокирован";
				}
				System.out.println("Статус: "+ str);
			}
		}
	}
		
	// Ввод пользователем ID счета
	public int inputId() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите ID счета: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите ID счета: ");
        }
        int id = sc.nextInt();
        while (id <= 0) {
        	System.out.print("Введите ID счета: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите ID счета: ");
            }
            id = sc.nextInt();
        }
        return id;
	}
	
	// Изменяем ли статус счета?
	public String changeStatus() {
		Scanner sc = new Scanner(System.in);
        System.out.print("\nИзменить статус счета? (введите \"+\" или \"-\"): ");
        while(!sc.hasNext("[+-]")) {
        	sc.next();
        	System.out.print("Изменить статус счета? (введите \"+\" или \"-\"): ");
        }
        String res = sc.next();
        return res;
	}
	
	// Поиск по фамилии
	public String changeSurname() {
		Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите фамилию клиента: ");
        String res = sc.next();
        return res;
	}
	
	// Вывод суммы положительных или отрицательных счетов
	public void viewSum (double sum) {
		if (sum > 0) {
			System.out.println("Сумма всех положительных счетов равна " + sum);
		} else {
			System.out.println("Сумма всех отрицательных счетов равна " + sum);
		}
	}
	
	// Выводим всю сумму
	public void viewAllSum (double sum) {
			System.out.println("Сумма всех денег в банке равна " + sum);
	}
	
}
