/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Analytics.Controller;
import Analytics.FileAnalyzer;
import Coupling.Coupling;
import Coupling.CouplingMain;
import Coupling.CustomFile;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.parser.TokenType.EOF;

/**
 *
 * @author Sachintha
 */
public class Main extends javax.swing.JFrame {

    public static String filepath;
    ArrayList <CustomFile> fileList = new ArrayList<CustomFile>();
    ArrayList <String> couplingResults = new ArrayList<>();
    public FileAnalyzer analit = new FileAnalyzer();
    Controller ctrl = new Controller();
    AnalyzerForm anzf = new AnalyzerForm();
    CouplingMain cpMain = new CouplingMain();
    FileReader read;
    BufferedReader br;
    File fl;
    Coupling cp;
    String filetype;
    CustomFile csFile1;
    CustomFile csFile2;
    boolean svmcheck,inheritcheck,couplingcheck,structurecheck;
            
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setSize(1050,900);
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
        FileBrowseButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        selectedPathField = new javax.swing.JTextField();
        filNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FileTypeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CodeViewer = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        NumOfLines = new javax.swing.JLabel();
        AnalyzeButton = new javax.swing.JButton();
        svmCheckBox = new javax.swing.JCheckBox();
        InheritanceCheckBox = new javax.swing.JCheckBox();
        CouplingCheckBox = new javax.swing.JCheckBox();
        ControlStructureCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Code Complexity Tool");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        FileBrowseButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FileBrowseButton.setText("Browse");
        FileBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileBrowseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FileBrowseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Select the Java file for evaluation");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        selectedPathField.setEditable(false);
        selectedPathField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        selectedPathField.setText("Selected Fiile Path");
        getContentPane().add(selectedPathField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 770, -1));

        filNameField.setEditable(false);
        filNameField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        filNameField.setText("File Name");
        getContentPane().add(filNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 770, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Selected File Type :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        FileTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FileTypeLabel.setText("--");
        getContentPane().add(FileTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        CodeViewer.setColumns(20);
        CodeViewer.setRows(5);
        jScrollPane1.setViewportView(CodeViewer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 770, 330));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Number of Lines :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, 40));

        NumOfLines.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NumOfLines.setText("--");
        getContentPane().add(NumOfLines, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        AnalyzeButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        AnalyzeButton.setText("Analyze");
        AnalyzeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AnalyzeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AnalyzeButtonMouseExited(evt);
            }
        });
        AnalyzeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyzeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AnalyzeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 710, -1, -1));

        svmCheckBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        svmCheckBox.setText("Size , Variables and Method");
        getContentPane().add(svmCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 670, -1, -1));

        InheritanceCheckBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        InheritanceCheckBox.setText("Inheritance");
        getContentPane().add(InheritanceCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 670, -1, -1));

        CouplingCheckBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CouplingCheckBox.setText("Coupling");
        getContentPane().add(CouplingCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 720, -1, -1));

        ControlStructureCheckBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ControlStructureCheckBox.setText("Control Structures");
        getContentPane().add(ControlStructureCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 720, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FileBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileBrowseButtonActionPerformed

        //Selecting the file from file explorer
        JFileChooser choose = new JFileChooser();
        File workingDir = new File(System.getProperty("user.dir"));
        choose.setCurrentDirectory((workingDir));
        choose.showOpenDialog(null);

        //Getting the absolute file path and file name to display
        fl = choose.getSelectedFile();
        filepath = fl.getAbsolutePath();
        String flname = fl.getName();
        selectedPathField.setText((filepath));
        filNameField.setText(flname);
        
        //Deciding whether if it is a Java file or C++ file
        if(filepath.toLowerCase().endsWith(".java"))
        {
            filetype = "java";
            FileTypeLabel.setText("Java");
        }
        else if(filepath.toLowerCase().endsWith(".cpp"))
        {
            filetype = "cpp";
            FileTypeLabel.setText("C++");
        }
        
        //Viewing the code in the text area
        try
        {
            read = new FileReader(filepath);
            br = new BufferedReader(read);
            CodeViewer.read(br, null);
            //br.close();
            CodeViewer.requestFocus();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        try
        {
            int lineCount;
            lineCount = analit.LineCounter(filepath);
            NumOfLines.setText(Integer.toString(lineCount));
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
       
       
    }//GEN-LAST:event_FileBrowseButtonActionPerformed

    private void AnalyzeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalyzeButtonMouseEntered

        AnalyzeButton.setForeground(Color.RED);
    }//GEN-LAST:event_AnalyzeButtonMouseEntered

    private void AnalyzeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalyzeButtonMouseExited

        AnalyzeButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_AnalyzeButtonMouseExited

    private void AnalyzeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyzeButtonActionPerformed

        if(filetype.equals("java"))
        {
            //Adding the code to arraylist
        ctrl.setStrArr(CodeViewer.getText().split("\\n"));
        
        //CheckBox Validation
        if(svmCheckBox.isSelected())
        {
            svmcheck = true;
        }
        else if(!(svmCheckBox.isSelected()))
        {
            svmcheck = false;
        }
        
        if(InheritanceCheckBox.isSelected())
        {
            inheritcheck = true;
        }
        else if(!(InheritanceCheckBox.isSelected()))
        {
            inheritcheck = false;
        }
        
        if(CouplingCheckBox.isSelected())
        {
            couplingcheck = true;
        }
        else if(!(CouplingCheckBox.isSelected()))
        {
            couplingcheck = false;
        }
        
        if(ControlStructureCheckBox.isSelected())
        {
            structurecheck = true;
        }
        else if(!(ControlStructureCheckBox.isSelected()))
        {
            structurecheck = false;
        }
        
        anzf.CheckBoxValidation(svmcheck,inheritcheck,couplingcheck,structurecheck);
        
        try
        {
            anzf.getInheritanceCode(filepath);
        }
        catch (IOException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        try
        {
            anzf.getCouplingCode(filepath);
        }
        catch (IOException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        //Control Structure Complexity
        try
        {
            anzf.getControlStructureConplexity(filepath);
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        try {
            //Passing the code to Analyzeform Text Area
            anzf.getCodeText(filepath);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Calculating the complexity
        anzf.setVisible(true);
        
        //Calculating Code Complexity
        anzf.getDetails(ctrl.CodeAnalyzer(ctrl.getStrArr()));
        
        //Calculating Size Complexity
        try
        {
            anzf.getSizeComplexity(filepath);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        //Calculating Number of Variables
        anzf.getVariableAnalyze(ctrl.KeyWordAnalyzer(ctrl.getStrArr()));
        
        
        //Calculating Inheritance
        anzf.getInheritanceAnalyzer(ctrl.InheritanceAnalyzer(ctrl.getStrArr()));
        
        
        try {
            anzf.getVariableComplexity(ctrl.getStrArr(),filepath);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            //Calculating Method Complexity
            anzf.getMethodComplexity(filepath);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String filename = fl.getName();
        csFile1 = new CustomFile(filename);
        csFile1.setFilePath(filepath);
        csFile2 = new CustomFile("Coupling.java");
//        csFile.setFileName(filename);
//        
//        System.out.println(filename);
//        
//        csFile.setFilePath(filepath);
        fileList.add(csFile1);
//        fileList.add(csFile2);
        
//        
//        System.out.println(fileList.get(0));
//        //Accessing CouplingMain class
//        
//            filetype = "Java";
//            cpm.setFileList(fileList);
//            cpm.setFileType(filetype);
//            cpm.run();
       cpMain.setFileList(fileList);
       cpMain.setFileType("java");
       cpMain.Start();
       
       couplingResults = cpMain.getCouplingResults();
       anzf.getCouplingResults(couplingResults);
       
        }
        else if(filetype.equals("cpp"))
        {
            ctrl.setStrArr(CodeViewer.getText().split("\\n"));
            //Variable Complexity
            try 
            {
                anzf.getCPPVariableComplexity(ctrl.getStrArr(),filepath);
            } 
            catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(null, ex);
            }
            
            //Size Complexity
            try
            {
                anzf.getCPPSizeComplexity(filepath);
            }
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
            
            //Method Complexity
            try 
            {
                anzf.getCPPMethodComplexity(filepath);
            }
            catch (IOException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
            
            //Calculating Inheritance
            anzf.getInheritanceAnalyzer(ctrl.CPPInheritanceAnalyzer(ctrl.getStrArr()));
            
            //Control Structure Complexity
            
            try
            {
                anzf.getCPPControlStructureConplexity(filepath);
            }
            catch(IOException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter a compatible file");
        }
    }//GEN-LAST:event_AnalyzeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalyzeButton;
    private javax.swing.JTextArea CodeViewer;
    private javax.swing.JCheckBox ControlStructureCheckBox;
    private javax.swing.JCheckBox CouplingCheckBox;
    private javax.swing.JButton FileBrowseButton;
    private javax.swing.JLabel FileTypeLabel;
    private javax.swing.JCheckBox InheritanceCheckBox;
    private javax.swing.JLabel NumOfLines;
    private javax.swing.JTextField filNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField selectedPathField;
    private javax.swing.JCheckBox svmCheckBox;
    // End of variables declaration//GEN-END:variables
}
