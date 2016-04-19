package test.TP7Sir;

import java.net.UnknownHostException;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnknownHostException
    {
    	Morphia morphia = new Morphia();	
    	Mongo mongo = new Mongo();
    	morphia.map(Person.class).map(Address.class).map(Article.class);
    	//morphia.mapPackage("")
    	Datastore ds = morphia.createDatastore(mongo, "my_database");
    	
    	Person p = new Person();
    	p.setName("Tintin");
    	Person p2 = new Person();
    	p2.setName("michel polnareff");
    	Person p3 = new Person();
    	p3.setName("amanda siegfried");
    	
    	Article a=new Article();
    	a.setName("houpette en plastique");
    	a.setBuyer(p);
    	
    	Article a2=new Article();
    	a2.setName("micro en caoutchouc");
    	a2.setBuyer(p2);
    	
    	Article a3=new Article();
    	a3.setName("parfum 'eau des toilettes'");
    	a3.setBuyer(p3);
    	
    	//a.setBuyer(buyer);
    	
    	
    	
    	

    	Address address = new Address();
    	address.setStreet("123 Some street");
    	address.setCity("Some city");
    	address.setPostCode("123 456");
    	address.setCountry("Some country");
    	//set address
    	p.setAddress(address);
    	// Save the POJO
    	ds.save(p);
    	ds.save(p2);
    	ds.save(p3);
    	for (Person e : ds.find(Person.class))
    		 System.err.println(e.getName());
    	//ceci est un exemple qui affiche le nom de la personne instanciée
    	//il est possible d'en créer d'autres, ainsi que d'attribuer des adresses...

    }
}
