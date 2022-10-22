package models;

public class Contact {

    String welcome;
    String personalName;
    String lastName;
    String organisation;
    String position;
    String phone;
    String mobilePhone;
    String email;
    String subordinate;
    String streetInPostAddress;
    String cityInPostAddress;
    String regionInPostAddress;
    String indexInPostAddress;
    String landInPostAddress;
    String anotherStreet;
    String anotherCity;
    String anotherRegion;
    String anotherIndex;
    String anotherLand;
    String fax;
    String homePhone;
    String anotherPhone;
    String assistancePhone;
    String assistance;
    String department;
    String sourceInterest;
    String birthDay;
    String description;

    public Contact(String welcome, String personalName, String lastName, String organisation, String position, String phone,
                   String mobilePhone, String email, String streetInPostAddress, String cityInPostAddress,
                   String indexInPostAddress, String regionInPostAddress, String landInPostAddress, String anotherStreet,
                   String anotherCity, String anotherIndex, String anotherRegion, String anotherLand, String fax,
                   String homePhone, String anotherPhone, String assistancePhone, String assistance, String department,
                   String birthDay, String description) {
        this.welcome = welcome;
        this.personalName = personalName;
        this.lastName = lastName;
        this.organisation = organisation;
        this.position = position;
        this.phone = phone;
        this.mobilePhone = mobilePhone;
        this.email = email;
//        this.subordinate = subordinate;
        this.streetInPostAddress = streetInPostAddress;
        this.cityInPostAddress = cityInPostAddress;
        this.indexInPostAddress = indexInPostAddress;
        this.regionInPostAddress = regionInPostAddress;
        this.landInPostAddress = landInPostAddress;
        this.anotherStreet = anotherStreet;
        this.anotherCity = anotherCity;
        this.anotherIndex = anotherIndex;
        this.anotherRegion = anotherRegion;
        this.anotherLand = anotherLand;
        this.fax = fax;
        this.homePhone = homePhone;
        this.anotherPhone = anotherPhone;
        this.assistancePhone = assistancePhone;
        this.assistance = assistance;
        this.department = department;
//        this.sourceInterest = sourceInterest;
        this.birthDay = birthDay;
        this.description = description;
    }
//
//    public Contact(String organisation, String subordinate, String sourceInterest) {
////        this.organisation = organisation;
//        this.subordinate = subordinate;
//        this.sourceInterest = sourceInterest;
//    }

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(String subordinate) {
        this.subordinate = subordinate;
    }

    public String getStreetInPostAddress() {
        return streetInPostAddress;
    }

    public void setStreetInPostAddress(String streetInPostAddress) {
        this.streetInPostAddress = streetInPostAddress;
    }

    public String getCityInPostAddress() {
        return cityInPostAddress;
    }

    public void setCityInPostAddress(String cityInPostAddress) {
        this.cityInPostAddress = cityInPostAddress;
    }

    public String getRegionInPostAddress() {
        return regionInPostAddress;
    }

    public void setRegionInPostAddress(String regionInPostAddress) {
        this.regionInPostAddress = regionInPostAddress;
    }

    public String getIndexInPostAddress() {
        return indexInPostAddress;
    }

    public void setIndexInPostAddress(String indexInPostAddress) {
        this.indexInPostAddress = indexInPostAddress;
    }

    public String getLandInPostAddress() {
        return landInPostAddress;
    }

    public void setLandInPostAddress(String landInPostAddress) {
        this.landInPostAddress = landInPostAddress;
    }

    public String getAnotherStreet() {
        return anotherStreet;
    }

    public void setAnotherStreet(String anotherStreet) {
        this.anotherStreet = anotherStreet;
    }

    public String getAnotherCity() {
        return anotherCity;
    }

    public void setAnotherCity(String anotherCity) {
        this.anotherCity = anotherCity;
    }

    public String getAnotherRegion() {
        return anotherRegion;
    }

    public void setAnotherRegion(String anotherRegion) {
        this.anotherRegion = anotherRegion;
    }

    public String getAnotherIndex() {
        return anotherIndex;
    }

    public void setAnotherIndex(String anotherIndex) {
        this.anotherIndex = anotherIndex;
    }

    public String getAnotherLand() {
        return anotherLand;
    }

    public void setAnotherLand(String anotherLand) {
        this.anotherLand = anotherLand;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getAnotherPhone() {
        return anotherPhone;
    }

    public void setAnotherPhone(String anotherPhone) {
        this.anotherPhone = anotherPhone;
    }

    public String getAssistancePhone() {
        return assistancePhone;
    }

    public void setAssistancePhone(String assistancePhone) {
        this.assistancePhone = assistancePhone;
    }

    public String getAssistance() {
        return assistance;
    }

    public void setAssistance(String assistance) {
        this.assistance = assistance;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSourceInterest() {
        return sourceInterest;
    }

    public void setSourceInterest(String sourceInterest) {
        this.sourceInterest = sourceInterest;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
