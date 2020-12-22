package users.cts;

public class Medicare {

	private String MedicareServiceId;
	private String MedicareService;
	private String ServiceDescription;
	private String Amount;
	public String getMedicareServiceId() {
		return MedicareServiceId;
	}
	public void setMedicareServiceId(String medicareServiceId) {
		MedicareServiceId = medicareServiceId;
	}
	public String getMedicareService() {
		return MedicareService;
	}
	public void setMedicareService(String medicareService) {
		MedicareService = medicareService;
	}
	public String getServiceDescription() {
		return ServiceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		ServiceDescription = serviceDescription;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	@Override
	public String toString() {
		return "Medicare [MedicareServiceId=" + MedicareServiceId + ", MedicareService=" + MedicareService
				+ ", ServiceDescription=" + ServiceDescription + ", Amount=" + Amount + "]";
	}
	public Medicare(String medicareServiceId, String medicareService, String serviceDescription, String amount) {
		super();
		MedicareServiceId = medicareServiceId;
		MedicareService = medicareService;
		ServiceDescription = serviceDescription;
		Amount = amount;
	}
	public Medicare() {
		super();
	}
	
	
	
}
