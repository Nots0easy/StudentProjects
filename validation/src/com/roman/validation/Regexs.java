package com.roman.validation;

/**
 * Created by Roman_Boiko1 on 4/20/2017.
 */
public interface Regexs {
    String NAME = "[А-ЯA-Z]{1}[a-zа-я]{0,19}";
    String NICK_NAME = "[\\w+а-яА-Я-.]{3,19}";
    String PHONE = "^[+]{1}380[\\d]{9}$";
    String EMAIL = "^[а-яА-Я\\w.-]*[а-яА-Яa-zA-Z]+[а-яА-Я\\w.-]*@[а-яА-Я\\w]{2,5}(\\.[а-яА-Я\\w]+)+$[а-яА-Я\\w]*";
    String COMMENT = "[\\w\\d+а-яА-Я-.]{0,100}";
}
