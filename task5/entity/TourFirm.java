package by.htp.task5.entity;

import java.util.ArrayList;
import java.util.List;

public class TourFirm {
	
	private List<Tour> tourFirm;
	
	public TourFirm() {
		this.tourFirm = new ArrayList<Tour>();
	}
	
	public TourFirm(List<Tour> tourFirm) {
		this.tourFirm = tourFirm;
	}

	public List<Tour> getTourFirm() {
		return tourFirm;
	}

	public void setTourFirm(List<Tour> tourFirm) {
		this.tourFirm = tourFirm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tourFirm == null) ? 0 : tourFirm.hashCode());
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
		TourFirm other = (TourFirm) obj;
		if (tourFirm == null) {
			if (other.tourFirm != null)
				return false;
		} else if (!tourFirm.equals(other.tourFirm))
			return false;
		return true;
	}
	
}
