/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;//imported manualy
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;//imported manualy
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class WANT_TO_HELP extends javax.swing.JFrame {
    
    //////////variables
    String name,post,gender;
    String off_time="";
    String gap="";
    JFileChooser jfc;
    File director;
    DefaultTableModel model;//table info shoing work
    File file=null;
    
    /**
     * Creates new form JFrame1st
     */
    public WANT_TO_HELP() {
        initComponents();
        model = new DefaultTableModel();
        TABLE.setModel(model);
        model.addColumn("Name");
        model.addColumn("Post");
        model.addColumn("Gender");
        model.addColumn("Off time");
        
        
    }

    /**
     * 
     *  
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        ACTUAL_Batton_GROUP1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        FOR_GIVING_NAME = new javax.swing.JTextField();
        FOR_SELECTING_MALE = new javax.swing.JRadioButton();
        FOR_SELECTING_FEMALE = new javax.swing.JRadioButton();
        jPanel3_TABLE_INFO = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1_SAVE = new javax.swing.JButton();
        FOR_CLEARING = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();
        EXIT = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        FOR_SELECTING_POST = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PENEL_FOR_OFF_TIME = new javax.swing.JPanel();
        jCheckBox1_SSC = new javax.swing.JCheckBox();
        jCheckBox2_HSC = new javax.swing.JCheckBox();
        jCheckBox3_BSC = new javax.swing.JCheckBox();
        jCheckBox4_MSC = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Students Information");

        ACTUAL_Batton_GROUP1.add(FOR_SELECTING_MALE);
        FOR_SELECTING_MALE.setText("Male");
        FOR_SELECTING_MALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOR_SELECTING_MALEActionPerformed(evt);
            }
        });

        ACTUAL_Batton_GROUP1.add(FOR_SELECTING_FEMALE);
        FOR_SELECTING_FEMALE.setText("Female");
        FOR_SELECTING_FEMALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOR_SELECTING_FEMALEActionPerformed(evt);
            }
        });

        jButton1_SAVE.setText(" Save");
        jButton1_SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SAVEActionPerformed(evt);
            }
        });

        FOR_CLEARING.setText("Clear");
        FOR_CLEARING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOR_CLEARINGActionPerformed(evt);
            }
        });

        BACK.setText("Back");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Post", "Gender", "Off Time"
            }
        ));
        jScrollPane1.setViewportView(TABLE);

        EXIT.setText("Exit");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel5.setText("NOTE: save as \"want to help\"");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(FOR_CLEARING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BACK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1_SAVE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FOR_CLEARING)
                            .addComponent(EXIT)
                            .addComponent(BACK)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1_SAVE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel3_TABLE_INFOLayout = new javax.swing.GroupLayout(jPanel3_TABLE_INFO);
        jPanel3_TABLE_INFO.setLayout(jPanel3_TABLE_INFOLayout);
        jPanel3_TABLE_INFOLayout.setHorizontalGroup(
            jPanel3_TABLE_INFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_TABLE_INFOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );
        jPanel3_TABLE_INFOLayout.setVerticalGroup(
            jPanel3_TABLE_INFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3_TABLE_INFOLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        FOR_SELECTING_POST.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Developer", "Web Desiner", "Management", "Software Engineer" }));

        jLabel6.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel6.setText("Give your Off Time");

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel4.setText("Select your Gender");

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel3.setText("Select your post");

        jCheckBox1_SSC.setText("1 pm");

        jCheckBox2_HSC.setText("2 pm");

        jCheckBox3_BSC.setText("5 pm");

        jCheckBox4_MSC.setText("6 pm");

        javax.swing.GroupLayout PENEL_FOR_OFF_TIMELayout = new javax.swing.GroupLayout(PENEL_FOR_OFF_TIME);
        PENEL_FOR_OFF_TIME.setLayout(PENEL_FOR_OFF_TIMELayout);
        PENEL_FOR_OFF_TIMELayout.setHorizontalGroup(
            PENEL_FOR_OFF_TIMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PENEL_FOR_OFF_TIMELayout.createSequentialGroup()
                .addComponent(jCheckBox1_SSC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2_HSC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3_BSC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4_MSC)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        PENEL_FOR_OFF_TIMELayout.setVerticalGroup(
            PENEL_FOR_OFF_TIMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PENEL_FOR_OFF_TIMELayout.createSequentialGroup()
                .addGroup(PENEL_FOR_OFF_TIMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1_SSC)
                    .addComponent(jCheckBox2_HSC)
                    .addComponent(jCheckBox3_BSC)
                    .addComponent(jCheckBox4_MSC))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        jLabel1.setText("MY dream office");

        jLabel7.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel7.setText("Give your Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PENEL_FOR_OFF_TIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FOR_SELECTING_MALE, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FOR_SELECTING_FEMALE)))
                        .addContainerGap())
                    .addComponent(FOR_GIVING_NAME)
                    .addComponent(FOR_SELECTING_POST, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jPanel3_TABLE_INFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel7)
                    .addContainerGap(460, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(FOR_GIVING_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FOR_SELECTING_POST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FOR_SELECTING_MALE)
                    .addComponent(FOR_SELECTING_FEMALE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(PENEL_FOR_OFF_TIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3_TABLE_INFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(373, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FOR_SELECTING_MALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOR_SELECTING_MALEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FOR_SELECTING_MALEActionPerformed

    private void FOR_SELECTING_FEMALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOR_SELECTING_FEMALEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FOR_SELECTING_FEMALEActionPerformed

    private void jButton1_SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SAVEActionPerformed
        getting_all_record();
        //ERROR if name filed is empty
        if(FOR_GIVING_NAME.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please Enter Name");
            FOR_GIVING_NAME.requestFocus();
           }
        else{
            if(FOR_SELECTING_POST.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(rootPane, "Please Select Country");
                FOR_SELECTING_POST.requestFocus();
            }
            else{
                jfc = new JFileChooser(director);
                //adding file filter
                FileNameExtensionFilter filter;
                filter = new FileNameExtensionFilter("*.text",new String[]{"txt"});
                
                jfc.addChoosableFileFilter(filter);
                int option = jfc.showSaveDialog(this);
                if(option==JFileChooser.APPROVE_OPTION){
                    director=jfc.getCurrentDirectory();
                    model.addRow(new Object[]{name,post,gender,off_time});
                    
                    file = jfc.getSelectedFile();
                    try {
                        for_saving();
                    } catch (IOException ex) {
                        //Logger.getLogger(JFrame1st.class.getName()).log(Level.SEVERE, null, ex);
                        ex.printStackTrace();
                   
                                
                    }
                    off_time="";
                }
            }
        }
        
        
    }//GEN-LAST:event_jButton1_SAVEActionPerformed

    private void FOR_CLEARINGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOR_CLEARINGActionPerformed
        for_clearing();
    }//GEN-LAST:event_FOR_CLEARINGActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        new HELP().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_BACKActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

private void getting_all_record(){
name = FOR_GIVING_NAME.getText();
//address = GIVING_ADRESS.getText();
post = FOR_SELECTING_POST.getSelectedItem().toString();
//radio button
if(FOR_SELECTING_MALE.isSelected()){
    gender = "Male";  
}
else{
    gender = "Female";
}
//chack box(ssc.hsc)
for (int i = 0; i < PENEL_FOR_OFF_TIME.getComponentCount(); i++) {
    JCheckBox chackBox =(JCheckBox)PENEL_FOR_OFF_TIME.getComponent(i);
    if(chackBox.isSelected()){
        off_time += chackBox.getText();
        off_time += gap;
        }    
    }

}
//////for saving
private void for_saving() throws IOException{
    BufferedWriter buf=null;
    try{
        buf = new BufferedWriter(new FileWriter(file+getExtension(),true));
        buf.write(name+","+post+","+gender+","+off_time);
        buf.newLine();
        JOptionPane.showMessageDialog(rootPane, "Data Saved");
    } catch(Exception e){
        e.printStackTrace();  
    }
    finally{
        if(buf!=null){
            buf.close();
        }
    }        
    }
    private String getExtension(){
        String ext="";
        String extension = jfc.getFileFilter().getDescription();
        if(extension.equals("*.txt")){/////  /if user did not give .txt while saving
        ext = ".txt";
        
        }
        return ext;
    }
    ////    workin with display text area
    private void display_text_area(){
        FileInputStream fobj = null;
        jfc=new JFileChooser(director);
        int option = jfc.showOpenDialog(this);
        if(option==JFileChooser.APPROVE_OPTION){
            file = jfc.getSelectedFile();
            director = jfc.getCurrentDirectory();
            try{
                String str = "";
                fobj = new FileInputStream(file);
                int len = (int)file.length();
                for (int i = 0;i< len; i++){
                    char str2 = 0;
                    try{
                        str2 = (char)fobj.read();
                        if(str2==','){
                            str2 = '\t';
                        }
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    str = str+str2;
                }
            //    TEXT_AREA.setText(str);
            }catch(Exception e){
                e.printStackTrace();
            }
            finally{
                try{
                    if(fobj!= null){
                    fobj.close();
                    }
                }catch(Exception e){
                    
                }
            }
        }
    }
    ////displaing in table
    private void displing_table(){
        InputStream is = null;
        jfc = new JFileChooser(director);
        int option = jfc.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            file=jfc.getSelectedFile();
            director=jfc.getCurrentDirectory();
            try{
                File f =file;
                is = new FileInputStream(f);
                Scanner scan = new Scanner(is);
                String[] arr;
                while(scan.hasNextLine()){
                    String line = scan.nextLine();
                    if(line.indexOf(",")>1){
                       arr = line.split(",");
                  
                    }else{
                        arr=line.split("\n");
                        
                    }
                    Object[] data = new Object[arr.length];
                       for (int i=0;i<data.length;i++){
                            data[i]=arr[i];
                        }
                       model.addRow(data);
                       
                }
            }   catch(Exception e){
                e.printStackTrace();
            }
            finally{
                try {
                    if(is != null){
                    is.close();
                    }
                        
                } catch (Exception e){
                    
                }
            }
        }
        
    }
    private void for_clearing(){
        FOR_GIVING_NAME.setText("");
        //GIVING_ADRESS.setText("");
        FOR_SELECTING_POST.setSelectedIndex(0);
        off_time ="";
       // jPanel1.clearSelection();
        for (int i = 0; i < PENEL_FOR_OFF_TIME.getComponentCount(); i++) {
            JCheckBox chechbox = (JCheckBox)PENEL_FOR_OFF_TIME.getComponent(i);
            if(chechbox.isSelected()){
                chechbox.setSelected(false);
            }
        }
        if(TABLE.getRowCount()>0){
            for (int i = TABLE.getRowCount()-1; i > -1; i--) {
                model.removeRow(i);
            }
        }
       // TEXT_AREA.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(WANT_TO_HELP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WANT_TO_HELP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WANT_TO_HELP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WANT_TO_HELP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WANT_TO_HELP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ACTUAL_Batton_GROUP1;
    private javax.swing.JButton BACK;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton FOR_CLEARING;
    private javax.swing.JTextField FOR_GIVING_NAME;
    private javax.swing.JRadioButton FOR_SELECTING_FEMALE;
    private javax.swing.JRadioButton FOR_SELECTING_MALE;
    private javax.swing.JComboBox<String> FOR_SELECTING_POST;
    private javax.swing.JPanel PENEL_FOR_OFF_TIME;
    private javax.swing.JTable TABLE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1_SAVE;
    private javax.swing.JCheckBox jCheckBox1_SSC;
    private javax.swing.JCheckBox jCheckBox2_HSC;
    private javax.swing.JCheckBox jCheckBox3_BSC;
    private javax.swing.JCheckBox jCheckBox4_MSC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3_TABLE_INFO;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
