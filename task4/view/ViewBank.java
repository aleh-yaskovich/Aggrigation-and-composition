package by.htp.task4.view;

import by.htp.task4.entity.Bank;

public class ViewBank {
	
	public void viewBank(Bank bank) {
		for (int i = 0; i < bank.getBank().size(); i++) {
			int id = bank.getBank().get(i).getId();
			String name = bank.getBank().get(i).getClient().getName();
			String surname = bank.getBank().get(i).getClient().getSurname();
			double sum = bank.getBank().get(i).getSum();
			boolean status = bank.getBank().get(i).isStatus();
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
	
	public void viewAllSum(double allSum) {
		System.out.println("Сумма всех денег, хранящихся в банке, равна: "+allSum);
	}
	
	public void viewAllSumClient(double allSumClient, String surname) {
		if (allSumClient == 0) {
			System.out.println("Клиена с фамилией "+surname+" не существует или у него на счету нет денег");
		} else {
			System.out.println("Сумма всех денег, хранящихся на счетах клиента "+surname+", равна: "+allSumClient);
		}
	}
	
}
