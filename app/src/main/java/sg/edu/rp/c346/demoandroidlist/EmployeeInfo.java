package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EmployeeInfo extends AppCompatActivity {

    ListView lvEmp;
    ArrayList<Employee> alEmp;
    CustomEmpAdapter aaEmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_info);

        lvEmp = findViewById(R.id.lvEmployee);
        alEmp = new ArrayList<>();
        alEmp.add(new Employee("John","Boi",3400.0));
        alEmp.add(new Employee("Mary","Secretary", 99.99));
        aaEmp = new CustomEmpAdapter(EmployeeInfo.this,R.layout.empoyee_row,alEmp);
        lvEmp.setAdapter(aaEmp);
    }
}
