package university.management.system;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeacherAttendanceDetail extends JFrame implements ActionListener {
	JTable j1;
    JButton b1;
    String h[]={"Employee id","Date Time","First Half","Second Half"};
    int i=0,j=0;
    int s;
    
    TeacherAttendanceDetail()
    {
        super("View Teachers Attendance");
        setSize(800,300);
        setLocation(450,150);
        
        try {                               /* counting number of rows in table so that we will show that much of record only*/
        	conn c2=new conn();
        	String q1="SELECT COUNT(*) FROM attendance_teacher";
        	ResultSet rs2=c2.s.executeQuery(q1);
        	rs2.next();
        	 s=rs2.getInt(1);            // assigning row_count to a variable s
        } 
        catch(Exception e1)
        {
        	
        }
		String d[][]=new String[s][4]; 
		try{
            String q="select * from attendance_teacher";
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("emp_id");
                d[i][j++]=rs.getString("Date");
                d[i][j++]=rs.getString("first");
                d[i][j++]=rs.getString("second");
                i++;
                j=0;
            }
        
            j1=new JTable(d,h);

        }catch(Exception e){}
		
		b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
        
    }

	@Override
	public void actionPerformed(ActionEvent ae) {
		try{
            j1.print();
        }catch(Exception e){}
		
	}
    
}
