package strings;

public class Data1 {
    public static void main(String[] args) {

        DateInfo dateInfo = extractDateData("21/07/2010");
        System.out.println("Dia: " + dateInfo.day);
        System.out.println("Mês: " + dateInfo.month);
        System.out.println("Ano: " + dateInfo.year);
    }

    public static DateInfo extractDateData(String date){
        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6));
        return new DateInfo(day, month, year);
    }
}

 class DateInfo{
    int day;
    int month;
    int year;

    public DateInfo(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
