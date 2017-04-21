package com.roman.validation.controller;

import com.roman.validation.Regexs;
import com.roman.validation.view.*;

import java.util.Scanner;

/**
 * Created by Roman_Boiko1 on 4/19/2017.
 */
public class InputNotebookRecord {
    private View view;
    private Scanner scanner;

    public InputNotebookRecord(View view, Scanner sc) {
        this.view = view;
        this.scanner = sc;
    }

    public Record inputRecord(){
        InputValue inputValue = new InputValue(scanner, view);
        String firstName = inputValue.inputValueWithScanner(Regexs.NAME, Messages.INPUT_FIRST_NAME);
        String secondName = inputValue.inputValueWithScanner(Regexs.NAME, Messages.INPUT_SECOND_NAME);
        Record record = new Record(firstName, secondName);
        record.setLastName(inputValue.inputValueWithScanner(Regexs.NAME, Messages.INPUT_LAST_NAME));
        record.setNickName(inputValue.inputValueWithScanner(Regexs.NICK_NAME, Messages.INPUT_NICK_NAME));
        record.setComment(inputValue.inputValueWithScanner(Regexs.COMMENT, Messages.INPUT_COMMENT));

        record.setGroups(inputValue.inputGroupsWithScanner(Regexs.GROUP, Messages.INPUT_GROUPS));

        record.setEmail(inputValue.inputValueWithScanner(Regexs.EMAIL, Messages.INPUT_EMAIl));
        record.setSkypeAccount(inputValue.inputValueWithScanner(Regexs.SKYPE, Messages.INPUT_SKYPE));
        record.setHomePhoneNumber(inputValue.inputValueWithScanner(Regexs.PHONE, Messages.INPUT_HOME_PHONE));
        record.setCellPhoneNumber(inputValue.inputValueWithScanner(Regexs.PHONE, Messages.INPUT_CELL_PHONE));
        record.setSecondCellPhoneNumber(inputValue.inputValueWithScanner(Regexs.PHONE, Messages.INPUT_SECOND_CELL_PHONE));

        Address address = new Address();
        address.setIndex(inputValue.inputValueWithScanner(Regexs.INDEX, Messages.INPUT_INDEX));
        address.setCity(inputValue.inputValueWithScanner(Regexs.STREET_OR_CITY, Messages.INPUT_CITY));
        address.setStreet(inputValue.inputValueWithScanner(Regexs.STREET_OR_CITY, Messages.INPUT_STREET));
        address.setHouseNumber(inputValue.inputValueWithScanner(Regexs.HOUSE_NUMBER, Messages.INPUT_HOUSE_NUMBER));
        address.setApartment(inputValue.inputValueWithScanner(Regexs.APARTMENT, Messages.INPUT_APARTMENT));
        record.setAddress(address);

        return record;
    }


}
