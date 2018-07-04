package com.cdm.model;

import org.springframework.stereotype.Repository;

@Repository
public class Material {
    private Integer materialId;

    private String materialName;

    private Float materialPrice;

    private Float materialSize;

    private String materialDesc;

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public Float getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(Float materialPrice) {
        this.materialPrice = materialPrice;
    }

    public Float getMaterialSize() {
        return materialSize;
    }

    public void setMaterialSize(Float materialSize) {
        this.materialSize = materialSize;
    }

    public String getMaterialDesc() {
        return materialDesc;
    }

    public void setMaterialDesc(String materialDesc) {
        this.materialDesc = materialDesc == null ? null : materialDesc.trim();
    }
}