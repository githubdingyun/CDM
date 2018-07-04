package com.cdm.model;

import org.springframework.stereotype.Repository;

@Repository
public class WarehouseMaterial extends WarehouseMaterialKey {
    private Integer warehouseMaterialNum;

    private String warehouseMaterialDesc;

    public Integer getWarehouseMaterialNum() {
        return warehouseMaterialNum;
    }

    public void setWarehouseMaterialNum(Integer warehouseMaterialNum) {
        this.warehouseMaterialNum = warehouseMaterialNum;
    }

    public String getWarehouseMaterialDesc() {
        return warehouseMaterialDesc;
    }

    public void setWarehouseMaterialDesc(String warehouseMaterialDesc) {
        this.warehouseMaterialDesc = warehouseMaterialDesc == null ? null : warehouseMaterialDesc.trim();
    }
}