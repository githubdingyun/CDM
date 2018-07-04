package com.cdm.model;

import org.springframework.stereotype.Repository;

@Repository
public class Warehouse {
    private Integer warehouseId;

    private Integer supplierId;

    private Integer locationId;

    private Float warehouseArea;

    private String warehousePhone;

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Float getWarehouseArea() {
        return warehouseArea;
    }

    public void setWarehouseArea(Float warehouseArea) {
        this.warehouseArea = warehouseArea;
    }

    public String getWarehousePhone() {
        return warehousePhone;
    }

    public void setWarehousePhone(String warehousePhone) {
        this.warehousePhone = warehousePhone == null ? null : warehousePhone.trim();
    }
}