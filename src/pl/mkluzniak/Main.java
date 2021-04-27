package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {

        String day = "Saturday"; //it is the input that you test
        switch (day){
            case "Sunday": System.out.println("It is Sunday"); //every case will test if it is match, day to case of day
                break;                                          //break is needed to not print case when there is no match
            case "Monday": System.out.println("It is Monday");
                break;
            case "Tuesday": System.out.println("It is Tuesday");
                break;
            case "Wednesday": System.out.println("It is Wednesday");
                break;
            case "Thursday": System.out.println("It is Thursday");
                break;
            case "Friday": System.out.println("It is Friday");
                break;
            case "Saturday": System.out.println("It is Saturday");
                break;

            default:System.out.println("That is not a day!"); //It is when the input data will not match cases
                break;
        }



    }
}
