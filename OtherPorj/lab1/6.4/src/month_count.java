import java.util.Scanner;

public class month_count {
    public static boolean LeapYear(int year) {
        if (year%4==0) {
            if (year%100==0) {
                return year%400==0;
            }
            return true;
        }
        return false;
    }
    public static int count(String month, int year) {
        boolean leapYear = LeapYear(year);
        month = month.trim().toLowerCase();
        switch (month) {
            case "1": case "january": case "jan.": case "jan":
                return 31;
            case "2": case "february": case "feb.": case "feb":
                return leapYear ? 29 : 28;
            case "3": case "march": case "mar.": case "mar":
                return 31;
            case "4": case "april": case "apr.": case "apr":
                return 30;
            case "5": case "may":
                return 31;
            case "6": case "june": case "jun":
                return 30;
            case "7": case "july": case "jul":
                return 31;
            case "8": case "august": case "aug.": case "aug":
                return 31;
            case "9": case "september": case "sept.": case "sep":
                return 30;
            case "10": case "october": case "oct.": case "oct":
                return 31;
            case "11": case "november": case "nov.": case "nov":
                return 30;
            case "12": case "december": case "dec.": case "dec":
                return 31;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter month: ");
        String month = scanner.nextLine().trim();
        System.out.print("Enter year: ");
        if (scanner.hasNextInt()) {
            int year=scanner.nextInt();
            if (year<0) {
                System.out.println("Invalid year");
                return;  
            }
            int num_days=count(month, year);
            if (num_days==-1) {
                System.out.println("Invalid month");
            } else {
                System.out.println("Number of days: " + num_days);
            }
        } else {
            System.out.println("Invalid input.");
        }
        scanner.close();
    }
}
