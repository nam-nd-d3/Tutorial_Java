package com.basic;

public class EnumTest {
//    enum Color
//    {
//        RED, GREEN, COLOR;
//    }

    enum Day
    {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }

    Day day;

    // Constructor
    public EnumTest(Day day)
    {
        this.day = day;
    }

    // Prints a line about Day using switch
    public void dayIsLike()
    {
        switch (day)
        {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
//        Color c1 = Color.RED;
//        System.out.print(c1);

//        String str = "MONDAY";
//        EnumTest eT1 = new EnumTest(Day.valueOf(str));
//        eT1.dayIsLike();

//        // The values returns all values represent inside enum Color
//        Color arr[] = Color.values();
//
//        // enum with loop
//        for (Color col: arr)
//        {
//            // Call ordinal() to find index of color
//            System.out.println(col + " at index "
//            + col.ordinal());
//        }
//
//        // Using valueof() to return an object of color with given constant.
//        // Uncommenting second line causes exception
//        // IllegalArgumentException
//        try
//        {
//            System.out.println(Color.valueOf("RED"));
//            System.out.println(Color.valueOf("RE"));
//        }
//        catch (IllegalArgumentException ex)
//        {
//            System.out.println(ex.getMessage());
//        }

        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}

enum Color
{
    RED, GREEN, BLUE;

    // enum constructor called separately for each
    // constant
    private Color()
    {
        System.out.println("Constructor called for : " +
                this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}
