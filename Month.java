//BS'D
/*
Write a class named Month. The class should have an int field named monthNumber that
holds the number of the month. For example, January would be 1, February would be 2,
and so forth. In addition, provide the following methods:
•	 A no-arg constructor that sets the monthNumber field to 1.
•	 A constructor that accepts the number of the month as an argument. It should set the
monthNumber field to the value passed as the argument. If a value less than 1 or greater
than 12 is passed, the constructor should set monthNumber to 1.
•	 A constructor that accepts the name of the month, such as “January” or “February” as
an argument. It should set the monthNumber field to the correct corresponding value.
•	 A setMonthNumber method that accepts an int argument, which is assigned to the
monthNumber field. If a value less than 1 or greater than 12 is passed, the method
should set monthNumber to 1.
•	 A getMonthNumber method that returns the value in the monthNumber field.
•	 A getMonthName method that returns the name of the month. For example, if the
monthNumber field contains 1, then this method should return “January”.
•	 A toString method that returns the same value as the getMonthName method.
•	 An equals method that accepts a Month object as an argument. If the argument object
holds the same data as the calling object, this method should return true. Otherwise,
it should return false.
•	 A greaterThan method that accepts a Month object as an argument. If the calling
object’s monthNumber field is greater than the argument’s monthNumber field, this
method should return true. Otherwise, it should return false.
•	 A lessThan method that accepts a Month object as an argument. If the calling object’s
monthNumber field is less than the argument’s monthNumber field, this method should
return true. Otherwise, it should return false.
 */
public class Month {
    private int monthNumber;
    private static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    public Month() {
        this(1);
    }
    public Month(int monthNumber) {
        this.setMonthNumber(monthNumber);
    }
    public Month(String month) {
        this.getMonthNumber(month);

    }
    public void setMonthNumber(int monthNumber) {
        if(monthNumber > 12 || monthNumber < 1)
            this.monthNumber = 1;
        else
            this.monthNumber = monthNumber;
    }
    public void getMonthNumber(String month) {
        for(int i = 0; i < months.length; i++) {
            if(months[i] == month)
                this.monthNumber = i+1;
        }
    }
    public int getMonthNumber() {
        return this.monthNumber;
    }
    public String getMonthName() {
        return this.months[this.monthNumber-1];
    }

    public String toString() {
        return this.getMonthNumber() + "; " + this.getMonthName();
    }

    public boolean equals(Month obj) {
        if(this.monthNumber == obj.getMonthNumber())
            return true;
        return false;
    }

    public boolean greaterThan(Month obj) {
        if(this.monthNumber > obj.getMonthNumber())
            return true;
        return false;
    }

    public boolean lessThan(Month obj) {
        if(this.monthNumber < obj.getMonthNumber())
            return true;
        return false;
    }
}
