package com.example.nim.HelperClasses;

public class VehicleBuyDataModel {
    String OwnerName, OwnerMobile, OwnerAddress, VehicleType, VehicleNumber, VehicleModelYear, EngineNumber, ChassisNumber ,TotalAmount, AdvanceAmount, RemainingAmount;

    public VehicleBuyDataModel() {
    }

    public VehicleBuyDataModel(String ownerName, String ownerMobile, String ownerAddress, String vehicleType, String vehicleNumber, String vehicleModelYear, String engineNumber, String chassisNumber, String totalAmount, String advanceAmount, String remainingAmount) {
        OwnerName = ownerName;
        OwnerMobile = ownerMobile;
        OwnerAddress = ownerAddress;
        VehicleType = vehicleType;
        VehicleNumber = vehicleNumber;
        VehicleModelYear = vehicleModelYear;
        EngineNumber = engineNumber;
        ChassisNumber = chassisNumber;
        TotalAmount = totalAmount;
        AdvanceAmount = advanceAmount;
        RemainingAmount = remainingAmount;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getOwnerMobile() {
        return OwnerMobile;
    }

    public void setOwnerMobile(String ownerMobile) {
        OwnerMobile = ownerMobile;
    }

    public String getOwnerAddress() {
        return OwnerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        OwnerAddress = ownerAddress;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getVehicleModelYear() {
        return VehicleModelYear;
    }

    public void setVehicleModelYear(String vehicleModelYear) {
        VehicleModelYear = vehicleModelYear;
    }

    public String getEngineNumber() {
        return EngineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        EngineNumber = engineNumber;
    }

    public String getChassisNumber() {
        return ChassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        ChassisNumber = chassisNumber;
    }

    public String getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        TotalAmount = totalAmount;
    }

    public String getAdvanceAmount() {
        return AdvanceAmount;
    }

    public void setAdvanceAmount(String advanceAmount) {
        AdvanceAmount = advanceAmount;
    }

    public String getRemainingAmount() {
        return RemainingAmount;
    }

    public void setRemainingAmount(String remainingAmount) {
        RemainingAmount = remainingAmount;
    }
}
