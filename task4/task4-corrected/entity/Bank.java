package by.htp.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Client> bank;
	
	public Bank() {
		this.bank = new ArrayList<Client>();
	}
	
	public Bank(List<Client> bank) {
		this.bank = bank;
	}

	public List<Client> getBank() {
		return bank;
	}

	public void setBank(List<Client> bank) {
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
