package bo.cts;
import java.util.ArrayList;
import java.util.Iterator;

import com.cts.dao.UserDao;

import users.cts.User;

public class UserBO {
	
  UserDao udao=new UserDao();
	ArrayList userList=new ArrayList();
	public boolean addUser(String UserId,String FirstName,String LastName,String Age,String Gender,String DoB,
			String ContactNumber,String AltContactNumber,String EmailID,String Password,
			String AddressLine1,String AddressLine2,String City,String State,String ZipCode)
	{
		User u=new User();
		u.setUserId(UserId);
		u.setFirstName(FirstName);
		u.setLastName(LastName);
		u.setAge(Age);
		u.setGender(Gender);
		u.setDoB(DoB);
		u.setContactNumber(ContactNumber);
		u.setAltContactNumber(AltContactNumber);
		u.setEmailID(EmailID);
		u.setPassword(Password);
		u.setAddressLine1(AddressLine1);
		u.setAddressLine2(AddressLine2);
		u.setCity(City);
		u.setState(State);
		u.setZipCode(ZipCode);
		udao.addUser(u);
		userList.add(u);
		return true;
	}
	public void removeProduct(String name)
	{
		 /* Iterator i=productList.iterator();
          
          while(i.hasNext())
          {  Products pp=(Products)i.next();
             if (pp.getName().equals(name))
             	i.remove();
          }
          pdao.removeProduct(name);
	}	
	public void updateProduct(String name,double price)
	{
		  Iterator i=productList.iterator();
          while(i.hasNext())
      {  Products pp=(Products)i.next();
       if (pp.getName().equals(name))
           pp.setPrice(price);
      }*/
	}
	public void displayAllProducts()
	{
		 /*Iterator i=productList.iterator();
         while(i.hasNext())
         {  System.out.println(i.next());
         }*/
	}
}
