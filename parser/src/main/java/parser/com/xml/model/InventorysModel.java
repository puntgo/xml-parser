package parser.com.xml.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*CREATE TABLE inventorys (
vendor_id VARCHAR(50),
interchange_control_number VARCHAR(50),
transaction_set_identifier_code VARCHAR(50),
purpose_code VARCHAR(50),
report_type_code VARCHAR(50),
reference_number VARCHAR(50),
create_date VARCHAR(50),
create_time VARCHAR(50),
identifier_code VARCHAR(50),
vendor_number VARCHAR(50),
vi_qualifier VARCHAR(50),
vi_vendor_warehouse_code VARCHAR(50),
line_item_id VARCHAR(50),
sk_qualifier VARCHAR(50),
item_number VARCHAR(50),
measurement_code VARCHAR(50),
si_dq_qualifier VARCHAR(50),
si_dq_vendor_warehouse_code VARCHAR(50),
quantity VARCHAR(50)
);
*/

@Entity
@Table(name="inventorys")
public class InventorysModel implements Serializable {

	private static final long serialVersionUID = 7208823213908605253L;
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="vendor_id")
	private String vendorId;
	
	
	@Column(name="interchange_control_number")
	private String interchangeControlNumber;
	
	@Column(name="transaction_set_identifier_code")
	private String transactionSetIdentifierCode;
	
	@Column(name="purpose_code")
	private String purposeCode;
	
	@Column(name="report_type_code")
	private String reportTypeCode;

	@Column(name="reference_number")
	private String referenceNumber;
	
	@Column(name="create_date")
	private String CreateDate;
	
	@Column(name="create_time")
	private String createTime;
	
	@Column(name="identifier_code")
	private String identifierCode;
	
	@Column(name="vendor_number")
	private String vendorNumber;
	
	@Column(name="vi_qualifier")
	private String vi_Qualifier;
	
	@Column(name="vi_vendor_warehouse_code")
	private String vi_VendorWarehouseCode;
	
	@Column(name="line_item_id")
	private String lineItemID;
	
	@Column(name="sk_qualifier")
	private String sk_Qualifier;
	
	@Column(name="item_number")
	private String itemNumber;
	
	@Column(name="measurement_code")
	private String measurementCode;
	
	@Column(name="si_dq_qualifier")
	private String si_dq_Qualifier;
	
	@Column(name="si_dq_vendor_warehouse_code")
	private String si_dq_VendorWarehouseCode;
	
	@Column(name="quantity")
	private String Quantity;

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getInterchangeControlNumber() {
		return interchangeControlNumber;
	}

	public void setInterchangeControlNumber(String interchangeControlNumber) {
		this.interchangeControlNumber = interchangeControlNumber;
	}

	public String getTransactionSetIdentifierCode() {
		return transactionSetIdentifierCode;
	}

	public void setTransactionSetIdentifierCode(String transactionSetIdentifierCode) {
		this.transactionSetIdentifierCode = transactionSetIdentifierCode;
	}

	public String getPurposeCode() {
		return purposeCode;
	}

	public void setPurposeCode(String purposeCode) {
		this.purposeCode = purposeCode;
	}

	public String getReportTypeCode() {
		return reportTypeCode;
	}

	public void setReportTypeCode(String reportTypeCode) {
		this.reportTypeCode = reportTypeCode;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(String createDate) {
		CreateDate = createDate;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getIdentifierCode() {
		return identifierCode;
	}

	public void setIdentifierCode(String identifierCode) {
		this.identifierCode = identifierCode;
	}

	public String getVendorNumber() {
		return vendorNumber;
	}

	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	public String getVi_Qualifier() {
		return vi_Qualifier;
	}

	public void setVi_Qualifier(String vi_Qualifier) {
		this.vi_Qualifier = vi_Qualifier;
	}

	public String getVi_VendorWarehouseCode() {
		return vi_VendorWarehouseCode;
	}

	public void setVi_VendorWarehouseCode(String vi_VendorWarehouseCode) {
		this.vi_VendorWarehouseCode = vi_VendorWarehouseCode;
	}

	public String getLineItemID() {
		return lineItemID;
	}

	public void setLineItemID(String lineItemID) {
		this.lineItemID = lineItemID;
	}

	public String getSk_Qualifier() {
		return sk_Qualifier;
	}

	public void setSk_Qualifier(String sk_Qualifier) {
		this.sk_Qualifier = sk_Qualifier;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getMeasurementCode() {
		return measurementCode;
	}

	public void setMeasurementCode(String measurementCode) {
		this.measurementCode = measurementCode;
	}

	public String getSi_dq_Qualifier() {
		return si_dq_Qualifier;
	}

	public void setSi_dq_Qualifier(String si_dq_Qualifier) {
		this.si_dq_Qualifier = si_dq_Qualifier;
	}

	public String getSi_dq_VendorWarehouseCode() {
		return si_dq_VendorWarehouseCode;
	}

	public void setSi_dq_VendorWarehouseCode(String si_dq_VendorWarehouseCode) {
		this.si_dq_VendorWarehouseCode = si_dq_VendorWarehouseCode;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
}
