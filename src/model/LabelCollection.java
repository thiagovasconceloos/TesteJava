package model;

public class LabelCollection {

	private LogisticAddress senderData;
	private LogisticAddress shippingData;
	private String weightObject;
	private Double lengthObject;
	private Double heightObject;
	private Double widthObject;
	private Double DiameterObject;
	
	public LabelCollection() {
		senderData = new LogisticAddress();
		senderData.setAddressStreet("Av Paulista");
		senderData.setAddressNumber("1053");
		senderData.setAddressNumberInt("10o Andar");
		senderData.setEmail("emaildata@email.com.br");
		senderData.setName("Haddah");
		senderData.setSurname("Sulamman");
		senderData.setPostalCode("01311-094");
		
		shippingData = new LogisticAddress();
		shippingData.setAddressStreet("Estrada da Palmeira");
		shippingData.setAddressNumber("15");
		shippingData.setAddressNumberInt("");
		shippingData.setEmail("estradaDestino@palmeira.com");
		shippingData.setName("Hannah");
		shippingData.setSurname("Baker");
		shippingData.setPostalCode("13456-123");
		
		weightObject = "0.634Kg";
		lengthObject = 1.40;
		heightObject = 2.0;
		widthObject = 0.5;
		DiameterObject = 0d;
	}
	
	public LogisticAddress getSenderData() {
		return senderData;
	}
	public void setSenderData(LogisticAddress senderData) {
		this.senderData = senderData;
	}
	public LogisticAddress getShippingData() {
		return shippingData;
	}
	public void setShippingData(LogisticAddress shippingData) {
		this.shippingData = shippingData;
	}
	public String getWeightObject() {
		return weightObject;
	}
	public void setWeightObject(String weightObject) {
		this.weightObject = weightObject;
	}
	public Double getLengthObject() {
		return lengthObject;
	}
	public void setLengthObject(Double lengthObject) {
		this.lengthObject = lengthObject;
	}
	public Double getHeightObject() {
		return heightObject;
	}
	public void setHeightObject(Double heightObject) {
		this.heightObject = heightObject;
	}
	public Double getWidthObject() {
		return widthObject;
	}
	public void setWidthObject(Double widthObject) {
		this.widthObject = widthObject;
	}
	public Double getDiameterObject() {
		return DiameterObject;
	}
	public void setDiameterObject(Double diameterObject) {
		DiameterObject = diameterObject;
	}
}
