/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 342354727
 */
//public class resultPage extends javax.swing.JFrame {

//importing required packages
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class resultPage extends javax.swing.JFrame {
    
    /**
     * Creates new form resultPage
     */
    
//    public static ArrayList<User> makeClass(){
//        ArrayList<User> classroom = new ArrayList<>(); // ArrayList of Strings
//        return classroom;
//    }
    
    public resultPage() {
        initComponents();

        //private ArrayList<User> school;
        //displaying current user's score
        resultLabel.setText("You scored "+(studentPage.student).getResult()+"/10");
        
 
        try{
            //adding the current student to the school record
            FileWriter writer = new FileWriter("school.txt",true);
            writer.write("\nstudent;"+studentPage.student.getName()+";"+studentPage.student.getAge()+";"+studentPage.student.getExperience()+";"+studentPage.student.getResult()+";"+studentPage.student.getID()+";"+studentPage.student.getClassCode());
            writer.close();
            
            //making an array of everyone in the school;
            ArrayList<User> school = new ArrayList<>();
            Scanner reader = new Scanner(new File("school.txt"));
            
            //eating the first line of description
            reader.nextLine();
            
            while (reader.hasNextLine()){
                String x = reader.nextLine();
                String data[]= x.split(";");
                
                //if teacher, create instance of the teacher class and add to the polymorphic array
                if(data[0].equals("teacher")){
                    //parsing age and ID into integers
                    int age = Integer.parseInt(data[2]);
                    int ID = Integer.parseInt(data[5]);
                    
                    //instantiating a teacher with the given details
                    Teacher teacher = new Teacher(data[1],age,data[3],ID,data[6]);
                    //adding the teacher to the school array
                    school.add(teacher);
                
                //if student, create instance of rhe stduent class and add to the polymorphic array
                } else if(data[0].equals("student")){
                    //parsing age, id, and result into integers
                    int age = Integer.parseInt(data[2]);
                    int result = Integer.parseInt(data[4]);
                    int ID = Integer.parseInt(data[5]);
                    
                    //instantiating a student with the given details 
                    Student student = new Student(data[1],age,data[3],result,ID,data[6]);
                    //adding the student to the school array
                    school.add(student);
                    
                }
                
            }
            //closing the scanner
            reader.close();
            
            //getting all of the students in the user's class and giving a leaderboard of the class
            String code = studentPage.student.getClassCode();
            //Teacher teacher;
            String leaderBoard = "<html>";
            Teacher teacher = null;
            ArrayList<Student> students = new ArrayList<>();
            
            for(int i=0;i<school.size();i++){
                //for the class code:
                if ((school.get(i).getClassCode()).equals(code)){
                   //find the teacher 
                    if(school.get(i) instanceof Teacher){
                        teacher = (Teacher) school.get(i);
                    } else{
                        students.add((Student) school.get(i));
                    }
                }
            }
           teacherLabel.setText("You're in "+teacher.getName()+"'s class. Here is how you rank:");
           
           //sorting the scores
           // Outer loop: pass through the score array
            for (int i = 0; i < students.size(); i++) {
                 // Inner loop: compare adjacent elements
                for (int j = 0; j <  students.size() - i-1; j++) {
                     // if current element greater, swap
                    if (students.get(j).getResult() > students.get(j+1).getResult()) {
                        // swap spots numbers
                        Student temp = students.get(j);
                        students.set(j,students.get(j+1));
                        students.set(j+1, temp);
                    }
                }
            }//printing out new scoreboard, using html to allow text wrapping
         
        for (int i=students.size() - 1;i>-1;i--){
            Student student = students.get(i);
            String name = student.getName();
            int result = student.getResult();
            leaderBoard+=name+": "+result+"/10 <br>";
        }
        leaderBoard+="</html>";
        leaderboard.setText(leaderBoard);
            
        } catch(IOException e){
            System.out.println("Error"+e);
        }
        
        //displaying the user's score in comparison to their classmates
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        leaderboard = new javax.swing.JLabel();
        teacherLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        jLabel1.setText("--------------------- Results ---------------------");

        resultLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        resultLabel.setText(" ");

        leaderboard.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        leaderboard.setText("hello");

        teacherLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        teacherLabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(leaderboard, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(78, 78, 78))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(116, 116, 116))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(198, 198, 198)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultLabel)
                .addGap(59, 59, 59)
                .addComponent(teacherLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leaderboard, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(resultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel leaderboard;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel teacherLabel;
    // End of variables declaration//GEN-END:variables
}
