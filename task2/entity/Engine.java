package by.htp.task2.entity;

public class Engine {
	
	private int numberOfCylinders; // количество цилиндров
	private int power; // мощность
	private int fuelConsumption; // расход топлива
	private String fuelType; // тип топлива
	private int oilConsumption; // расход масла
	
	public Engine() {
		this.numberOfCylinders = 0;
		this.power = 0;
		this.fuelConsumption = 0;
		this.fuelType = "fuel";
		this.oilConsumption = 0;
	}
	
	public Engine(int numberOfCylinders, int power, int fuelConsumption, String fuelType, int oilConsumption) {
		this.numberOfCylinders = numberOfCylinders;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.fuelType = fuelType;
		this.oilConsumption = oilConsumption;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getOilConsumption() {
		return oilConsumption;
	}

	public void setOilConsumption(int oilConsumption) {
		this.oilConsumption = oilConsumption;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fuelConsumption;
		result = prime * result + ((fuelType == null) ? 0 : fuelType.hashCode());
		result = prime * result + numberOfCylinders;
		result = prime * result + oilConsumption;
		result = prime * result + power;
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
		Engine other = (Engine) obj;
		if (fuelConsumption != other.fuelConsumption)
			return false;
		if (fuelType == null) {
			if (other.fuelType != null)
				return false;
		} else if (!fuelType.equals(other.fuelType))
			return false;
		if (numberOfCylinders != other.numberOfCylinders)
			return false;
		if (oilConsumption != other.oilConsumption)
			return false;
		if (power != other.power)
			return false;
		return true;
	}
	
}
