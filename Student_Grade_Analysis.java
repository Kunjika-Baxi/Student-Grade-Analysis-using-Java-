import java.util.Scanner;
public class Student_Grade_Analysis
{
    public static Scanner sc = new Scanner(System.in);
    public static int grade[]=new int[25];
    public static int grades[]=new int[25];
    public static int n,max,min,pass=0,fail=0;
    public static double sum=0,avg=0;
    public static void EnterGrade()
    {
        System.out.println("Enter Total Number of Students : ");
        n=sc.nextInt();
        if(n<=20 && n>0)
        {
            System.out.println("Enter Grades : ");
            for(int i=0;i<n;i++)
            {
                grade[i]=sc.nextInt();
                if(grade[i]>=0 && grade[i]<=100)
                {
                    grades[i]=grade[i];
                }
                else 
                {
                    System.out.println("Invalid Grade");grades[i]=0;
                }
            }
            max=grades[0];min=grades[0];
            System.out.println("Grades are Entered Successfully...\n");
        }
        
    }
    public static void Calculate()
    {
        for(int i=0;i<n;i++)
        {
            sum=sum+grades[i];
        }
        avg=sum/n;
        System.out.println("Class Average : "+avg+"\n");
    }
    public static void hlgrades()
    {
        for(int i=0;i<n;i++)
        {
            if(max<grades[i])
            {
                max=grades[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(min>grades[i])
            {
                min=grades[i];
            }
        }
        System.out.println("Highest Grades : "+max);
        System.out.println("Lowest Grades : "+min+"\n");
    }
    public static void passfails()
    {
        System.out.println("Passing Grades : 35");
        for(int i=0;i<n;i++)
        {
            if(grades[i]>=35)
            {
                pass++;
            }
            else 
            {
                fail++;
            }
        }
        System.out.println("Total Students : "+n);
        System.out.println("Total Pass Students : "+pass);
        System.out.println("Total Fail Students : "+fail+"\n");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);int choice;
        System.out.println("-------Student Grade Analysis-------");
        while(true)
        {
        System.out.println("Enter:\n1. Enter Student Grades\n2. Calculate Class Average\n3. Find Highest and Lowest Grades\n4. Count Passed and Failed Students\n5. Exit");
        System.out.println("Enter Your Choice : ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1 : EnterGrade();break;
            case 2 : Calculate();break;
            case 3 : hlgrades();break;
            case 4 : passfails();break;
            case 5 : System.exit(0);break;
            default: System.out.println("Invalid Choice");
        }
        }
    }
}