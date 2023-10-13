import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        int totalWorkingHour=0;
       int totalWorkingDays=0;
       final int wagePerHour=20;
       final int fullDayHour=8;
       final int halfDayHour=4;
        int Wage= 0;
        int halfDayCount=0;
        int fullDayCount=0;
        int absent=0;


        Random rnd= new Random();

        System.out.println("Welcome to Employee wage program");

        while (totalWorkingDays!=20&&totalWorkingHour<=100)
        {

          totalWorkingDays++;
            int a=rnd.nextInt(3);
            switch(a)
            {
                case 0: absent++	;
                    break;

                case 1: halfDayCount++	;
                    totalWorkingHour=totalWorkingHour+halfDayHour;
                    break;

                default: fullDayCount++	;
                    totalWorkingHour=totalWorkingHour+fullDayHour;

                    break;
            }
        }
        System.out.println("Total wage for 20 days ----"+(Wage=((fullDayCount*fullDayHour)+(halfDayCount*halfDayHour))*wagePerHour)+"\n absent : "+absent+"\n halfDay : "+halfDayCount+"\n fullDay : "+fullDayCount);
        System.out.println("total hours in 20 days ----"+(totalWorkingHour));

    }



    }
