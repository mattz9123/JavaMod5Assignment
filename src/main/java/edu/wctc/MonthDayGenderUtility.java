package edu.wctc;

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender (int year, int month, int day, char genderCode) throws UnknownGenderCodeException, InvalidBirthdayException {
        if (genderCode != 'M' && genderCode != 'F') {
            throw new UnknownGenderCodeException(genderCode);
        }
        if (year < 1900 || year > 2006){
            throw new InvalidBirthdayException(year, month, day);
        }
        if (month > 12 || month < 1){
            throw new InvalidBirthdayException(year, month, day);
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30 || day < 1) {
                throw new InvalidBirthdayException(year, month, day);
            }
        } else if (month == 2) {
            if (day > 28 || day < 1) {
                throw new InvalidBirthdayException(year, month, day);
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day > 31 || day < 1) {
                throw new InvalidBirthdayException(year, month, day);
            }
        }
        if (genderCode == 'M')
        {
        return (month - 1) * 40 + day + MOD_MALE;
        }
        else {
            return (month - 1) * 40 + day + MOD_FEMALE;
        }
    }
}
