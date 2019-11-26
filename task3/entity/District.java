package by.htp.task3.entity;

public class District {
	
	private String nameDistrict;
	private int areaDistrict;
	private City centerDistrict;
	
	public District() {
		this.nameDistrict = "No name";
		this.areaDistrict = 0;
		this.centerDistrict = new City();
	}
	
	public District(String nameDistrict, int areaDistrict, City centerDistrict) {
		this.nameDistrict = nameDistrict;
		this.areaDistrict = areaDistrict;
		this.centerDistrict = centerDistrict;
	}

	public String getNameDistrict() {
		return nameDistrict;
	}

	public void setNameDistrict(String nameDistrict) {
		this.nameDistrict = nameDistrict;
	}

	public int getAreaDistrict() {
		return areaDistrict;
	}

	public void setAreaDistrict(int areaDistrict) {
		this.areaDistrict = areaDistrict;
	}

	public City getCenterDistrict() {
		return centerDistrict;
	}

	public void setCenterDistrict(City centerDistrict) {
		this.centerDistrict = centerDistrict;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + areaDistrict;
		result = prime * result + ((centerDistrict == null) ? 0 : centerDistrict.hashCode());
		result = prime * result + ((nameDistrict == null) ? 0 : nameDistrict.hashCode());
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
		District other = (District) obj;
		if (areaDistrict != other.areaDistrict)
			return false;
		if (centerDistrict == null) {
			if (other.centerDistrict != null)
				return false;
		} else if (!centerDistrict.equals(other.centerDistrict))
			return false;
		if (nameDistrict == null) {
			if (other.nameDistrict != null)
				return false;
		} else if (!nameDistrict.equals(other.nameDistrict))
			return false;
		return true;
	}
	
}
