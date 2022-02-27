package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter{
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        String ssss = driversLicense.getSoundexCode();
        int fff = driversLicense.getFirstNameMiddleInitial();
        int yy = driversLicense.getBirthYear();
        int ddd = driversLicense.getBirthMonthDayGender();
        int nn = driversLicense.getOverflow();
        return String.format("%s-%d-%d-%d-%d", ssss, fff, yy, ddd, nn);
    }
}
