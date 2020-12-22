package bo.cts;
import java.util.ArrayList;

import com.cts.dao.TestregDao;

import users.cts.Testreg;
public class TestregBO {
	TestregDao udao=new TestregDao();
		ArrayList userList=new ArrayList();
		public boolean addtestreg(String reportid,String customerid,String doctorid,String medicareserviceid,String agentid,String servicedate,String testresultdate,String diag1value,String diag1range,String diag2value,String diag2range,String diag3value,String diag3range,String diag4value,String diag4range,String diag5value,String diag5range,String diag6value,String diag6range,String doctorcomments,String otherinfo)
		{
			Testreg u=new Testreg();
			u.setReportid(reportid);
			u.setCustomerid(customerid);
			u.setDoctorid(doctorid);
			u.setMedicareserviceid(medicareserviceid);			
			u.setAgentid(agentid);
			u.setServicedate(servicedate);
			u.setTestresultdate(testresultdate);
			u.setDiag1range(diag1value);
			u.setDiag1value(diag1range);
			u.setDiag1range(diag2value);
			u.setDiag1value(diag2range);
			u.setDiag1range(diag3value);
			u.setDiag1value(diag3range);
			u.setDiag1range(diag4value);
			u.setDiag1value(diag4range);
			u.setDiag1range(diag5value);
			u.setDiag1value(diag5range);
			u.setDiag1range(diag6value);
			u.setDiag1value(diag6range);
			u.setDoctorcomments(doctorcomments);
			u.setOtherinfo(otherinfo);
			udao.addtestreg(u);
			userList.add(u);
			return true;
		}	
}
