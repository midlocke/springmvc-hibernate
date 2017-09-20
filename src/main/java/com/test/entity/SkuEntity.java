package com.test.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by lichao on 2017/9/20.
 */
@Entity
@Table(name = "sku", schema = "rtwx_seckill", catalog = "")
public class SkuEntity {
    private long id;
    private String areaCode;
    private String areaName;
    private String skuName;
    private String skuPicUrl;
    private String rtArtno;
    private int salesNum;
    private String salesUnit;
    private String specification;
    private BigDecimal originalPrice;
    private byte isDelete;
    private byte status;
    private String createId;
    private Timestamp createTime;
    private String updateId;
    private Timestamp updateTime;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "area_code")
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Basic
    @Column(name = "area_name")
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Basic
    @Column(name = "sku_name")
    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    @Basic
    @Column(name = "sku_pic_url")
    public String getSkuPicUrl() {
        return skuPicUrl;
    }

    public void setSkuPicUrl(String skuPicUrl) {
        this.skuPicUrl = skuPicUrl;
    }

    @Basic
    @Column(name = "rt_artno")
    public String getRtArtno() {
        return rtArtno;
    }

    public void setRtArtno(String rtArtno) {
        this.rtArtno = rtArtno;
    }

    @Basic
    @Column(name = "sales_num")
    public int getSalesNum() {
        return salesNum;
    }

    public void setSalesNum(int salesNum) {
        this.salesNum = salesNum;
    }

    @Basic
    @Column(name = "sales_unit")
    public String getSalesUnit() {
        return salesUnit;
    }

    public void setSalesUnit(String salesUnit) {
        this.salesUnit = salesUnit;
    }

    @Basic
    @Column(name = "specification")
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Basic
    @Column(name = "original_price")
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    @Basic
    @Column(name = "is_delete")
    public byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(byte isDelete) {
        this.isDelete = isDelete;
    }

    @Basic
    @Column(name = "status")
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "create_id")
    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_id")
    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SkuEntity skuEntity = (SkuEntity) o;

        if (id != skuEntity.id) return false;
        if (salesNum != skuEntity.salesNum) return false;
        if (isDelete != skuEntity.isDelete) return false;
        if (status != skuEntity.status) return false;
        if (areaCode != null ? !areaCode.equals(skuEntity.areaCode) : skuEntity.areaCode != null) return false;
        if (areaName != null ? !areaName.equals(skuEntity.areaName) : skuEntity.areaName != null) return false;
        if (skuName != null ? !skuName.equals(skuEntity.skuName) : skuEntity.skuName != null) return false;
        if (skuPicUrl != null ? !skuPicUrl.equals(skuEntity.skuPicUrl) : skuEntity.skuPicUrl != null) return false;
        if (rtArtno != null ? !rtArtno.equals(skuEntity.rtArtno) : skuEntity.rtArtno != null) return false;
        if (salesUnit != null ? !salesUnit.equals(skuEntity.salesUnit) : skuEntity.salesUnit != null) return false;
        if (specification != null ? !specification.equals(skuEntity.specification) : skuEntity.specification != null)
            return false;
        if (originalPrice != null ? !originalPrice.equals(skuEntity.originalPrice) : skuEntity.originalPrice != null)
            return false;
        if (createId != null ? !createId.equals(skuEntity.createId) : skuEntity.createId != null) return false;
        if (createTime != null ? !createTime.equals(skuEntity.createTime) : skuEntity.createTime != null) return false;
        if (updateId != null ? !updateId.equals(skuEntity.updateId) : skuEntity.updateId != null) return false;
        if (updateTime != null ? !updateTime.equals(skuEntity.updateTime) : skuEntity.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (areaCode != null ? areaCode.hashCode() : 0);
        result = 31 * result + (areaName != null ? areaName.hashCode() : 0);
        result = 31 * result + (skuName != null ? skuName.hashCode() : 0);
        result = 31 * result + (skuPicUrl != null ? skuPicUrl.hashCode() : 0);
        result = 31 * result + (rtArtno != null ? rtArtno.hashCode() : 0);
        result = 31 * result + salesNum;
        result = 31 * result + (salesUnit != null ? salesUnit.hashCode() : 0);
        result = 31 * result + (specification != null ? specification.hashCode() : 0);
        result = 31 * result + (originalPrice != null ? originalPrice.hashCode() : 0);
        result = 31 * result + (int) isDelete;
        result = 31 * result + (int) status;
        result = 31 * result + (createId != null ? createId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateId != null ? updateId.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
