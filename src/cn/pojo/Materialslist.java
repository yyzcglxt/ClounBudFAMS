package cn.pojo;
/**
 * 物资详情表（materialslist）
 */
public class Materialslist {
	private Integer mateId;					//ID
	private Integer mateMaterialsId;		//物资ID
	private Integer mateQuantity;			//数量
	private Integer mateMaterialdetailsId;	//物资详情ID
	private Integer matePurchase;			//是否采购
	private Integer mateInventory;			//是否库存
	public Integer getMateId() {
		return mateId;
	}
	public void setMateId(Integer mateId) {
		this.mateId = mateId;
	}
	public Integer getMateMaterialsId() {
		return mateMaterialsId;
	}
	public void setMateMaterialsId(Integer mateMaterialsId) {
		this.mateMaterialsId = mateMaterialsId;
	}
	public Integer getMateQuantity() {
		return mateQuantity;
	}
	public void setMateQuantity(Integer mateQuantity) {
		this.mateQuantity = mateQuantity;
	}
	public Integer getMateMaterialdetailsId() {
		return mateMaterialdetailsId;
	}
	public void setMateMaterialdetailsId(Integer mateMaterialdetailsId) {
		this.mateMaterialdetailsId = mateMaterialdetailsId;
	}
	public Integer getMatePurchase() {
		return matePurchase;
	}
	public void setMatePurchase(Integer matePurchase) {
		this.matePurchase = matePurchase;
	}
	public Integer getMateInventory() {
		return mateInventory;
	}
	public void setMateInventory(Integer mateInventory) {
		this.mateInventory = mateInventory;
	}
	
}
