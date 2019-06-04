package modeling;

public class Bundle {

    private String ID;
    private String advQOSPolicy;
    private String customerID;
    private String customerName;
    private String siteAddress;
    private String userName;
    private String contractTerm;
    private String portType;
    private String portSpeed;
    private String contractedBW;

    public Bundle() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAdvQOSPolicy() {
        return advQOSPolicy;
    }

    public void setAdvQOSPolicy(String advQOSPolicy) {
        this.advQOSPolicy = advQOSPolicy;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContractTerm() {
        return contractTerm;
    }

    public void setContractTerm(String contractTerm) {
        this.contractTerm = contractTerm;
    }

    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public String getPortSpeed() {
        return portSpeed;
    }

    public void setPortSpeed(String portSpeed) {
        this.portSpeed = portSpeed;
    }

    public String getContractedBW() {
        return contractedBW;
    }

    public void setContractedBW(String contractedBW) {
        this.contractedBW = contractedBW;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
