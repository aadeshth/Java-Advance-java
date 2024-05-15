package com.core.oops.encapsulation;


public class TestEncapsulation {
    public static void main(String[] args) {
        String addedDate="2020", addedBy="CodeFirst", updatedDate="2024", UpdatedBy="Aadi";
        BaseEntity baseEntity = new BaseEntity(addedDate, addedBy,updatedDate,UpdatedBy);
        System.out.println(baseEntity.getUpdatedBy()+" : "+ baseEntity.getUpdatedDate());
    }
}
