package by.htp.task5.entity;

public enum TypeOfRest {
	
	SEATOUR ("отдых на море"),
	MOUNTTOUR ("отдых в горах"),
	EXCURSION ("экскурсия"),
	SHOPTOUR ("shop-тур"),
	TREATMENT ("лечение"),
	CRUISE ("круиз"),
	FESTIVAL ("посещение фестиваля"),
	SPORNEVENT ("посещение спортивного мероприятия");
	
	private String type;
	
	private TypeOfRest(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
