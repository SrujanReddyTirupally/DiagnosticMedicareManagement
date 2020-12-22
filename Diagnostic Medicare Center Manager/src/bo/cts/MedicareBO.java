package bo.cts;
import java.util.ArrayList;

import com.cts.dao.MedicareDao;
import com.cts.dao.UserDao;

import users.cts.Medicare;
import users.cts.User;
public class MedicareBO {

	MedicareDao mdao=new MedicareDao();
	ArrayList userList=new ArrayList();
	public boolean addmedicare(String MedicareServiceId,String MedicareService,String ServiceDescription,String Amount)
	{
		Medicare u=new Medicare();
		u.setMedicareServiceId(MedicareServiceId);
		u.setMedicareService(MedicareService);
		u.setServiceDescription(ServiceDescription);
		u.setAmount(Amount);
		
		mdao.addMedicare(u);
		userList.add(u);
		return true;
	}
	
	
	
}
