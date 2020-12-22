package bo.cts;
import java.util.ArrayList;
import java.util.Iterator;

import com.cts.dao.DoctorDao;

import users.cts.Doctor;

public class DoctorBO {
	
	DoctorDao udao=new DoctorDao();
	ArrayList userList=new ArrayList();
	public boolean addDoctor(String DoctorId,String FirstName,String LastName,String Age,String Gender,String DoB,
			String ContactNumber,String AltContactNumber,String EmailID,String Password,
			String AddressLine1,String AddressLine2,String City,String State,String ZipCode,String Degree,String Specialty,String Workhours,String HospitalName,String MedicareServiceID)
	{
		Doctor u=new Doctor();
		u.setDoctorId(DoctorId);
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
		u.setDegree(Degree);
		u.setSpecialty(Specialty);
		u.setWorkhours(Workhours);
		u.setHospitalName(HospitalName);
		u.setMedicareServiceID(MedicareServiceID);
		udao.addDoctor(u);
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