package bo.cts;
import java.util.ArrayList;

import com.cts.dao.AgentDao;
import com.cts.dao.UserDao;
import users.cts.Agent;
public class AgentBO {
	AgentDao adao=new AgentDao();
	ArrayList userList=new ArrayList();
	public boolean addagent(String agentId,String FirstName,String LastName,String Age,String Gender,String DoB,
			String ContactNumber,String AltContactNumber,String EmailID,String Password,
			String AddressLine1,String AddressLine2,String City,String State,String ZipCode)
	{
		Agent u=new Agent();
		u.setUserId(agentId);
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
		adao.addagent(u);
		userList.add(u);
		return true;
	}
}
