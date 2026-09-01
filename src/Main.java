import entities.Departamento;
import entities.HourContract;
import entities.Worker;
import enums.Workerlevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Qual o nome do departamento: ");
        String deparmentName=sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.println();
        System.out.print("Name: ");
        String workerName=sc.nextLine();
        System.out.print("Level: ");
        String workerlevel=sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary=sc.nextDouble();

        Worker worker=new Worker(workerName, Workerlevel.valueOf(workerlevel), baseSalary,new Departamento(deparmentName));

        System.out.print("How many contracts to this worker?: ");
        int n=sc.nextInt();

        for (int i=1; i<=n;i++){
            System.out.println("Enter contract #"+i+"data");
            System.out.print("Date (DD/MM/YYYY)");
            Date contractDate=sdf.parse(sc.next());

            System.out.print("Value per hour");
            Double valueperHour=sc.nextDouble();
            System.out.println("Duration(Hours): ");
            int hours=sc.nextInt();

            HourContract contract=new HourContract(contractDate, valueperHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income(MM/yyyy): ");
        String monthAndyear=sc.next();
        int month=Integer.parseInt(monthAndyear.substring(0,2));
        int year=Integer.parseInt(monthAndyear.substring(3));
        System.out.print("Name: "+worker.getName());
        System.out.print("Department: "+ worker.getDepartamento().getName());
        System.out.print("Income for "+monthAndyear+": "+ String.format("%.2f",worker.income(year,month)));


        sc.close();
    }
}