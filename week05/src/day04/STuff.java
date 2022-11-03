package day04;

import java.util.Objects;

public class STuff {
	String name;

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		STuff other = (STuff) obj;
		return Objects.equals(name, other.name);
	}

}
