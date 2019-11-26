package by.htp.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Account> bank;
	
	public Bank() {
		this.bank = new ArrayList();
	}
	
	public Bank(List<Account> bank) {
		this.bank = bank;
	}

	public List<Account> getBank() {
		return bank;
	}

	public void setBank(List<Account> bank) {
		this.bank = bank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (bank == null) {
			if (other.bank != null)
				return false;
		} else if (!bank.equals(other.bank))
			return false;
		return true;
	}
	
}
