import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        int wagePerHour=20;
        int fullDayHour=8;
        int halfDayHour=4;
        int Wage= 0;
        int halfDayCount=0;
        int fullDayCount=0;
        int absent=0;

        Random rnd= new Random();

        System.out.println("Welcome to Employee wage program");

        for(int i=0;i<20;i++)
        {
            int a=rnd.nextInt(3);

            switch(a)
            {
                case 0: absent++	;
                    break;

                case 1: halfDayCount++	;
                    break;

                default: fullDayCount++	;
                    break;

            }
        }
        System.out.println("Total wage for 20 days ----"+(Wage=((fullDayCount*fullDayHour)+(halfDayCount*halfDayHour))*wagePerHour)+"\n absent : "+absent+"\n halfDay : "+halfDayCount+"\n fullDay : "+fullDayCount);

    }
}