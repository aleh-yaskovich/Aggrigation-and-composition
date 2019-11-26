package by.htp.task5.entity;

public class Tour {
	
	private int duration;
	private boolean meal;
	private TypeOfRest typeOfRest;
	private TypeOfTransport typeOfTransport;
	
	public Tour() {
		this.duration = 1;
		this.meal = false;
		this.typeOfRest = null;
		this.typeOfTransport = null;
	}
	
	public Tour(int duration, boolean meal, TypeOfRest typeOfRest, TypeOfTransport typeOfTransport) {
		this.duration = duration;
		this.meal = meal;
		this.typeOfRest = typeOfRest;
		this.typeOfTransport = typeOfTransport;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public boolean isMeal() {
		return meal;
	}

	public void setMeal(boolean meal) {
		this.meal = meal;
	}

	public TypeOfRest getTypeOfRest() {
		return typeOfRest;
	}

	public void setTypeOfRest(TypeOfRest typeOfRest) {
		this.typeOfRest = typeOfRest;
	}

	public TypeOfTransport getTypeOfTransport() {
		return typeOfTransport;
	}

	public void setTypeOfTransport(TypeOfTransport typeOfTransport) {
		this.typeOfTransport = typeOfTransport;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + (meal ? 1231 : 1237);
		result = prime * result + ((typeOfRest == null) ? 0 : typeOfRest.hashCode());
		result = prime * result + ((typeOfTransport == null) ? 0 : typeOfTransport.hashCode());
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
		Tour other = (Tour) obj;
		if (duration != other.duration)
			return false;
		if (meal != other.meal)
			return false;
		if (typeOfRest != other.typeOfRest)
			return false;
		if (typeOfTransport != other.typeOfTransport)
			return false;
		return true;
	}
	
}
