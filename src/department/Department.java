package department;

import employee.Employee;
import java.util.HashMap;

public class Department {
    private String deptCode;
    private String deptName;
    private Double depTotalSalary;
    private HashMap<String, Employee> employeeMap;

    public Department(String deptCode, String deptName, Double depTotalSalary) {
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.depTotalSalary = depTotalSalary;
    }

    public Department() {
        depTotalSalary = 0.0;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Double getDepTotalSalary() {
        return depTotalSalary;
    }

    public void setDepTotalSalary(Double depTotalSalary) {
        this.depTotalSalary = depTotalSalary;
    }

    public HashMap<String, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(HashMap<String, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }
}
