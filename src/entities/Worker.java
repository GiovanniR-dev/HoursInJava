package entities;

import enums.Workerlevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private Workerlevel level;
    private Double baseSalary;

    private Departamento departamento;
    private List<HourContract> contracts= new ArrayList<>();

    public Worker(){

    }

    public Worker(String name, Workerlevel level, Double baseSalary, Departamento departamento){
        this.name=name;
        this.baseSalary=baseSalary;
        this.level=level;
        this.departamento=departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Workerlevel getLevel() {
        return level;
    }

    public void setLevel(Workerlevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }


    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        double sum=baseSalary;
        Calendar cal= Calendar.getInstance();
        for (HourContract c: contracts){
            cal.setTime(c.getDate());
            int c_year=cal.get(Calendar.YEAR);
            int c_month=1+cal.get(Calendar.MONTH);
            if (year== c_year && month == c_month){
                sum+=c.totalValue();
            }
        }
        return sum;
    }
}
