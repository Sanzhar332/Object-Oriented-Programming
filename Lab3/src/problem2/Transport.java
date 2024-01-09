package problem2;

import java.util.Objects;

abstract public class Transport {
	public int mileage;
	public Transport() {
	}
	@Override
	public String toString() {
		return "Transport [mileage=" + mileage + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mileage);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transport other = (Transport) obj;
		return mileage == other.mileage;
	}
	
}
