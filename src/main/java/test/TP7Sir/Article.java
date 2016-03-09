package test.TP7Sir;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity
public class Article {
	
	@Id
	private ObjectId id;
	
	private String name;
	private int stars;
	
	@Reference
	private Person buyer;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	
	public void setBuyer(Person buyer){
		this.buyer=buyer;
	}

}
