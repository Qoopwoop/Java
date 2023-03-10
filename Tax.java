public class Tax {


    public static void main(String[] args) {
        double salary = 30;
        double lakhs = salary * 100000;
        double tax1 = lakhs * 5 / 100;
        double tax2 = lakhs * 10 / 100;
        double tax3 = lakhs * 15 / 100;
        double tax4 = lakhs * 20 / 100;
        double tax5 = lakhs * 25 / 100;
        double tax6 = lakhs * 30 / 100;


        if (salary <= 2.5) {
            System.out.println("you have a 0% of tax, so you got tax exemption ");
        } else if ((salary >= 2.5) && (salary <= 5)) {
            System.out.println("you have a 5% of tax, so your total amount of tax is = " + tax1);
        } else if ((salary >= 5) && (salary <= 7.5)) {
            System.out.println("you have a 10% of tax, so your total amount of tax is = " + (tax1 + tax2));
        } else if ((salary >= 7.5) && (salary <= 10)) {
            System.out.println("you have a 15% of tax, so your total amount of tax is = " + (tax1 + tax2 + tax3));
        } else if ((salary >= 10) && (salary <= 12.5)) {
            System.out.println("you have a 20% of tax, so your total amount of tax is = " + (tax1 + tax2 + tax3 + tax4));
        } else if ((salary >= 12.5) && (salary <= 15)) {
            System.out.println("you have a 25% of tax, so your total amount of tax is = " + (tax1 + tax2 + tax3 + tax4 + tax5));
        } else if (salary > 15) {
            System.out.println("you have a 30% of tax, so your total amount of tax is = " + (tax1 + tax2 + tax3 + tax4 + tax5 + tax6));
        }
    }
}