package model.shared;

import java.util.Date;

public abstract class Converter {

    public static Date convertStrToDate(String strDate) {
        String[] arrDate = strDate.split("/");
        int year = Integer.parseInt(arrDate[0]);
        int month = Integer.parseInt(arrDate[1]);
        int day = Integer.parseInt(arrDate[2]);
        return new Date(year, month, day);
    }

}
