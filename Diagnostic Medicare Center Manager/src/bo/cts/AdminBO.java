package bo.cts;
import java.util.ArrayList;
import java.util.Iterator;

import com.cts.dao.AdminDao;

import users.cts.Admin;

public class AdminBO {
	
	AdminDao udao=new AdminDao();
	ArrayList userList=new ArrayList();
	public boolean addAdmin(String AdminId,String FirstName,String LastName,String Age,String Gender,String DoB,
			String ContactNumber,String AltContactNumber,String EmailID,String Password)
			
	{
		Admin u=new Admin();
		u.setAdminId(AdminId);
		u.setFirstName(FirstName);
		u.setLastName(LastName);
		u.setAge(Age);
		u.setGender(Gender);
		u.setDoB(DoB);
		u.setContactNumber(ContactNumber);
		u.setAltContactNumber(AltContactNumber);
		u.setEmailID(EmailID);
		u.setPassword(Password);
		
		udao.addAdmin(u);
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