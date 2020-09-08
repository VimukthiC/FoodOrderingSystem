
package dto;

public class ItemDTO {
    private String itemCode;
    private String itemName;
    private double unitPrice;
    private int qty;
    private String mFDate;
    private String exDate;

    public ItemDTO() {
    }

    public ItemDTO(String itemCode, String itemName, double unitPrice, int qty, String mFDate, String exDate) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.mFDate = mFDate;
        this.exDate = exDate;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the mFDate
     */
    public String getmFDate() {
        return mFDate;
    }

    /**
     * @param mFDate the mFDate to set
     */
    public void setmFDate(String mFDate) {
        this.mFDate = mFDate;
    }

    /**
     * @return the exDate
     */
    public String getExDate() {
        return exDate;
    }

    /**
     * @param exDate the exDate to set
     */
    public void setExDate(String exDate) {
        this.exDate = exDate;
    }

   
}
