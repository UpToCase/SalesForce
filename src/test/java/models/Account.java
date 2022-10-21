package models;

public class Account {
    String companyName;
    String newCompanyUrl;
    String companyPhoneNumber;
    String companyWorkersAmount;
    String postcodeForPayment;
    String cityForPayment;
    String regionForPayment;
    String countryForPayment;
    String shipmentPostcode;
    String shipmentCity;
    String shipmentRegion;
    String shipmentCountry;

    String companyType;
    String companyIndustry;

    String streetForPayment;
    String streetForShipment;
    String companyDescription;

    public Account(String companyName, String newCompanyUrl, String companyPhoneNumber, String companyWorkersAmount,
                   String postcodeForPayment, String cityForPayment, String regionForPayment, String countryForPayment,
                   String shipmentPostcode, String shipmentCity, String shipmentRegion, String shipmentCountry,
                   String chooseCompanyType, String chooseCompanyIndustry, String streetForPayment,
                   String streetForShipment, String companyDescription) {
        this.companyName = companyName;
        this.newCompanyUrl = newCompanyUrl;
        this.companyPhoneNumber = companyPhoneNumber;
        this.companyWorkersAmount = companyWorkersAmount;
        this.postcodeForPayment = postcodeForPayment;
        this.cityForPayment = cityForPayment;
        this.regionForPayment = regionForPayment;
        this.countryForPayment = countryForPayment;
        this.shipmentPostcode = shipmentPostcode;
        this.shipmentCity = shipmentCity;
        this.shipmentRegion = shipmentRegion;
        this.shipmentCountry = shipmentCountry;
        this.companyType = chooseCompanyType;
        this.companyIndustry = chooseCompanyIndustry;
        this.streetForPayment = streetForPayment;
        this.streetForShipment = streetForShipment;
        this.companyDescription = companyDescription;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNewCompanyUrl() {
        return newCompanyUrl;
    }

    public void setNewCompanyUrl(String newCompanyUrl) {
        this.newCompanyUrl = newCompanyUrl;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public String getCompanyWorkersAmount() {
        return companyWorkersAmount;
    }

    public void setCompanyWorkersAmount(String companyWorkersAmount) {
        this.companyWorkersAmount = companyWorkersAmount;
    }

    public String getPostcodeForPayment() {
        return postcodeForPayment;
    }

    public void setPostcodeForPayment(String postcodeForPayment) {
        this.postcodeForPayment = postcodeForPayment;
    }

    public String getCityForPayment() {
        return cityForPayment;
    }

    public void setCityForPayment(String cityForPayment) {
        this.cityForPayment = cityForPayment;
    }

    public String getRegionForPayment() {
        return regionForPayment;
    }

    public void setRegionForPayment(String regionForPayment) {
        this.regionForPayment = regionForPayment;
    }

    public String getCountryForPayment() {
        return countryForPayment;
    }

    public void setCountryForPayment(String countryForPayment) {
        this.countryForPayment = countryForPayment;
    }

    public String getShipmentPostcode() {
        return shipmentPostcode;
    }

    public void setShipmentPostcode(String shipmentPostcode) {
        this.shipmentPostcode = shipmentPostcode;
    }

    public String getShipmentCity() {
        return shipmentCity;
    }

    public void setShipmentCity(String shipmentCity) {
        this.shipmentCity = shipmentCity;
    }

    public String getShipmentRegion() {
        return shipmentRegion;
    }

    public void setShipmentRegion(String shipmentRegion) {
        this.shipmentRegion = shipmentRegion;
    }

    public String getShipmentCountry() {
        return shipmentCountry;
    }

    public void setShipmentCountry(String shipmentCountry) {
        this.shipmentCountry = shipmentCountry;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    public String getStreetForPayment() {
        return streetForPayment;
    }

    public void setStreetForPayment(String streetForPayment) {
        this.streetForPayment = streetForPayment;
    }

    public String getStreetForShipment() {
        return streetForShipment;
    }

    public void setStreetForShipment(String streetForShipment) {
        this.streetForShipment = streetForShipment;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }
}
