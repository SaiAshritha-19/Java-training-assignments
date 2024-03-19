package org.example.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeRecordsManager {
    public EmployeeRecordsManager() {
    }

    public static Set<String> extractEmployeeIds(List<Employee> employees) {
        Set<String> employeeIds = new HashSet();
        Iterator var2 = employees.iterator();

        while(var2.hasNext()) {
            Employee employee = (Employee)var2.next();
            employeeIds.add(employee.getId());
        }

        return employeeIds;
    }

    public static List<String> removeDuplicateAndSort(Set<String> employeeIds) {
        List<String> sortedEmployeeIds = new ArrayList(employeeIds);
        Collections.sort(sortedEmployeeIds, Collections.reverseOrder());
        return sortedEmployeeIds;
    }

    public static Map<String, Employee> mapEmployeeInfo(List<Employee> employees) {
        Map<String, Employee> employeeInfoMap = new HashMap();
        Iterator var2 = employees.iterator();

        while(var2.hasNext()) {
            Employee employee = (Employee)var2.next();
            employeeInfoMap.put(employee.getId(), employee);
        }

        return employeeInfoMap;
    }
}

