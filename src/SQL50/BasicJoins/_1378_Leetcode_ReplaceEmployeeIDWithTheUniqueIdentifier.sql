
/**
 * _01_Leetcode75_MergeStringAlternately
 * <p>
 * Version 1.0
 * <p>
 * Date: 3/12/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/12/2025    VANQUOCBUI    Create
 */


select
    unique_id,name
from Employees left join EmployeeUNI on Employees.id = EmployeeUNI.id




-- select Employees.name, EmployeeUNI.unique_id  from EmployeeUNI  right join Employees on EmployeeUNI.id =  Employees.id