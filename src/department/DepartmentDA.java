package department;

import employee.Employee;
import employee.EmployeeDA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class DepartmentDA {
    public DepartmentDA() throws FileNotFoundException {
        Scanner deptFile = new Scanner(new FileReader("data/dep.csv"));

        // Skips first line or header
        if (deptFile.hasNextLine()) {
            deptFile.nextLine();
        }

        while(deptFile.hasNextLine()) {
            String deptDataRaw = deptFile.nextLine();
            String[] deptDataArray = deptDataRaw.split(",", 3);

            Department department = new Department();
            department.setDeptCode(deptDataArray[0].trim());
            department.setDeptName(deptDataArray[1].trim());
            department.setEmployeeMap(readDepEmp(department));
            printDepartment(department);
        }

        deptFile.close();
    }

    public HashMap<String, Employee> readDepEmp(Department department) throws FileNotFoundException {
        HashMap<String, Employee> deptEmpMap = new HashMap<>();

        Scanner deptEmpFile = new Scanner(new FileReader("data/deptemp.csv"));

        // Skips first line or header
        if (deptEmpFile.hasNextLine()) {
            deptEmpFile.nextLine();
        }

        while(deptEmpFile.hasNextLine()) {
            String deptEmpRaw = deptEmpFile.nextLine();
            String[] deptEmpDataArray = deptEmpRaw.split(",", 3);

            if (!deptEmpDataArray[0].equals(department.getDeptCode())) continue;

            EmployeeDA employeeDA = new EmployeeDA(deptEmpDataArray[1].trim());
            Employee employee = employeeDA.getEmployee();
            employee.setSalary(Double.parseDouble(deptEmpDataArray[2].trim()));

            deptEmpMap.put(deptEmpDataArray[1].trim(), employee);
            department.setDepTotalSalary(department.getDepTotalSalary() + employee.getSalary());
        }

        return deptEmpMap;
    }

    private void printDepartment(Department department) {
        DecimalFormat decimalFormat = new DecimalFormat("##,###.00");

        System.out.println("Department code: " + department.getDeptCode());
        System.out.println("Department name: " + department.getDeptName());
        System.out.println("Department total salary: " + decimalFormat.format(department.getDepTotalSalary()));
        System.out.println("--------------------Details--------------------");
        System.out.printf("%-10s %-25s %-15s", "EmpNo", "Employee Name", "Salary");

        for(HashMap.Entry<String, Employee> entry : department.getEmployeeMap().entrySet()) {
            Employee employee = entry.getValue() ;
            String employeeName = employee.getLastName() + ", " + employee.getFirstName();
            String salary = decimalFormat.format(employee.getSalary());
            System.out.printf("\n%-10s %-25s %-15s", employee.getEmpNo(), employeeName, salary);
        }

        System.out.println("\n");
    }
}