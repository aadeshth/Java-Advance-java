package com.core.oops.encapsulation;


public class BaseEntity {
    private String addedDate;
    private String addedBy;
    private String updatedDate;
    private String UpdatedBy;

    public BaseEntity(String addedDate, String addedBy, String updatedDate, String updatedBy) {
        this.addedDate = addedDate;
        this.addedBy = addedBy;
        this.updatedDate = updatedDate;
        this.UpdatedBy = updatedBy;
    }

    public String getAddedDate() {
        return addedDate;
    }

    private void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public String getAddedBy() {
        return addedBy;
    }

    private void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    private void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedBy() {

//        this.setUpdatedDate("1000000");
        return UpdatedBy;
    }

    private void setUpdatedBy(String updatedBy) {
        UpdatedBy = updatedBy;
    }
}
