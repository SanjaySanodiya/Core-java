package aggrigation;

/*
If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.

Student has an object of Address, address object contains its own informations such as city, state, country etc.
In such case relationship is Student HAS-A address
*/

public class Address 
{
   String state, city, country;
   
   public Address(String state, String city, String country) 
   {
	   this.state = state;
	   this.city = city;
	   this.country = country;
	   
   }
   
}
