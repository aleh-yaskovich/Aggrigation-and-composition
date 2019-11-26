package by.htp.task4.logic;

import java.util.ArrayList;
import java.util.List;
import by.htp.task4.entity.Account;
import by.htp.task4.entity.Bank;
import by.htp.task4.entity.Client;

public class LogicBank {
	
	public List<Account> sortBySum (Bank bank) {
		List<Account> listBank = bank.getBank();
		int i = 0;
		Account tmp = new Account();
		while (i < listBank.size()-1) {
			if (listBank.get(i).getSum() > listBank.get(i+1).getSum()) {
				tmp = listBank.get(i);
				listBank.set(i, listBank.get(i+1));
				listBank.set(i+1, tmp);
				i = 0;
			} else {
				i++;
			}
		}
		return listBank;
	}
	
	public List<Account> sortByID (Bank bank) {
		List<Account> listBank = bank.getBank();
		int i = 0;
		Account tmp = new Account();
		while (i < listBank.size()-1) {
			if (listBank.get(i).getId() > listBank.get(i+1).getId()) {
				tmp = listBank.get(i);
				listBank.set(i, listBank.get(i+1));
				listBank.set(i+1, tmp);
				i = 0;
			} else {
				i++;
			}
		}
		return listBank;
	}
	
	public List<Account> sortByName (Bank bank) {
		List<Account> listBank = bank.getBank();
		int i = 0;
		Account tmp = new Account();
		while (i < listBank.size()-1) {
			Client clientA = listBank.get(i).getClient();
			Client clientB = listBank.get(i+1).getClient();
			if (clientA.getSurname().compareTo(clientB.getSurname()) > 0) {
				tmp = listBank.get(i);
				listBank.set(i, listBank.get(i+1));
				listBank.set(i+1, tmp);
				i = 0;
			} else if (clientA.getSurname().compareTo(clientB.getSurname()) == 0) {
				if (clientA.getName().compareTo(clientB.getName()) > 0) {
					tmp = listBank.get(i);
					listBank.set(i, listBank.get(i+1));
					listBank.set(i+1, tmp);
					i = 0;
				} else {
					i++;
				}
			} else {
				i++;
			}
		}
		return listBank;
	}
	
	public List<Account> searchByID (Bank bank, int id) {
		List<Account> trueId = new ArrayList();
		for (int i = 0; i < bank.getBank().size(); i++) {
			if (bank.getBank().get(i).getId() == id) {
				trueId.add(bank.getBank().get(i));
			}
		}
		return trueId;
	}
	
	public List<Account> searchBySurname (Bank bank, String surname) {
		List<Account> trueSurname = new ArrayList();
		for (int i = 0; i < bank.getBank().size(); i++) {
			if (bank.getBank().get(i).getClient().getSurname().compareTo(surname) == 0) {
				trueSurname.add(bank.getBank().get(i));
			}
		}
		return trueSurname;
	}
	
	public double allSum (Bank bank) {
		double allSum = 0;
		for (int i = 0; i < bank.getBank().size(); i++) {
			allSum = allSum + bank.getBank().get(i).getSum();
		}
		return allSum;
	}
	
	public double allSumClient (Bank bank, String surname) {
		double allSumClient = 0;
		for (int i = 0; i < bank.getBank().size(); i++) {
			if (bank.getBank().get(i).getClient().getSurname().compareTo(surname) == 0) {
				allSumClient = allSumClient + bank.getBank().get(i).getSum();
			}
		}
		return allSumClient;
	}
	
	public List<Account> changeStatusClient(List<Account> bank, int id, String res) {
		List<Account> list = new ArrayList();
		if (res.compareTo("+") == 0) {
			for (int i = 0; i < bank.size(); i++) {
				if (bank.get(i).getId() == id) {
					boolean tmp = bank.get(i).isStatus();
					if (tmp) {
						tmp = false;
					} else {
						tmp = true;
					}
					bank.get(i).setStatus(tmp);
					list.add(bank.get(i));
				}
			}
		}
		return list;
	}
	
}
