package by.htp.task4.main;

import java.util.ArrayList;
import java.util.List;
import by.htp.task4.entity.Account;
import by.htp.task4.entity.Bank;
import by.htp.task4.entity.Client;
import by.htp.task4.logic.BankLogic;
import by.htp.task4.view.BankView;

public class Main {

	public static void main(String[] args) {

		Account account1 = new Account(1, 234.56, true);
		Account account2 = new Account(3, 0, true);
		Account account3 = new Account(24, -0.05, false);
		Account account4 = new Account(7, 999.99, true);
		Account account5 = new Account(6, 2234.00, true);
		Account account6 = new Account(13, -34.25, true);
		Account account7 = new Account(22, 1988.07, true);
		Account account8 = new Account(11, 1.55, false);
		
		List<Account> list1 = new ArrayList<Account>();
			list1.add(account1);
			list1.add(account4);
		List<Account> list2 = new ArrayList<Account>();
			list2.add(account2);
			list2.add(account6);
		List<Account> list3 = new ArrayList<Account>();
			list3.add(account3);
		List<Account> list4 = new ArrayList<Account>();
			list4.add(account8);
		List<Account> list5 = new ArrayList<Account>();
			list5.add(account7);
		
		Client client1 = new Client("Aleh", "Yaskovich", list1);
		Client client2 = new Client("Ivan", "Ivanov", list2);
		Client client3 = new Client("Petr", "Sidorov", list3);
		Client client4 = new Client("Sidor", "Petrov", list4);
		Client client5 = new Client("Name", "Surname", list5);
		
		Bank bank = new Bank();
		bank.getBank().add(client1);
		bank.getBank().add(client2);
		bank.getBank().add(client3);
		bank.getBank().add(client4);
		bank.getBank().add(client5);
		
		BankLogic logic = new BankLogic();
		BankView view = new BankView();
		
		// Сумма положительных счетов
		double sumPos = logic.sumPositiveAccounts(bank);
		view.viewSum(sumPos);
		// Сумма отрицательных счетов
		double sumNeg = logic.sumNegativeAccounts(bank);
		view.viewSum(sumNeg);
		// Общая сумма в банке
		view.viewAllSum(sumPos + sumNeg);
		
		// Изменение статуса счета
		int id = view.inputId();
		boolean res = view.viewAccount(bank, id);
		if (!res) {
			String str = view.changeStatus();
			if (str.compareTo("+") == 0) {
				logic.changeStatus(bank, id);
				view.viewAccount(bank, id);
			}
		}
		
		// Поиск по фамилии
		String surname = view.changeSurname();
		List<Client> list = logic.searchSurname(bank, surname);
		view.viewClient(list, surname);
		
		// Сортировка счетов по фамилии
		bank = logic.sortBySurname(bank);
		// view.viewBank(bank);
		
	}

}
