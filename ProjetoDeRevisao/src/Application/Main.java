package Application;
//
//Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
//        do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo
//        (próxima página)

import Entities.Department;
import Entities.HourContract;
import Entities.Worker;
import Entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;

        System.out.print("Enter department's name: ");
        String departmentName = sc.next();

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        sc.nextLine();
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(sc.next());
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Worker worker = new Worker(workerName,workerLevel,salary,new Department(departmentName));

        System.out.println("How many contracts to this worker?: ");
        int manyContratcs = sc.nextInt();

        for (int i = 1; i <= manyContratcs ; i++) {
            System.out.println("Enter contract #"+i+" data:");

            System.out.print("Date (DD/MM/YYYY): ");
            try{
                date = sdf.parse(sc.next());
            }catch(ParseException e){
                e.getMessage();
            }
            System.out.print("Value pear hour: ");
            double valueHour = sc.nextDouble();
            System.out.print("Hour: ");
            int hour = sc.nextInt();
            HourContract hourContract = new HourContract(date,valueHour,hour);
            System.out.print("subTotal: "+ hourContract.totalValue());
            worker.addContract(hourContract);
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String dateContract = sc.next();
        int month = Integer.parseInt(dateContract.substring(0,2));
        int year = Integer.parseInt(dateContract.substring(3));

        System.out.println("Name: "+worker.getName());
        System.out.println("Department: "+worker.getDepartment());
        System.out.println("Income for"+dateContract+": "+worker.income(month,year));

    }
}
