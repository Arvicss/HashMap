package employee;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class EmployeeDA {
    private final Employee employee;

    public EmployeeDA(String empNo) throws FileNotFoundException {
        Scanner employeeFile = new Scanner(new FileReader("data/emp.csv"));

        if (employeeFile.hasNextLine()) {
            employeeFile.nextLine();
        }

        employee = new Employee();

        while(employeeFile.hasNextLine()) {
            String empDataRaw = employeeFile.nextLine();
            String[] empDataArray = empDataRaw.split(",", 4);

            if (empNo.equals(empDataArray[0].trim())) {
                employee.setEmpNo(empDataArray[0].trim());
                employee.setLastName(empDataArray[1].trim());
                employee.setFirstName(empDataArray[2].trim());

                break;
            }
        }

        employeeFile.close();
    }

    public Employee getEmployee() {
        return employee;
    }

}