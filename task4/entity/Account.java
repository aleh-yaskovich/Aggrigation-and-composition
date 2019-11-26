package by.htp.task4.entity;

public class Account {
	
	private int id;
	private Client client;
	private double sum;
	private boolean status;
	
	public Account() {
		this.id = 0;
		this.client = new Client();
		this.sum = 0;
		this.status = true;
	}
	
	public Account(int id, Client client, double sum, boolean status) {
		this.id = id;
		this.client = client;
		this.sum = sum;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + id;
		result = prime * result + (status ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(sum);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Account other = (Account) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (id != other.id)
			return false;
		if (status != other.status)
			return false;
		if (Double.doubleToLongBits(sum) != Double.doubleToLongBits(other.sum))
			return false;
		return true;
	}
	
}
