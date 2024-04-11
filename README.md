# HashMap

## Instructions:

<div style="text-align: justify;">
You are required to present a department report that accesses csv files. You must put the data on the domain composition of the objects.

![Class Diagram of Domanin Objects](https://media.discordapp.net/attachments/1024219092611239936/1227955552529813504/image.png?ex=662a49ba&is=6617d4ba&hm=92d21dc87f808892cc0a8836d7c9416f55e1e20816ec6110feeb328c20d99154&=&format=webp&quality=lossless&width=522&height=186)

### dep.csv
```csv
deptCode, deptName, location
IT, Information Tech, 2nd floor
HR, Human Resource, 3rd floor
FNC, Finance, 4th floor
```

### The deptemp.csv is referenced to get the salary  of the employees per department:

```csv
deptCode, empNo, salary
IT, E123, 30000
IT, E124, 45000
IT, E125, 51000
HR, E251, 66000
HR, E252, 25000
FNC, E370, 42000
FNC, E371, 29000
FNC, E372, 37000
```

### To get the details of the employee you must access the emp.csv:

```csv
empNo, lastName, firstName, job
E123, Maxwell, John, Developer
E124, Delos Reyes, Ernesto, Analyst
E125, Ortiz, Manuel, Tester
E251, Natividad, Lisa, HR Manager
E252, Rosanto, Margareth, HR Specialist
E370, Baldo, Jason, Team Leader
E371, Hernandez, Timothy, Junior Accountant
E372, Cruz, Ricardo, CPA
```

### You need to create objects that will handle the retrieval of the csv files to convert it into objects.  These are EmployeeDA and EmployeeDA objects.  This will be the execution of the sequence:

![Sequence Diagram](https://media.discordapp.net/attachments/1024219092611239936/1227956618071900241/image.png?ex=662a4ab8&is=6617d5b8&hm=00c63785d40a6d85f286dc9b2dfe94146a8fc4c25312bc91a7b9a1e1536e159e&=&format=webp&quality=lossless&width=416&height=314)

### This will be the sample generated report:

```
Department code: IT
Department name: Information Tech
Department total salary: 126,000.00
---------------------Details -------------------------
EmpNo		 Employee Name	Salary
E123		Maxwell, John			30,000.00
E125		Ortiz, Manuel			51,000.00
E124		Delos Reyes, Ernesto		45,000.00

Department code: HR
Department name: Human Resource
Department total salary: 91,000.00
---------------------Details -------------------------
EmpNo		 Employee Name	Salary
E252		Rosanto, Margareth		25,000.00
E251		Natividad, Lisa		66,000.00

Department code: FNC
Department name: Finance
Department total salary: 108,000.00
---------------------Details -------------------------
EmpNo		 Employee Name	Salary
E370		Baldo, Jason			42,000.00
E371		Hernandez, Timothy		29,000.00
E372		Cruz, Ricardo			37,000.00
```



### Additional Instructions:
1. You are not allowed to alter the composition of the domain objects.  Stick to the design. Disregard the data in the csv if it is not necessary to the object.
2. Adhere to correct naming conventions in naming variables and objects.
3. Use hashmap as your solution to the problem.
4. Use the department.setDepTotalSalary() in putting the aggregated value into the object.  Do not just use the salary accumulation approach in the printing process to get the depTotalSalary.
5. Submit the Github solution link provided in NEUVLE.


# Output

![](https://media.discordapp.net/attachments/1024219092611239936/1227957811711836335/image.png?ex=662a4bd4&is=6617d6d4&hm=d94ddbfbc00c61e28ab4dbc2288ac751703c71c3941f2191289a4b7779555638&=&format=webp&quality=lossless&width=392&height=596)

</div>