package com.roman.validation.controller;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Roman_Boiko1 on 4/19/2017.
 */
public class Record {
    private String _firstName;
    private String _secondName;
    private String _lastName = null;
    private String _nickName = null;
    private String _comment = null;
    private HashSet<Group> _groups = new HashSet<Group>();
    private String _mobilePhoneNumber = null;
    private String _homePhoneNumber = null;
    private String _SecondMobilePhoneNumber = null;
    private String _skypeAccount = null;
    private Address _address = null;
    private String _addressInStringFormat = null;
    private String _email = null;

    public Record(String firstName, String secondName) {
        set_firstName(firstName);
        set_secondName(secondName);
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_secondName() {
        return _secondName;
    }

    public void set_secondName(String _secondName) {
        this._secondName = _secondName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public String get_nickName() {
        return _nickName;
    }

    public void set_nickName(String _nickName) {
        this._nickName = _nickName;
    }

    public String get_comment() {
        return _comment;
    }

    public void set_comment(String _comment) {
        this._comment = _comment;
    }

    public HashSet<Group> get_groups() {
        return _groups;
    }

    public void set_groups(HashSet<Group> _groups) {
        this._groups = _groups;
    }

    public String get_mobilePhoneNumber() {
        return _mobilePhoneNumber;
    }

    public void set_mobilePhoneNumber(String _mobilePhoneNumber) {
        this._mobilePhoneNumber = _mobilePhoneNumber;
    }

    public String get_homePhoneNumber() {
        return _homePhoneNumber;
    }

    public void set_homePhoneNumber(String _homePhoneNumber) {
        this._homePhoneNumber = _homePhoneNumber;
    }

    public String get_SecondMobilePhoneNumber() {
        return _SecondMobilePhoneNumber;
    }

    public void set_SecondMobilePhoneNumber(String _SecondMobilePhoneNumber) {
        this._SecondMobilePhoneNumber = _SecondMobilePhoneNumber;
    }

    public String get_skypeAccount() {
        return _skypeAccount;
    }

    public void set_skypeAccount(String _skypeAccount) {
        this._skypeAccount = _skypeAccount;
    }

    public Address get_address() {
        return _address;
    }

    public void set_address(Address _address) {
        this._address = _address;
    }

    public String get_addressInStringFormat() {
        return _addressInStringFormat;
    }

    public void set_addressInStringFormat(String _addressInStringFormat) {
        this._addressInStringFormat = _addressInStringFormat;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }
}
