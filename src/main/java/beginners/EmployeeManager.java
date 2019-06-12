package beginners;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManager {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/employeeManager.txt"));
			String line;
			while((line = bufferedReader.readLine())!=null){
				String words[] = line.split(",");
				Employee employee = new Employee();
				employee.setEmployeeId(Integer.parseInt(words[0]));
				employee.setName(words[1]);
				employee.setManagerId(Integer.parseInt(words[2]));
			//	HashMap<String, Integer> employeeMap = new HashMap<String, Integer>();
			//	employeeMap.put(employee.getName(), employee.getManagerId());
				employees.add(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*Map<String,ArrayList<String>> hmap = new HashMap<String,ArrayList<String>>();
		for(int i=0;i<employees.size();i++){
			int c=0;
			int empId=employees.get(i).getEmployeeId();
			ArrayList<String> list = new ArrayList<String>();
			for(int k=0;k<employees.size();k++){
				if(empId == employees.get(k).getManagerId()){
					c++;
					list.add(employees.get(k).getName());
					hmap.put(employees.get(i).getName(), list);
				}
			}
				if(c==0)
				hmap.put(employees.get(i).getName(), new ArrayList<String>());
		}
		System.out.println(hmap);*/
		getManagerHierarchy(employees);
	}
	
	public static void getManagerHierarchy(List<Employee> employees){
		HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();
		for (Employee employee : employees) {
			ArrayList<String> junior = new ArrayList<String>();
			for (Employee employee1 : employees) {
				if(employee.getEmployeeId() == employee1.getManagerId()){
					junior.add(employee1.getName());
				}
			}
			hashMap.put(employee.getName(), junior);
		}
		System.out.println(hashMap);
	}
}
