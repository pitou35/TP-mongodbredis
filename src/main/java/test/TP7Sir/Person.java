package test.TP7Sir;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

/**
 * collection de personnes 
 * {
 * id : 1
 * 	name: "ok",
 * adresses : 2
 * },
 * 
 * collection d'adresses
 * {
 * 		id: 2
 * 		name: "test"
 * }
 * @author pitou35
 *
 */

@Entity
public class Person {
	
	@Id private ObjectId id;
	private String name;
	
	@Embedded
	private Address adresse;
	
	public Person(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(Address uneAdresse){
		this.adresse=uneAdresse;
	}
	
	

}
