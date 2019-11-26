package by.htp.task2.entity;

public class Tank {

	private int volume;
	
	public Tank() {
		this.volume = 0;
	}
	
	public Tank (int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + volume;
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
		Tank other = (Tank) obj;
		if (volume != other.volume)
			return false;
		return true;
	}
	
}
