package by.htp.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class State {
	
	private String nameState;
	private int areaState;
	private City capital;
	private List<Region> regions;
	
	public State() {
		this.nameState = "No name";
		this.areaState = 0;
		this.capital = new City();
		this.regions = new ArrayList();
	}
	
	public State(String nameState, int areaState, City capital, List<Region> regions) {
		this.nameState = nameState;
		this.areaState = areaState;
		this.capital = capital;
		this.regions = regions;
	}

	public String getNameState() {
		return nameState;
	}

	public void setNameState(String nameState) {
		this.nameState = nameState;
	}

	public int getAreaState() {
		return areaState;
	}

	public void setAreaState(int areaState) {
		this.areaState = areaState;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + areaState;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((nameState == null) ? 0 : nameState.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		State other = (State) obj;
		if (areaState != other.areaState)
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (nameState == null) {
			if (other.nameState != null)
				return false;
		} else if (!nameState.equals(other.nameState))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		return true;
	}
	
}
