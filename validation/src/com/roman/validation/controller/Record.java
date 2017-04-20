package com.roman.validation.controller;

import java.util.HashSet;

/**
 * Created by Roman_Boiko1 on 4/19/2017.
 */
public class Record {
    private String firstName;
    private String secondName;
    private String lastName = null;
    private String nickName = null;
    private String comment = null;
    private HashSet<Group> groups = new HashSet<Group>();
    private String mobilePhoneNumber = null;
    private String homePhoneNumber = null;
    private String secondMobilePhoneNumber = null;
    private String skypeAccount = null;
    private Address address = null;
    private String addressInStringFormat = null;
    private String email = null;

    public Record(String firstName, String secondName) {
        setFirstName(firstName);
        setSecondName(secondName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public HashSet<Group> getGroups() {
        return groups;
    }

    public void setGroups(HashSet<Group> groups) {
        this.groups = groups;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getSecondMobilePhoneNumber() {
        return secondMobilePhoneNumber;
    }

    public void setSecondMobilePhoneNumber(String _SecondMobilePhoneNumber) {
        this.secondMobilePhoneNumber = _SecondMobilePhoneNumber;
    }

    public String getSkypeAccount() {
        return skypeAccount;
    }

    public void setSkypeAccount(String skypeAccount) {
        this.skypeAccount = skypeAccount;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAddressInStringFormat() {
        return addressInStringFormat;
    }

    public void setAddressInStringFormat(String addressInStringFormat) {
        this.addressInStringFormat = addressInStringFormat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
