package by.htp.task4.main;

import java.util.List;

import by.htp.task4.entity.Account;
import by.htp.task4.entity.Bank;
import by.htp.task4.entity.Client;
import by.htp.task4.logic.LogicBank;
import by.htp.task4.view.ViewAccaunt;
import by.htp.task4.view.ViewBank;

public class Main {

	public static void main(String[] args) {

		Client client1 = new Client("Aleh", "Yaskovich");
		Client client2 = new Client("Petr", "Petrov");
		Client client3 = new Client("Sidor", "Sidorov");
		Client client4 = new Client("Ivan", "Ivanov");
		
		Account account1 = new Account(1200, client1, 5167.17, true);
		Account account2 = new Account(2000, client2, 541.56, true);
		Account account3 = new Account(7503, client2, -10.01, false);
		Account account4 = new Account(1000, client2, 1, false);
		Account account5 = new Account(4000, client3, 0, true);
		Account account6 = new Account(5016, client4, 15000, true);
		Account account7 = new Account(5015, client4, 967.33, true);
		
		Bank bank = new Bank();
		bank.getBank().add(account1);
		bank.getBank().add(account2);
		bank.getBank().add(account3);
		bank.getBank().add(account4);
		bank.getBank().add(account5);
		bank.getBank().add(account6);
		bank.getBank().add(account7);
		
		ViewBank viewBank = new ViewBank();
		// viewBank.viewBank(bank);
		
		// Сортируем по сумме
		LogicBank logicBank = new LogicBank();
		bank.setBank(logicBank.sortBySum(bank));
		// viewBank.viewBank(bank);
		
		// Сортируем по номеру счета
		bank.setBank(logicBank.sortByID(bank));
		// viewBank.viewBank(bank);
		
		// Сортируем по фамилии и имени
		bank.setBank(logicBank.sortByName(bank));
		// viewBank.viewBank(bank);
		
		// Поиск по ID
		ViewAccaunt viewAccount = new ViewAccaunt();
		// int id = viewAccount.searchFromID();
		// List<Account> list = logicBank.searchByID(bank, id);
		// viewAccount.viewAccount(list);
		
		// Поиск по фамилии
		// String surname = viewAccount.searchFromSurname();
		// List<Account> list2 = logicBank.searchBySurname(bank, surname);
		// viewAccount.viewAccount(list2);
		
		// Сумма всех денег в банке
		double allSum = logicBank.allSum(bank);
		viewBank.viewAllSum(allSum);
		
		// Сумма всех денег клиента
		// String surname2 = viewAccount.searchFromSurname();
		// double allSumClient = logicBank.allSumClient(bank, surname2);
		// viewBank.viewAllSumClient(allSumClient, surname2);
		
		// Изменение статуса счета
		int idClient = viewAccount.searchFromID();
		List<Account> list3 = logicBank.searchByID(bank, idClient);
		viewAccount.viewAccount(list3);
		if (list3.size() == 1) {
			String res = viewAccount.changeStatus();
			list3 = logicBank.changeStatusClient(bank.getBank(), idClient, res);
			viewAccount.viewChange(list3);
		}
		
		
	}

}
