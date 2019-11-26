package by.htp.task4.view;

import java.util.List;
import java.util.Scanner;
import by.htp.task4.entity.Account;
import by.htp.task4.entity.Bank;

public class ViewAccaunt {

	public void viewAccount(List<Account> list) {
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				int id = list.get(i).getId();
				String name = list.get(i).getClient().getName();
				String surname = list.get(i).getClient().getSurname();
				double sum = list.get(i).getSum();
				boolean status = list.get(i).isStatus();
				String res = "";
				if (status) {
					res = "действующий";
				} else {
					res = "заблокированный";
				}
				System.out.println("\nСчет №"+id);
				System.out.println("Клиент: "+surname+" "+name);
				System.out.println("Сумма на счете: "+sum);
				System.out.println("Состояние: "+res);
			}
		} else {
			System.out.println("Клиент не найден!");
		}
	}
	
	public void viewChange(List<Account> list) {
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				int id = list.get(i).getId();
				String name = list.get(i).getClient().getName();
				String surname = list.get(i).getClient().getSurname();
				double sum = list.get(i).getSum();
				boolean status = list.get(i).isStatus();
				String res = "";
				if (status) {
					res = "действующий";
				} else {
					res = "заблокированный";
				}
				System.out.println("\nСчет №"+id);
				System.out.println("Клиент: "+surname+" "+name);
				System.out.println("Сумма на счете: "+sum);
				System.out.println("Состояние: "+res);
			}
		}
	}
	
	public int searchFromID() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите ID клиента: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите ID клиента: ");
        }
        int id = sc.nextInt();
		return id;
	}
	
	public String searchFromSurname() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию клиента: ");
        String surname = sc.next();
		return surname;
	}
	
	public String changeStatus () {
		Scanner sc = new Scanner(System.in);
        System.out.print("Изменить состояние этого счета? Введите \"+\" или \"-\": ");
        while(!sc.hasNext("[+-]")) {
        	sc.next();
        	System.out.print("Изменить состояние этого счета? Введите \"+\" или \"-\": ");
        }
        String changeStatus= sc.next();
        return changeStatus;
	}
	
}
