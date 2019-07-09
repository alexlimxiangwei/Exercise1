package sg.edu.rp.c346.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomEmpAdapter extends ArrayAdapter {

    Context context;
    int resource;
    ArrayList<Employee> objects;

    public CustomEmpAdapter(Context context, int resource, ArrayList<Employee> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(resource, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.tvEmpName);
        TextView tvOthers = rowView.findViewById(R.id.tvEmpOthers);

        // Obtain the Android Version information based on the position
        Employee emp = objects.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(emp.getName());
        tvOthers.setText(emp.getRole() + "\n$" + emp.getPay());

        return rowView;
    }

}
