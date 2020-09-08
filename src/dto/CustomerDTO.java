
package dto;

public class CustomerDTO {
    private String customerID;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    private String customerNIC;
    private double customerSalary;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerID, String customerName, String customerAddress, String customerPhone, String customerNIC, double customerSalary) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
        this.customerNIC = customerNIC;
        this.customerSalary = customerSalary;
    }

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerAddress
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * @param customerAddress the customerAddress to set
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * @return the customerPhone
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * @param customerPhone the customerPhone to set
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    /**
     * @return the customerNIC
     */
    public String getCustomerNIC() {
        return customerNIC;
    }

    /**
     * @param customerNIC the customerNIC to set
     */
    public void setCustomerNIC(String customerNIC) {
        this.customerNIC = customerNIC;
    }

    /**
     * @return the customerSalary
     */
    public double getCustomerSalary() {
        return customerSalary;
    }

    /**
     * @param customerSalary the customerSalary to set
     */
    public void setCustomerSalary(double customerSalary) {
        this.customerSalary = customerSalary;
    }

   
}
