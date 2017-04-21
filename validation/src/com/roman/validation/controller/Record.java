package com.roman.validation.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;

/**
 * Created by Roman_Boiko1 on 4/19/2017.
 */
public class Record {
    private String firstName;
    private String secondName;
    private String shortName;
    private String lastName = null;
    private String nickName = null;
    private String comment = null;
    private HashSet<Group> groups = new HashSet<Group>();
    private String cellPhoneNumber = null;
    private String homePhoneNumber = null;
    private String secondCellPhoneNumber = null;
    private String skypeAccount = null;
    private Address address = null;
    private String addressInStringFormat = null;
    private String email = null;
    private Calendar createDate = null;
    private Calendar modifyDate = null;


    public Record(String firstName, String secondName) {
        createDate = new GregorianCalendar();
        modifyDate = new GregorianCalendar();
        this.firstName = firstName;
        this.secondName = secondName;
        constructShortName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        constructShortName();
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
        constructShortName();
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public String getShortName() {
        return shortName;
    }

    private void constructShortName() {
        StringBuilder shName = new StringBuilder();
        shName.append(getSecondName());
        shName.append(" ");
        shName.append(getFirstName().charAt(0));
        shName.append(".");
        this.shortName = shName.toString();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public HashSet<Group> getGroups() {
        return groups;
    }

    public void setGroups(HashSet<Group> groups) {
        this.groups = groups;
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public String getSecondCellPhoneNumber() {
        return secondCellPhoneNumber;
    }

    public void setSecondCellPhoneNumber(String secondCellPhoneNumber) {
        this.secondCellPhoneNumber = secondCellPhoneNumber;
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public String getSkypeAccount() {
        return skypeAccount;
    }

    public void setSkypeAccount(String skypeAccount) {
        this.skypeAccount = skypeAccount;
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public String getAddressInStringFormat() {
        return addressInStringFormat;
    }

    public void setAddressInStringFormat(String addressInStringFormat) {
        this.addressInStringFormat = addressInStringFormat;
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        modifyDate.setTime(new Date(System.currentTimeMillis()));
    }

    public Calendar getCreateDate() {
        return createDate;
    }

    public Calendar getModifyDate() {
        return modifyDate;
    }
}
