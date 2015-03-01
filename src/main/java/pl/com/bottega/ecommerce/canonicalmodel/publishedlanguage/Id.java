package pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage;

import java.util.UUID;

import org.apache.commons.lang3.Validate;

public class Id {
	private String id;

	public Id(String id) {
		Validate.notNull(id);
		this.id = id;
	}

	protected Id() {
	}
	
	public static Id generate(){
		return new Id(UUID.randomUUID().toString());
	}

	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Id other = (Id) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id;
	}
}
