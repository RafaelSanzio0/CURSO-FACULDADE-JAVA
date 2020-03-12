package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel workerLevel;
    private double salary;

    private Department department;
    private HourContract contractDate;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel workerLevel, double salary, Department department) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int month, int year){
        double baseSalary = getSalary();
        Calendar cal = Calendar.getInstance();
        for (HourContract contract: contracts) {
            cal.setTime(contract.getDate()); //adiciono a data de cada contrato
            int c_month = 1 + cal.get(Calendar.MONTH);
            int c_year = cal.get(Calendar.YEAR);
            if(c_month == month && c_year == year){
                baseSalary += contract.totalValue();
            }
        }
        return baseSalary;
    }

//    public String toString(){
//        StringBuilder stringBuilder =  new StringBuilder();
//        stringBuilder.append("Nome: "+getName()+"\n");
//        stringBuilder.append("Department: "+department.getName()+"\n");
//
//        return  stringBuilder.toString();
//    }

}
