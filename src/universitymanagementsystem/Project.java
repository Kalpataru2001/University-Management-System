
package universitymanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    
    Project(){
        setSize(1920,1080);
        
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/icons/third.jpg"));
        Image i2=i1.getImage().getScaledInstance(1920,980,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       add(image);
       
       JMenuBar mb=new JMenuBar();
       JMenu newInformation=new JMenu("New Information");
       newInformation.setForeground(Color.BLUE);
       mb.add(newInformation);
       
       JMenuItem facultyInfo=new JMenuItem("New Faculty Information");
       facultyInfo.setBackground(Color.WHITE);
       facultyInfo.addActionListener(this);
       newInformation.add(facultyInfo);
       
       JMenuItem studentInfo=new JMenuItem("New Student Information");
       studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
       newInformation.add(studentInfo);
       
      //DETAILS
       JMenu details=new JMenu("View Details");
       details.setForeground(Color.RED);
       mb.add(details);
       
       JMenuItem facultydetails=new JMenuItem("View Faculty Details");
       facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
      details.add(facultydetails);
       
       JMenuItem studentdetails=new JMenuItem("View Student Details");
       studentdetails.setBackground(Color.WHITE);
       studentdetails.addActionListener(this);
      details.add(studentdetails);
      //LEAVE
      JMenu leave=new JMenu("Apply Leave");
      leave.setForeground(Color.BLUE);
       mb.add(leave);
       
       JMenuItem facultyleave=new JMenuItem("Faculty Leave");
       facultyleave.setBackground(Color.WHITE);
       facultyleave.addActionListener(this);
      leave.add(facultyleave);
       
       JMenuItem studentleave=new JMenuItem("Student Leave");
       studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
      leave.add(studentleave);
       
      //LEAVE DETAILS
       JMenu leavedetails=new JMenu("Leave Details");
      leavedetails.setForeground(Color.RED);
       mb.add(leavedetails);
       
       JMenuItem facultyleavedetails=new JMenuItem("Faculty Leave Details");
      facultyleavedetails.setBackground(Color.WHITE);
      facultyleavedetails.addActionListener(this);
      leavedetails.add(facultyleavedetails);
       
       JMenuItem studentleavedetails=new JMenuItem("Student Leave Details");
       studentleavedetails.setBackground(Color.WHITE);
       studentleavedetails.addActionListener(this);
      leavedetails.add(studentleavedetails);
      
      //EXAMINATION
       JMenu examination=new JMenu("Examination");
      examination.setForeground(Color.BLUE);
       mb.add(examination);
       
       JMenuItem examinationdetails=new JMenuItem("Examination Results");
      examinationdetails.setBackground(Color.WHITE); 
       examinationdetails.addActionListener(this);
     examination.add( examinationdetails);
       
       JMenuItem entermarks=new JMenuItem("Enetr Marks");
       entermarks.setBackground(Color.WHITE);
         entermarks.addActionListener(this);
       examination.add(entermarks);
       
       //UPDATE INFO
        JMenu updateinfo=new JMenu("Update Details");
      updateinfo.setForeground(Color.RED);
       mb.add(updateinfo);
       
       JMenuItem updatefacultyInfo=new JMenuItem("Update Faculty Info");
      updatefacultyInfo.setBackground(Color.WHITE);
      updatefacultyInfo.addActionListener(this);
     updateinfo.add(updatefacultyInfo);
       
       JMenuItem updateStudentinfo=new JMenuItem("Update Student Details");
       updateStudentinfo.setBackground(Color.WHITE);
       updateStudentinfo.addActionListener(this);
      updateinfo.add(updateStudentinfo);
      
      //FEE details
       JMenu fee=new JMenu("Fees Details");
     fee.setForeground(Color.BLUE);
       mb.add(fee);
       
       JMenuItem feeStructures=new JMenuItem("Fee Structures");
      feeStructures.setBackground(Color.WHITE);
       feeStructures.addActionListener(this);
     fee.add(feeStructures);
       
       JMenuItem feeform=new JMenuItem("Student Fee form");
        feeform.setBackground(Color.WHITE);
         feeform.addActionListener(this);
     fee.add( feeform);
     
     //UTILITY
        JMenu utility=new JMenu("Utility");
     utility.setForeground(Color.RED);
       mb.add(utility);
       
       JMenuItem notepad=new JMenuItem("Notepad");
      notepad.setBackground(Color.WHITE);
      notepad.addActionListener(this); 
     utility.add(notepad);
       
       JMenuItem calculator=new JMenuItem("Calculator");
       calculator.setBackground(Color.WHITE);
       calculator.addActionListener(this); 
      utility.add(calculator);
      
      //About
         JMenu about=new JMenu("About");
     about.setForeground(Color.BLUE);
       mb.add(about);
       
       JMenuItem ab=new JMenuItem("About");
      ab.setBackground(Color.WHITE);
      ab.addActionListener(this); 
     about.add(ab);
       
      
      //exit
        JMenu ex=new JMenu("Exit");
     ex.setForeground(Color.RED);
       mb.add(ex);
       
       JMenuItem exit=new JMenuItem("Exit");
      exit.setBackground(Color.WHITE);
      exit.addActionListener(this); 
     ex.add(exit);
       
     
       
       setJMenuBar(mb);
        
        setVisible(true);
        
          
       public void actionPerformed(ActionEvent ae){
           String msg=ae.getActionCommand();
           if(msg.equals("Exit")){
               setVisible(false);
           }
           else if(msg.equals("Calculator")){
               try{
                   Runtime.getRuntime().exec("calc.exe");
               }catch(Exception e){
                   
               }
           }
            else if(msg.equals("Notepad")){
               try{
                   Runtime.getRuntime().exec("notepad.exe");
               }catch(Exception e){
                   
               }
               
           }
           else if(msg.equals("New Faculty Information")){
                       new AddTeacher();
                       }
               else if(msg.equals("New Student Information")){
                       new AddStudent();
                       }
            else if(msg.equals("View Faculty Details")){
                       new TeacherDetails();
                       }
             else if(msg.equals("View Student Details")){
                       new StudentDetails();
                       }
            else if(msg.equals("Faculty Leave")){
                       new TeacherLeave();
                       }
            else if(msg.equals("Student Leave")){
                       new StudentLeave();
                       }
               else if(msg.equals("Faculty Leave Details")){
                       new TeacherLeaveDetails();
                       }
            else if(msg.equals("Student Leave Details")){
                       new StudentLeaveDetails();
                       }
           
             else if(msg.equals("Update Faculty Info")){
                       new UpdateTeacher();
                       }
            else if(msg.equals("Update Student Details")){
                       new UpdateStudent();
                       }
             else if(msg.equals("Enetr Marks")){
                       new EnterMarks();
                       }
           
             else if(msg.equals("Examination Results")){
                       new ExaminationDetails();
                       }
              else if(msg.equals("Fee Structures")){
                       new FeeStructure();
                       }
            else if(msg.equals("About")){
                       new About();
                       }
               else if(msg.equals("Student Fee form")){
                       new StudentFeeForm();
                       }
       }
      
        public static void main(String []args){
        new Project();
    }
    
        
}
}
    


