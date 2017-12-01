package com.goku.demo.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.emailAddress
     *
     * @mbg.generated
     */
    private String emailaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.groupId
     *
     * @mbg.generated
     */
    private Integer groupid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.companyName
     *
     * @mbg.generated
     */
    private String companyname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.firstName
     *
     * @mbg.generated
     */
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.middleName
     *
     * @mbg.generated
     */
    private String middlename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.lastName
     *
     * @mbg.generated
     */
    private String lastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.nickName
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.password_
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.birthday_
     *
     * @mbg.generated
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.favoriteActivity
     *
     * @mbg.generated
     */
    private String favoriteactivity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.favoriteFood
     *
     * @mbg.generated
     */
    private String favoritefood;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.favoriteMovie
     *
     * @mbg.generated
     */
    private String favoritemovie;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.favoriteMusic
     *
     * @mbg.generated
     */
    private String favoritemusic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.greeting_
     *
     * @mbg.generated
     */
    private String greeting;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.createDate
     *
     * @mbg.generated
     */
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.modifiedDate
     *
     * @mbg.generated
     */
    private Date modifieddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.recycled_
     *
     * @mbg.generated
     */
    private String recycled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.loginDate
     *
     * @mbg.generated
     */
    private Date logindate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.lastLoginDate
     *
     * @mbg.generated
     */
    private Date lastlogindate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.loginIP
     *
     * @mbg.generated
     */
    private String loginip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.lastLoginIP
     *
     * @mbg.generated
     */
    private String lastloginip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.defaultTagId
     *
     * @mbg.generated
     */
    private String defaulttagid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.country_
     *
     * @mbg.generated
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.area_
     *
     * @mbg.generated
     */
    private String area;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.male_
     *
     * @mbg.generated
     */
    private String male;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.type_
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.active_
     *
     * @mbg.generated
     */
    private Integer active;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.valid_
     *
     * @mbg.generated
     */
    private String valid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.mobilePhone
     *
     * @mbg.generated
     */
    private String mobilephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.Phone_
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_.extuserid
     *
     * @mbg.generated
     */
    private Integer extuserid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.id
     *
     * @return the value of user_.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.id
     *
     * @param id the value for user_.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.emailAddress
     *
     * @return the value of user_.emailAddress
     *
     * @mbg.generated
     */
    public String getEmailaddress() {
        return emailaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.emailAddress
     *
     * @param emailaddress the value for user_.emailAddress
     *
     * @mbg.generated
     */
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress == null ? null : emailaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.company_id
     *
     * @return the value of user_.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.company_id
     *
     * @param companyId the value for user_.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.groupId
     *
     * @return the value of user_.groupId
     *
     * @mbg.generated
     */
    public Integer getGroupid() {
        return groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.groupId
     *
     * @param groupid the value for user_.groupId
     *
     * @mbg.generated
     */
    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.companyName
     *
     * @return the value of user_.companyName
     *
     * @mbg.generated
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.companyName
     *
     * @param companyname the value for user_.companyName
     *
     * @mbg.generated
     */
    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.firstName
     *
     * @return the value of user_.firstName
     *
     * @mbg.generated
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.firstName
     *
     * @param firstname the value for user_.firstName
     *
     * @mbg.generated
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.middleName
     *
     * @return the value of user_.middleName
     *
     * @mbg.generated
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.middleName
     *
     * @param middlename the value for user_.middleName
     *
     * @mbg.generated
     */
    public void setMiddlename(String middlename) {
        this.middlename = middlename == null ? null : middlename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.lastName
     *
     * @return the value of user_.lastName
     *
     * @mbg.generated
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.lastName
     *
     * @param lastname the value for user_.lastName
     *
     * @mbg.generated
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.nickName
     *
     * @return the value of user_.nickName
     *
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.nickName
     *
     * @param nickname the value for user_.nickName
     *
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.password_
     *
     * @return the value of user_.password_
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.password_
     *
     * @param password the value for user_.password_
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.birthday_
     *
     * @return the value of user_.birthday_
     *
     * @mbg.generated
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.birthday_
     *
     * @param birthday the value for user_.birthday_
     *
     * @mbg.generated
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.favoriteActivity
     *
     * @return the value of user_.favoriteActivity
     *
     * @mbg.generated
     */
    public String getFavoriteactivity() {
        return favoriteactivity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.favoriteActivity
     *
     * @param favoriteactivity the value for user_.favoriteActivity
     *
     * @mbg.generated
     */
    public void setFavoriteactivity(String favoriteactivity) {
        this.favoriteactivity = favoriteactivity == null ? null : favoriteactivity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.favoriteFood
     *
     * @return the value of user_.favoriteFood
     *
     * @mbg.generated
     */
    public String getFavoritefood() {
        return favoritefood;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.favoriteFood
     *
     * @param favoritefood the value for user_.favoriteFood
     *
     * @mbg.generated
     */
    public void setFavoritefood(String favoritefood) {
        this.favoritefood = favoritefood == null ? null : favoritefood.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.favoriteMovie
     *
     * @return the value of user_.favoriteMovie
     *
     * @mbg.generated
     */
    public String getFavoritemovie() {
        return favoritemovie;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.favoriteMovie
     *
     * @param favoritemovie the value for user_.favoriteMovie
     *
     * @mbg.generated
     */
    public void setFavoritemovie(String favoritemovie) {
        this.favoritemovie = favoritemovie == null ? null : favoritemovie.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.favoriteMusic
     *
     * @return the value of user_.favoriteMusic
     *
     * @mbg.generated
     */
    public String getFavoritemusic() {
        return favoritemusic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.favoriteMusic
     *
     * @param favoritemusic the value for user_.favoriteMusic
     *
     * @mbg.generated
     */
    public void setFavoritemusic(String favoritemusic) {
        this.favoritemusic = favoritemusic == null ? null : favoritemusic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.greeting_
     *
     * @return the value of user_.greeting_
     *
     * @mbg.generated
     */
    public String getGreeting() {
        return greeting;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.greeting_
     *
     * @param greeting the value for user_.greeting_
     *
     * @mbg.generated
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting == null ? null : greeting.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.createDate
     *
     * @return the value of user_.createDate
     *
     * @mbg.generated
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.createDate
     *
     * @param createdate the value for user_.createDate
     *
     * @mbg.generated
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.modifiedDate
     *
     * @return the value of user_.modifiedDate
     *
     * @mbg.generated
     */
    public Date getModifieddate() {
        return modifieddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.modifiedDate
     *
     * @param modifieddate the value for user_.modifiedDate
     *
     * @mbg.generated
     */
    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.recycled_
     *
     * @return the value of user_.recycled_
     *
     * @mbg.generated
     */
    public String getRecycled() {
        return recycled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.recycled_
     *
     * @param recycled the value for user_.recycled_
     *
     * @mbg.generated
     */
    public void setRecycled(String recycled) {
        this.recycled = recycled == null ? null : recycled.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.loginDate
     *
     * @return the value of user_.loginDate
     *
     * @mbg.generated
     */
    public Date getLogindate() {
        return logindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.loginDate
     *
     * @param logindate the value for user_.loginDate
     *
     * @mbg.generated
     */
    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.lastLoginDate
     *
     * @return the value of user_.lastLoginDate
     *
     * @mbg.generated
     */
    public Date getLastlogindate() {
        return lastlogindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.lastLoginDate
     *
     * @param lastlogindate the value for user_.lastLoginDate
     *
     * @mbg.generated
     */
    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.loginIP
     *
     * @return the value of user_.loginIP
     *
     * @mbg.generated
     */
    public String getLoginip() {
        return loginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.loginIP
     *
     * @param loginip the value for user_.loginIP
     *
     * @mbg.generated
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.lastLoginIP
     *
     * @return the value of user_.lastLoginIP
     *
     * @mbg.generated
     */
    public String getLastloginip() {
        return lastloginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.lastLoginIP
     *
     * @param lastloginip the value for user_.lastLoginIP
     *
     * @mbg.generated
     */
    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.defaultTagId
     *
     * @return the value of user_.defaultTagId
     *
     * @mbg.generated
     */
    public String getDefaulttagid() {
        return defaulttagid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.defaultTagId
     *
     * @param defaulttagid the value for user_.defaultTagId
     *
     * @mbg.generated
     */
    public void setDefaulttagid(String defaulttagid) {
        this.defaulttagid = defaulttagid == null ? null : defaulttagid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.country_
     *
     * @return the value of user_.country_
     *
     * @mbg.generated
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.country_
     *
     * @param country the value for user_.country_
     *
     * @mbg.generated
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.area_
     *
     * @return the value of user_.area_
     *
     * @mbg.generated
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.area_
     *
     * @param area the value for user_.area_
     *
     * @mbg.generated
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.male_
     *
     * @return the value of user_.male_
     *
     * @mbg.generated
     */
    public String getMale() {
        return male;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.male_
     *
     * @param male the value for user_.male_
     *
     * @mbg.generated
     */
    public void setMale(String male) {
        this.male = male == null ? null : male.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.type_
     *
     * @return the value of user_.type_
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.type_
     *
     * @param type the value for user_.type_
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.active_
     *
     * @return the value of user_.active_
     *
     * @mbg.generated
     */
    public Integer getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.active_
     *
     * @param active the value for user_.active_
     *
     * @mbg.generated
     */
    public void setActive(Integer active) {
        this.active = active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.valid_
     *
     * @return the value of user_.valid_
     *
     * @mbg.generated
     */
    public String getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.valid_
     *
     * @param valid the value for user_.valid_
     *
     * @mbg.generated
     */
    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.mobilePhone
     *
     * @return the value of user_.mobilePhone
     *
     * @mbg.generated
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.mobilePhone
     *
     * @param mobilephone the value for user_.mobilePhone
     *
     * @mbg.generated
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.Phone_
     *
     * @return the value of user_.Phone_
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.Phone_
     *
     * @param phone the value for user_.Phone_
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_.extuserid
     *
     * @return the value of user_.extuserid
     *
     * @mbg.generated
     */
    public Integer getExtuserid() {
        return extuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_.extuserid
     *
     * @param extuserid the value for user_.extuserid
     *
     * @mbg.generated
     */
    public void setExtuserid(Integer extuserid) {
        this.extuserid = extuserid;
    }
}