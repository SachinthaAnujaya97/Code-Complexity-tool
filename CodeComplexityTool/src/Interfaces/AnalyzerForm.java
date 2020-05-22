/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Analytics.ControlComplexity;
import Analytics.Controller;
import Analytics.FileAnalyzer;
import Analytics.MethodComplexity;
import Analytics.SizeComplexityMeasuring;
import Analytics.VariableComplexity;
import static Interfaces.Main.filepath;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Sachintha
 */
public class AnalyzerForm extends javax.swing.JFrame {

    /**
     * Creates new form AnalyzerForm
     */
    SizeComplexityMeasuring scm = new SizeComplexityMeasuring();
    MethodComplexity mcm = new MethodComplexity();
    VariableComplexity vcm = new VariableComplexity();
    ControlComplexity Ccm = new ControlComplexity();
    
    ArrayList<String> SizeComplexityList = new ArrayList<>();
    ArrayList<String> MethodComplexityList = new ArrayList<>();
    ArrayList<String> VariableComplexityList = new ArrayList<>();
    ArrayList<String> ControlComplexityLst = new ArrayList<>();
    
    int Cc = 0;
    int Kwc = 0;
    int Cs=0,Wkw=0,Nkw=0,Wid=0,Nid=0,Wop=0,Nop=0,Wnv=0,Nnv=0,Wsl=0,Nsl=0;
    int Cm=0,Wmrt=0,Wpdtp=0,Npdtp=0,Wcdtp=0,Ncdtp=0;
    int Cv=0,Wvs=0,Wpdtv=0,Npdtv=0,Wcdtv=0,Ncdtv=0;
    int Ci=0;
    int Ccs=0,Wtcs=0,NC=0,Ccspps=0;
    int Ccp=0,Wr=0,Nr=0,Wmcms=0,Nmcms=0,Wmcmd=0,Nmcmd=0,Wmcrms=0,Nmcrms=0,Wmcrmd=0,Nmcrmd=0,Wrmcrms=0,Nrmcrms=0,Wrmcrmd=0,Nrmcrmd=0,Wrmcms=0,Nrmcms=0,Wrmcmd=0,
            Nrmcmd=0,Wmrgvs=0,Nmrgvs=0,Wmrgvd=0,Nmrgvd=0,Wrmrgvs=0,Nrmrgvs=0,Wrmrgvd=0,Nrmrgvd=0;
    int TCps=0;
    
    public AnalyzerForm() {
        initComponents();
        setSize(1350,850);
    }
    
    public void getInheritanceCode(String filepath) throws FileNotFoundException, IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        InheritanceView.read(br, null);
        InheritanceView.requestFocus();
    }
    
    public void getCouplingCode(String filepath) throws FileNotFoundException, IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        
        CouplingView.read(br, null);
        CouplingView.requestFocus();
        
        
    }
    
    public void getCouplingResults(ArrayList<String> lst)
    {
            
            Wr = Integer.parseInt(lst.get(0));
            Nr = Integer.parseInt(lst.get(1));
            Wmcms = Integer.parseInt(lst.get(2));
            Nmcms = Integer.parseInt(lst.get(3));
            Wmcmd = Integer.parseInt(lst.get(4));
            Nmcmd = Integer.parseInt(lst.get(5));
            Wmcrms = Integer.parseInt(lst.get(6));
            Nmcrms = Integer.parseInt(lst.get(7));
            Wmcrmd = Integer.parseInt(lst.get(8));
            Nmcrmd = Integer.parseInt(lst.get(9));
            Wrmcrms = Integer.parseInt(lst.get(10));
            Nrmcrms = Integer.parseInt(lst.get(11));
            Wrmcrmd = Integer.parseInt(lst.get(12));
            Nrmcrmd = Integer.parseInt(lst.get(13));
            Wrmcms = Integer.parseInt(lst.get(14));
            Nrmcms = Integer.parseInt(lst.get(15));
            Wrmcmd = Integer.parseInt(lst.get(16));
            Nrmcmd = Integer.parseInt(lst.get(17));
            Wmrgvs = Integer.parseInt(lst.get(18));
            Nmrgvs = Integer.parseInt(lst.get(19));
            Wmrgvd = Integer.parseInt(lst.get(20));
            Nmrgvd = Integer.parseInt(lst.get(21));
            Wrmrgvs = Integer.parseInt(lst.get(22));
            Nrmrgvs = Integer.parseInt(lst.get(23));
            Wrmrgvd = Integer.parseInt(lst.get(24));
            Nrmrgvd = Integer.parseInt(lst.get(25));
            
            Wrlabel.setText(Integer.toString(Wr));
            NrLabel.setText(Integer.toString(Nr));
            WmcmsLabel.setText(Integer.toString(Wmcms));
            NmcmsLabel.setText(Integer.toString(Nmcms));
            WmcmdLabel.setText(Integer.toString(Wmcmd));
            NmcmdLabel.setText(Integer.toString(Nmcmd));
            WmcrmsLabel.setText(Integer.toString(Wmcrms));
            NmcrmsLabel.setText(Integer.toString(Nmcrms));
            WmcrmdLabel.setText(Integer.toString(Wmcrmd));
            NmcrmdLabel.setText(Integer.toString(Nmcrmd));
            WrmcrmsLabel.setText(Integer.toString(Wrmcrms));
            NrmcrmsLabel.setText(Integer.toString(Nrmcrms));
            WrmcrmdLabel.setText(Integer.toString(Wrmcrmd));
            NrmcrmdLabel.setText(Integer.toString(Nrmcrmd));
            WrmcmsLabel.setText(Integer.toString(Wrmcms));
            NrmcmsLabel.setText(Integer.toString(Nrmcms));
            WrmcmdLabel.setText(Integer.toString(Wrmcmd));
            NrmcmdLabel.setText(Integer.toString(Nrmcmd));
            WmrgvsLabel.setText(Integer.toString(Wmrgvs));
            NmrgvsLabel.setText(Integer.toString(Nmrgvs));
            WmrgvdLabel.setText(Integer.toString(Wmrgvd));
            NmrgvdLabel.setText(Integer.toString(Nmrgvd));
            WrmrgvsLabel.setText(Integer.toString(Wrmrgvs));
            NrmrgvsLabel.setText(Integer.toString(Nrmrgvs));
            WrmrgvdLabel.setText(Integer.toString(Wrmrgvd));
            NrmrgvdLabel.setText(Integer.toString(Nrmrgvd));
            
            Ccp = (Wr * Nr) + (Wmcms * Nmcms) + (Wmcmd * Nmcmd) + (Wmcrms * Nmcrms) + (Wmcrmd * Nmcrmd) + 
                    (Wrmcrms * Nrmcrms) + (Wrmcrmd *Nrmcrmd) + (Wrmcms * Nrmcms) + (Wrmcmd * Nrmcmd) +  
                    (Wmrgvs *Nmrgvs) + (Wmrgvd * Nmrgvd) + (Wrmrgvs * Nrmrgvs) + (Wrmrgvd * Nrmrgvd);
            TCps = TCps + Ccp;
            CcpValue.setText(Integer.toString(Ccp));
    }
    
    public void CheckBoxValidation(boolean svmcheck, boolean inheritcheck, boolean couplingcheck, boolean structurecheck)
    {
        if(svmcheck == true)
        {
            analyzerTab.setEnabledAt(0, true);
            analyzerTab.setEnabledAt(1, true);
            analyzerTab.setEnabledAt(2, true);
        }
        else if(svmcheck == false)
        {
            analyzerTab.setEnabledAt(0, false);
            analyzerTab.setEnabledAt(1, false);
            analyzerTab.setEnabledAt(2, false);
        }
        
        if(inheritcheck == true)
        {
            analyzerTab.setEnabledAt(4, true);
        }
        else if(inheritcheck == false)
        {
            analyzerTab.setEnabledAt(4, false);
        }
        
        if(couplingcheck == true)
        {
            analyzerTab.setEnabledAt(5, true);
        }
        else if(couplingcheck == false)
        {
            analyzerTab.setEnabledAt(5, false);
        }
        
        if(structurecheck == true)
        {
            analyzerTab.setEnabledAt(3, true);
        }
        else if(structurecheck == false)
        {
            analyzerTab.setEnabledAt(3, false);
        }
    }
    
    public void getDetails(int value)
    {
        Cc = value;
        TCps = TCps + Cc;
        ComplexityLabel.setText(Integer.toString(value));
    }
    
    public void getCodeText(String filepath) throws IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        sizeTextView.read(br, null);
        sizeTextView.requestFocus();
    }
    
    public void getSizeComplexity(String filepath) throws Exception
    {
        //SizeLabel.setText(Integer.toString(scm.SizeComplexityInitializer(br)));
        SizeComplexityList = scm.SizeComplexityInitializer(filepath);
        
        Wkw = Integer.parseInt(SizeComplexityList.get(0));
        Nkw = Integer.parseInt(SizeComplexityList.get(1));
        Wid = Integer.parseInt(SizeComplexityList.get(2));
        Nid = Integer.parseInt(SizeComplexityList.get(3));
        Wop = Integer.parseInt(SizeComplexityList.get(4));
        Nop = Integer.parseInt(SizeComplexityList.get(5));
        Wnv = Integer.parseInt(SizeComplexityList.get(6));
        Nnv = Integer.parseInt(SizeComplexityList.get(7));
        Wsl = Integer.parseInt(SizeComplexityList.get(8));
        Nsl = Integer.parseInt(SizeComplexityList.get(9));
        
        WkwLabel.setText(Integer.toString(Wkw));
        NkwLabel.setText(Integer.toString(Nkw));
        WidLabel.setText(Integer.toString(Wid));
        NidLabel.setText(Integer.toString(Nid));
        WopLabel.setText(Integer.toString(Wop));
        NopLabel.setText(Integer.toString(Nop));
        WnvLabel.setText(Integer.toString(Wnv));
        NnvLabel.setText(Integer.toString(Nnv));
        WslLabel.setText(Integer.toString(Wsl));
        NslLabel.setText(Integer.toString(Nsl));
        
        Cs=(Wkw*Nkw)+(Wid*Nid)+(Wop*Nop)+(Wnv*Nnv)+(Wsl*Nsl);
        TCps = TCps + Cs;
        CsLabelValue.setText(Integer.toString(Cs));
        
    }
    
    public void getCPPSizeComplexity(String filepath) throws Exception
    {
        SizeComplexityList = scm.SizeComplexityInitializerCPP(filepath);
        
        Wkw = Integer.parseInt(SizeComplexityList.get(0));
        Nkw = Integer.parseInt(SizeComplexityList.get(1));
        Wid = Integer.parseInt(SizeComplexityList.get(2));
        Nid = Integer.parseInt(SizeComplexityList.get(3));
        Wop = Integer.parseInt(SizeComplexityList.get(4));
        Nop = Integer.parseInt(SizeComplexityList.get(5));
        Wnv = Integer.parseInt(SizeComplexityList.get(6));
        Nnv = Integer.parseInt(SizeComplexityList.get(7));
        Wsl = Integer.parseInt(SizeComplexityList.get(8));
        Nsl = Integer.parseInt(SizeComplexityList.get(9));
        
        WkwLabel.setText(Integer.toString(Wkw));
        NkwLabel.setText(Integer.toString(Nkw));
        WidLabel.setText(Integer.toString(Wid));
        NidLabel.setText(Integer.toString(Nid));
        WopLabel.setText(Integer.toString(Wop));
        NopLabel.setText(Integer.toString(Nop));
        WnvLabel.setText(Integer.toString(Wnv));
        NnvLabel.setText(Integer.toString(Nnv));
        WslLabel.setText(Integer.toString(Wsl));
        NslLabel.setText(Integer.toString(Nsl));
        
        Cs=(Wkw*Nkw)+(Wid*Nid)+(Wop*Nop)+(Wnv*Nnv)+(Wsl*Nsl);
        TCps = TCps + Cs;
        CsLabelValue.setText(Integer.toString(Cs));
        
    }
    
    public void getVariableAnalyze(int value)
    {
        Kwc = value;
        KeyWordAnalyzerLabel.setText(Integer.toString(value));
    }
    
    public void getInheritanceAnalyzer(int value)
    {
        
        Ci = value;
        TCps = TCps + Ci;
        
        CiValue1.setText(Integer.toString(Ci));
    }
    
    public void getMethodComplexity(String filepath) throws FileNotFoundException, IOException
    {
        MethodComplexityList = mcm.MethodComplexityInitializer(filepath);
        
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        CsMethodsTextView.read(br, null);
        CsMethodsTextView.requestFocus();
        
        Wmrt = Integer.parseInt(MethodComplexityList.get(0));
        Wpdtp = Integer.parseInt(MethodComplexityList.get(1));
        Npdtp = Integer.parseInt(MethodComplexityList.get(2));
        Wcdtp = Integer.parseInt(MethodComplexityList.get(3));
        Ncdtp = Integer.parseInt(MethodComplexityList.get(4));
        
        WmrtLabel.setText(Integer.toString(Wmrt));
        WpdtpLabel.setText(Integer.toString(Wpdtp));
        NpdtpLabel.setText(Integer.toString(Npdtp));
        WcdtpLabel.setText(Integer.toString(Wcdtp));
        NcdtpLabel.setText(Integer.toString(Ncdtp));
        
        Cm = Wmrt + (Wpdtp * Npdtp) + (Wcdtp * Ncdtp);
        TCps = TCps + Cm;
        CmLabel.setText(Integer.toString(Cm));
        
    }
    
    public void getCPPMethodComplexity(String filepath) throws FileNotFoundException, IOException
    {
        MethodComplexityList = mcm.MethodComplexityInitializerCPP(filepath);
        
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        CsMethodsTextView.read(br, null);
        CsMethodsTextView.requestFocus();
        
        Wmrt = Integer.parseInt(MethodComplexityList.get(0));
        Wpdtp = Integer.parseInt(MethodComplexityList.get(1));
        Npdtp = Integer.parseInt(MethodComplexityList.get(2));
        Wcdtp = Integer.parseInt(MethodComplexityList.get(3));
        Ncdtp = Integer.parseInt(MethodComplexityList.get(4));
        
        WmrtLabel.setText(Integer.toString(Wmrt));
        WpdtpLabel.setText(Integer.toString(Wpdtp));
        NpdtpLabel.setText(Integer.toString(Npdtp));
        WcdtpLabel.setText(Integer.toString(Wcdtp));
        NcdtpLabel.setText(Integer.toString(Ncdtp));
        
        Cm = Wmrt + (Wpdtp * Npdtp) + (Wcdtp * Ncdtp);
        TCps = TCps + Cm;
        CmLabel.setText(Integer.toString(Cm));
    }
    
    public void getVariableComplexity(String [] str, String filepath) throws FileNotFoundException, IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        CsVariableView.read(br, null);
        CsVariableView.requestFocus();
        
        VariableComplexityList = vcm.VariableComplexityInitializer(str);
        
        Wvs = Integer.parseInt(VariableComplexityList.get(0));
        Wpdtv = Integer.parseInt(VariableComplexityList.get(1));
        Npdtv = Integer.parseInt(VariableComplexityList.get(2));
        Wcdtv = Integer.parseInt(VariableComplexityList.get(3));
        Ncdtv = Integer.parseInt(VariableComplexityList.get(4));
        
        WvsLabel.setText(Integer.toString(Wvs));
        WpdtvLabel.setText(Integer.toString(Wpdtv));
        NpdtvLabel.setText(Integer.toString(Npdtv));
        WcdtvLabel.setText(Integer.toString(Wcdtv));
        NcdtvLabel.setText(Integer.toString(Ncdtv));
        
        Cv = Wvs * ((Wpdtv * Npdtv) + (Wcdtv * Ncdtv));
        TCps = TCps + Cv;
        CvLabel.setText(Integer.toString(Cv));
    }
    
    public void getCPPVariableComplexity(String [] str, String filepath) throws FileNotFoundException, IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        CsVariableView.read(br, null);
        CsVariableView.requestFocus();
        
        VariableComplexityList = vcm.VariableComplexityInitializerCPP(str);
        
        Wvs = Integer.parseInt(VariableComplexityList.get(0));
        Wpdtv = Integer.parseInt(VariableComplexityList.get(1));
        Npdtv = Integer.parseInt(VariableComplexityList.get(2));
        Wcdtv = Integer.parseInt(VariableComplexityList.get(3));
        Ncdtv = Integer.parseInt(VariableComplexityList.get(4));
        
        WvsLabel.setText(Integer.toString(Wvs));
        WpdtvLabel.setText(Integer.toString(Wpdtv));
        NpdtvLabel.setText(Integer.toString(Npdtv));
        WcdtvLabel.setText(Integer.toString(Wcdtv));
        NcdtvLabel.setText(Integer.toString(Ncdtv));
        
        Cv = Wvs * ((Wpdtv * Npdtv) + (Wcdtv * Ncdtv));
        TCps = TCps + Cv;
        CvLabel.setText(Integer.toString(Cv));
        
    }
    
    public void getControlStructureConplexity(String filepath) throws FileNotFoundException, IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        CcSVariableView.read(br, null);
        CcSVariableView.requestFocus();
        
        ControlComplexityLst = Ccm.ControlComplexityInitializer(filepath);
        
        Wtcs = Integer.parseInt(ControlComplexityLst.get(0));
        NC = Integer.parseInt(ControlComplexityLst.get(1));
        Ccspps = Integer.parseInt(ControlComplexityLst.get(2));
        
        WtcsLabel.setText(Integer.toString(Wtcs));
        NCLabel.setText(Integer.toString(NC));
        CcsppsLabel.setText(Integer.toString(Ccspps));
        
        Ccs = (Wtcs * NC) + Ccspps;
        TCps = TCps + Ccs;
        CcsLabel.setText(Integer.toString(Ccs));
        System.out.println("multiple complex");
    }
    
    public void getCPPControlStructureConplexity(String filepath) throws FileNotFoundException, IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        CcSVariableView.read(br, null);
        CcSVariableView.requestFocus();
        
        ControlComplexityLst = Ccm.ControlComplexityInitializerCPP(filepath);
        
        Wtcs = Integer.parseInt(ControlComplexityLst.get(0));
        NC = Integer.parseInt(ControlComplexityLst.get(1));
        Ccspps = Integer.parseInt(ControlComplexityLst.get(2));
        
        WtcsLabel.setText(Integer.toString(Wtcs));
        NCLabel.setText(Integer.toString(NC));
        CcsppsLabel.setText(Integer.toString(Ccspps));
        
        Ccs = (Wtcs * NC) + Ccspps;
        CcsLabel.setText(Integer.toString(Ccs));
        TCps = TCps + Ccs;
    }
    
    public long getFinalResult()
    {
        System.out.println(Cs);
        System.out.println(Cv);
        System.out.println(Cm);
        System.out.println(Ci);
        System.out.println(Ccp);
        System.out.println(Ccs);
        TCps = Cs + Cv + Cm + Ci + Ccp + Ccs;
        System.out.println(TCps);
        return TCps;
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
        ComplexityLabel = new javax.swing.JLabel();
        KeyWordAnalyzerLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        analyzerTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sizeTextView = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        WkwLabel = new javax.swing.JLabel();
        NkwLabel = new javax.swing.JLabel();
        WidLabel = new javax.swing.JLabel();
        NidLabel = new javax.swing.JLabel();
        WopLabel = new javax.swing.JLabel();
        NopLabel = new javax.swing.JLabel();
        WnvLabel = new javax.swing.JLabel();
        NnvLabel = new javax.swing.JLabel();
        WslLabel = new javax.swing.JLabel();
        NslLabel = new javax.swing.JLabel();
        CsLabelValue = new javax.swing.JLabel();
        CsLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CsMethodsTextView = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        NcdtpLabel = new javax.swing.JLabel();
        WcdtpLabel = new javax.swing.JLabel();
        NpdtpLabel = new javax.swing.JLabel();
        WpdtpLabel = new javax.swing.JLabel();
        WmrtLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CmLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        CsVariableView = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        WvsLabel = new javax.swing.JLabel();
        WpdtvLabel = new javax.swing.JLabel();
        NpdtvLabel = new javax.swing.JLabel();
        WcdtvLabel = new javax.swing.JLabel();
        NcdtvLabel = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        CvLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        CcSVariableView = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        WtcsLabel = new javax.swing.JLabel();
        NCLabel = new javax.swing.JLabel();
        CcsppsLabel = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        CcsLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        CouplingView = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        Wrlabel = new javax.swing.JLabel();
        NrLabel = new javax.swing.JLabel();
        WmcmsLabel = new javax.swing.JLabel();
        NrmcmdLabel = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        WrmcmdLabel = new javax.swing.JLabel();
        NrmcmsLabel = new javax.swing.JLabel();
        WrmcmsLabel = new javax.swing.JLabel();
        NrmcrmdLabel = new javax.swing.JLabel();
        WrmcrmdLabel = new javax.swing.JLabel();
        NrmcrmsLabel = new javax.swing.JLabel();
        WrmcrmsLabel = new javax.swing.JLabel();
        NmcrmdLabel = new javax.swing.JLabel();
        WmcrmdLabel = new javax.swing.JLabel();
        NmcrmsLabel = new javax.swing.JLabel();
        WmcrmsLabel = new javax.swing.JLabel();
        NmcmdLabel = new javax.swing.JLabel();
        WmcmdLabel = new javax.swing.JLabel();
        NmcmsLabel = new javax.swing.JLabel();
        WmrgvsLabel = new javax.swing.JLabel();
        NmrgvsLabel = new javax.swing.JLabel();
        WmrgvdLabel = new javax.swing.JLabel();
        NmrgvdLabel = new javax.swing.JLabel();
        WrmrgvsLabel = new javax.swing.JLabel();
        NrmrgvsLabel = new javax.swing.JLabel();
        WrmrgvdLabel = new javax.swing.JLabel();
        NrmrgvdLabel = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        CcpValue = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        InheritanceView = new javax.swing.JTextArea();
        jLabel69 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        CiValue1 = new javax.swing.JLabel();
        finalresultbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Analyzer Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        ComplexityLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ComplexityLabel.setText("--");
        getContentPane().add(ComplexityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        KeyWordAnalyzerLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        KeyWordAnalyzerLabel.setText("--");
        getContentPane().add(KeyWordAnalyzerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Code Complexity :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Key-Word Usage :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, -1, -1));

        analyzerTab.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        analyzerTab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sizeTextView.setColumns(20);
        sizeTextView.setRows(5);
        jScrollPane2.setViewportView(sizeTextView);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 310));

        jLabel6.setText("Nsl");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        jLabel7.setText("Wsl");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jLabel8.setText("Nnv");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        jLabel9.setText("Wnv");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        jLabel10.setText("Nop");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel11.setText("Wop");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel12.setText("Nid");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jLabel13.setText("Wid");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel14.setText("Nkw");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        jLabel15.setText("Wkw");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel16.setText("Cs = (Wkw * Nkw) + (Wid * Nid) + (Wop * Nop) + (Wnv * Nnv) + (Wsl * Nsl) ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        WkwLabel.setText("--");
        jPanel1.add(WkwLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        NkwLabel.setText("--");
        jPanel1.add(NkwLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        WidLabel.setText("--");
        jPanel1.add(WidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        NidLabel.setText("--");
        jPanel1.add(NidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        WopLabel.setText("--");
        jPanel1.add(WopLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        NopLabel.setText("--");
        jPanel1.add(NopLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        WnvLabel.setText("--");
        jPanel1.add(WnvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        NnvLabel.setText("--");
        jPanel1.add(NnvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        WslLabel.setText("--");
        jPanel1.add(WslLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        NslLabel.setText("--");
        jPanel1.add(NslLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        CsLabelValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CsLabelValue.setText("--");
        jPanel1.add(CsLabelValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        CsLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CsLabel1.setText("Cs");
        jPanel1.add(CsLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        analyzerTab.addTab("Size", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CsMethodsTextView.setColumns(20);
        CsMethodsTextView.setRows(5);
        jScrollPane3.setViewportView(CsMethodsTextView);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 310));

        jLabel17.setText("Ncdtp");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jLabel18.setText("Wcdtp");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jLabel19.setText("Npdtp");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jLabel20.setText("Wpdtp");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel21.setText("Wmrt");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel22.setText("Cm = Wmrt + (Wpdtp * Npdtp) + (Wcdtp * Ncdtp) ");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        NcdtpLabel.setText("--");
        jPanel2.add(NcdtpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        WcdtpLabel.setText("--");
        jPanel2.add(WcdtpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        NpdtpLabel.setText("--");
        jPanel2.add(NpdtpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        WpdtpLabel.setText("--");
        jPanel2.add(WpdtpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        WmrtLabel.setText("--");
        jPanel2.add(WmrtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setText("Cm");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        CmLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CmLabel.setText("--");
        jPanel2.add(CmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 209, -1, 40));

        analyzerTab.addTab("Methods", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CsVariableView.setColumns(20);
        CsVariableView.setRows(5);
        jScrollPane4.setViewportView(CsVariableView);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 310));

        jLabel24.setText("Ncdtv");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel25.setText("Wcdtv");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jLabel26.setText("Npdtv");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel27.setText("Wpdtv");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        jLabel28.setText("Wvs");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        jLabel29.setText("Cv = Wvs [(Wpdtv * Npdtv) + (Wcdtv * Ncdtv)] ");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        WvsLabel.setText("--");
        jPanel3.add(WvsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        WpdtvLabel.setText("--");
        jPanel3.add(WpdtvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        NpdtvLabel.setText("--");
        jPanel3.add(NpdtvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        WcdtvLabel.setText("--");
        jPanel3.add(WcdtvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        NcdtvLabel.setText("--");
        jPanel3.add(NcdtvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel30.setText("Cv");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        CvLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CvLabel.setText("--");
        jPanel3.add(CvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, 40));

        analyzerTab.addTab("Variables", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CcSVariableView.setColumns(20);
        CcSVariableView.setRows(5);
        jScrollPane5.setViewportView(CcSVariableView);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 310));

        jLabel31.setText("Ccspps");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        jLabel32.setText("NC");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        jLabel33.setText("Wtcs");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel34.setText("Ccs = (Wtcs * NC) + Ccspps ");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        WtcsLabel.setText("--");
        jPanel4.add(WtcsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        NCLabel.setText("--");
        jPanel4.add(NCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        CcsppsLabel.setText("--");
        jPanel4.add(CcsppsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel35.setText("Ccs");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        CcsLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CcsLabel.setText("--");
        jPanel4.add(CcsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, 40));

        analyzerTab.addTab("Control Stuctures", jPanel4);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CouplingView.setColumns(20);
        CouplingView.setRows(5);
        jScrollPane7.setViewportView(CouplingView);

        jPanel6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 310));

        jLabel2.setText("Ccp = (Wr * Nr) + (Wmcms * Nmcms) + (Wmcmd * Nmcmd)");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel37.setText(" + (Wmcrms * Nmcrms) + (Wmcrmd * Nmcrmd)+(Wrmcrms * Nrmcrms) ");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jLabel38.setText(" (Wmcrmd * Nmcrmd) +  (Wrmcrms * Nrmcrms) + (Wrmcrmd *Nrmcrmd)");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel39.setText("+ (Wmrgvs *Nmrgvs) + (Wmrgvd * Nmrgvd) + (Wrmrgvs * Nrmrgvs)");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jLabel40.setText("(Wrmrgvd * Nrmrgvd)");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabel41.setText("Wmcrmd");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        jLabel42.setText("Nmcrms");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jLabel43.setText("Wmcrms");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        jLabel44.setText("Nmcmd");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jLabel45.setText("Wmcmd");
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        jLabel46.setText("Nmcms");
        jPanel6.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        jLabel47.setText("Wmcms");
        jPanel6.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jLabel48.setText("Nr");
        jPanel6.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        jLabel49.setText("Nmcrmd");
        jPanel6.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, -1));

        jLabel50.setText("Wrmcrms");
        jPanel6.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        jLabel51.setText("Nrmcrms");
        jPanel6.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        jLabel52.setText("Wrmcrmd");
        jPanel6.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));

        jLabel53.setText("Nrmcrmd");
        jPanel6.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        jLabel54.setText("Wrmcms");
        jPanel6.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        jLabel55.setText("Nrmcms");
        jPanel6.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        jLabel56.setText("Wrmcmd");
        jPanel6.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        jLabel57.setText("Nrmcmd");
        jPanel6.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        Wrlabel.setText("--");
        jPanel6.add(Wrlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        NrLabel.setText("--");
        jPanel6.add(NrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        WmcmsLabel.setText("--");
        jPanel6.add(WmcmsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        NrmcmdLabel.setText("--");
        jPanel6.add(NrmcmdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        jLabel62.setText("Wr");
        jPanel6.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jLabel58.setText("Nrmrgvs");
        jPanel6.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, -1, -1));

        jLabel59.setText("Nmrgvs");
        jPanel6.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, -1, -1));

        jLabel60.setText("Wmrgvd");
        jPanel6.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, -1, -1));

        jLabel63.setText("Nmrgvd");
        jPanel6.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, -1, -1));

        jLabel64.setText("Wrmrgvs");
        jPanel6.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));

        jLabel65.setText("Wrmrgvd");
        jPanel6.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, -1, -1));

        jLabel66.setText("Nrmrgvd");
        jPanel6.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, -1, -1));

        jLabel67.setText("Wmrgvs");
        jPanel6.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, -1, -1));

        WrmcmdLabel.setText("--");
        jPanel6.add(WrmcmdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        NrmcmsLabel.setText("--");
        jPanel6.add(NrmcmsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));

        WrmcmsLabel.setText("--");
        jPanel6.add(WrmcmsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, -1, -1));

        NrmcrmdLabel.setText("--");
        jPanel6.add(NrmcrmdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, -1));

        WrmcrmdLabel.setText("--");
        jPanel6.add(WrmcrmdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, -1, -1));

        NrmcrmsLabel.setText("--");
        jPanel6.add(NrmcrmsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, -1));

        WrmcrmsLabel.setText("--");
        jPanel6.add(WrmcrmsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        NmcrmdLabel.setText("--");
        jPanel6.add(NmcrmdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        WmcrmdLabel.setText("--");
        jPanel6.add(WmcrmdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        NmcrmsLabel.setText("--");
        jPanel6.add(NmcrmsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        WmcrmsLabel.setText("--");
        jPanel6.add(WmcrmsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        NmcmdLabel.setText("--");
        jPanel6.add(NmcmdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        WmcmdLabel.setText("--");
        jPanel6.add(WmcmdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        NmcmsLabel.setText("--");
        jPanel6.add(NmcmsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        WmrgvsLabel.setText("--");
        jPanel6.add(WmrgvsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 10, -1));

        NmrgvsLabel.setText("--");
        jPanel6.add(NmrgvsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 10, -1));

        WmrgvdLabel.setText("--");
        jPanel6.add(WmrgvdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 10, -1));

        NmrgvdLabel.setText("--");
        jPanel6.add(NmrgvdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 10, -1));

        WrmrgvsLabel.setText("--");
        jPanel6.add(WrmrgvsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 10, -1));

        NrmrgvsLabel.setText("--");
        jPanel6.add(NrmrgvsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 10, -1));

        WrmrgvdLabel.setText("--");
        jPanel6.add(WrmrgvdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 10, -1));

        NrmrgvdLabel.setText("--");
        jPanel6.add(NrmrgvdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 10, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel61.setText("Ccp");
        jPanel6.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        CcpValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CcpValue.setText("--");
        jPanel6.add(CcpValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        analyzerTab.addTab("Coupling", jPanel6);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InheritanceView.setColumns(20);
        InheritanceView.setRows(5);
        jScrollPane6.setViewportView(InheritanceView);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 310));

        jLabel69.setText("Ci = Weight assigned for that class due to its inheritance pattern");
        jPanel5.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel68.setText("Ci");
        jPanel5.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        CiValue1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CiValue1.setText("--");
        jPanel5.add(CiValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        analyzerTab.addTab("Inheritance", jPanel5);

        getContentPane().add(analyzerTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 970, 390));

        finalresultbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        finalresultbutton.setText("Final Result");
        finalresultbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalresultbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(finalresultbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 150, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finalresultbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalresultbuttonActionPerformed

        //long temp = getFinalResult();
        TotalComplexity ttcmpl = new TotalComplexity();
        ttcmpl.SetValues(Cc, Wkw, Cs, Cm, Cv, Ci, Ccs, Ccp, TCps);
        ttcmpl.setLocationRelativeTo(null);
        ttcmpl.setVisible(true);
        
    }//GEN-LAST:event_finalresultbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(AnalyzerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalyzerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalyzerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalyzerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalyzerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CcSVariableView;
    private javax.swing.JLabel CcpValue;
    private javax.swing.JLabel CcsLabel;
    private javax.swing.JLabel CcsppsLabel;
    private javax.swing.JLabel CiValue1;
    private javax.swing.JLabel CmLabel;
    private javax.swing.JLabel ComplexityLabel;
    private javax.swing.JTextArea CouplingView;
    private javax.swing.JLabel CsLabel1;
    private javax.swing.JLabel CsLabelValue;
    private javax.swing.JTextArea CsMethodsTextView;
    private javax.swing.JTextArea CsVariableView;
    private javax.swing.JLabel CvLabel;
    private javax.swing.JTextArea InheritanceView;
    private javax.swing.JLabel KeyWordAnalyzerLabel;
    private javax.swing.JLabel NCLabel;
    private javax.swing.JLabel NcdtpLabel;
    private javax.swing.JLabel NcdtvLabel;
    private javax.swing.JLabel NidLabel;
    private javax.swing.JLabel NkwLabel;
    private javax.swing.JLabel NmcmdLabel;
    private javax.swing.JLabel NmcmsLabel;
    private javax.swing.JLabel NmcrmdLabel;
    private javax.swing.JLabel NmcrmsLabel;
    private javax.swing.JLabel NmrgvdLabel;
    private javax.swing.JLabel NmrgvsLabel;
    private javax.swing.JLabel NnvLabel;
    private javax.swing.JLabel NopLabel;
    private javax.swing.JLabel NpdtpLabel;
    private javax.swing.JLabel NpdtvLabel;
    private javax.swing.JLabel NrLabel;
    private javax.swing.JLabel NrmcmdLabel;
    private javax.swing.JLabel NrmcmsLabel;
    private javax.swing.JLabel NrmcrmdLabel;
    private javax.swing.JLabel NrmcrmsLabel;
    private javax.swing.JLabel NrmrgvdLabel;
    private javax.swing.JLabel NrmrgvsLabel;
    private javax.swing.JLabel NslLabel;
    private javax.swing.JLabel WcdtpLabel;
    private javax.swing.JLabel WcdtvLabel;
    private javax.swing.JLabel WidLabel;
    private javax.swing.JLabel WkwLabel;
    private javax.swing.JLabel WmcmdLabel;
    private javax.swing.JLabel WmcmsLabel;
    private javax.swing.JLabel WmcrmdLabel;
    private javax.swing.JLabel WmcrmsLabel;
    private javax.swing.JLabel WmrgvdLabel;
    private javax.swing.JLabel WmrgvsLabel;
    private javax.swing.JLabel WmrtLabel;
    private javax.swing.JLabel WnvLabel;
    private javax.swing.JLabel WopLabel;
    private javax.swing.JLabel WpdtpLabel;
    private javax.swing.JLabel WpdtvLabel;
    private javax.swing.JLabel Wrlabel;
    private javax.swing.JLabel WrmcmdLabel;
    private javax.swing.JLabel WrmcmsLabel;
    private javax.swing.JLabel WrmcrmdLabel;
    private javax.swing.JLabel WrmcrmsLabel;
    private javax.swing.JLabel WrmrgvdLabel;
    private javax.swing.JLabel WrmrgvsLabel;
    private javax.swing.JLabel WslLabel;
    private javax.swing.JLabel WtcsLabel;
    private javax.swing.JLabel WvsLabel;
    private javax.swing.JTabbedPane analyzerTab;
    private javax.swing.JButton finalresultbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea sizeTextView;
    // End of variables declaration//GEN-END:variables
}
