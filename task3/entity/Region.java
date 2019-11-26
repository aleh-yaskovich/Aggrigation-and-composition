package by.htp.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class Region {
	
	private String nameRegion;
	private int areaRegion;
	private City centerRegion;
	private List<District> districs;
	
	public Region() {
		this.nameRegion = "No name";
		this.areaRegion = 0;
		this.centerRegion = new City();
		this.districs = new ArrayList();
	}
	
	public Region(String nameRegion, int areaRegion, City centerRegion, List<District> districs) {
		this.nameRegion = nameRegion;
		this.areaRegion = areaRegion;
		this.centerRegion = centerRegion;
		this.districs = districs;
	}

	public String getNameRegion() {
		return nameRegion;
	}

	public void setNameRegion(String nameRegion) {
		this.nameRegion = nameRegion;
	}

	public int getAreaRegion() {
		return areaRegion;
	}

	public void setAreaRegion(int areaRegion) {
		this.areaRegion = areaRegion;
	}

	public City getCenterRegion() {
		return centerRegion;
	}

	public void setCenterRegion(City centerRegion) {
		this.centerRegion = centerRegion;
	}

	public List<District> getDistrics() {
		return districs;
	}

	public void setDistrics(List<District> districs) {
		this.districs = districs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + areaRegion;
		result = prime * result + ((centerRegion == null) ? 0 : centerRegion.hashCode());
		result = prime * result + ((districs == null) ? 0 : districs.hashCode());
		result = prime * result + ((nameRegion == null) ? 0 : nameRegion.hashCode());
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
		Region other = (Region) obj;
		if (areaRegion != other.areaRegion)
			return false;
		if (centerRegion == null) {
			if (other.centerRegion != null)
				return false;
		} else if (!centerRegion.equals(other.centerRegion))
			return false;
		if (districs == null) {
			if (other.districs != null)
				return false;
		} else if (!districs.equals(other.districs))
			return false;
		if (nameRegion == null) {
			if (other.nameRegion != null)
				return false;
		} else if (!nameRegion.equals(other.nameRegion))
			return false;
		return true;
	}
	
}
