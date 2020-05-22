/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author Rahal Sandeepa
 */
public class VariableComplexity {
    
    ArrayList<String> returnValues = new ArrayList<>();
    Field [] fieldList;
    Method [] methodList;
    Controller ctrl = new Controller();
    String [] primitiveDataTypes = ctrl.getPrimitiveDataTypes();
    String [] ignoreElements = ctrl.getIgnore();
    
    /*
    Cv = Complexity of a program statement due to its variables 
    Wvs = Weight due to variable scope 
    Wpdtv = Weight of primitive data type variables 
    Npdtv = Number of primitive data type variables 
    Wcdtv = Weight of composite data type variables 
    Ncdtv = Number of composite data type variables 
    */
    
    int Wvs,Wpdtv,Npdtv,Wcdtv,Ncdtv;
    String code;
    
    public ArrayList<String> VariableComplexityInitializer(String [] str) throws FileNotFoundException, IOException
    {
        code = Arrays.toString(str);
        String [] lines = str;
        for(String line : lines)
        {
            String tline = line.trim();
			if(getMethod(tline) != null) {
				
			}
			if(isGlobleVariable(tline)) {
				
			}
			else if(line.contains("int") || line.contains("char") || line.contains("String") || line.contains("Dimension")|| line.contains("double")) {
				if(line.contains(";")) {
					if(tline.contains("=")) {
						 String[] vars = tline.split("=");
						 for(String var : vars) {
							 String[] myvar = var.split(" ");
							 Wpdtv++;
                                                         Npdtv++;
							 break;
						 }
					 }
					 else if(tline.contains(",")) {
						 String[] vars = tline.split(",");
						 for(String var : vars) {
							 String tvar = var.trim();
							 if(tvar.contains("private") || tvar.contains("public")) {
								 String[] myvar = tvar.split(" ");
								 Wvs++;
								 
							 }
							 else if(tline.contains(";")) {
								 String[] myvar = tvar.split(";");
								 Wvs++;
								 break;
							 }
							 else {
								 Wcdtv++;
                                                                 Ncdtv++;
							 }
						 }
						
					 }
				
							
							 
						 }
					 
					 else {
						
						 
					 }
				 }
        }
        
        for(String line : lines) {
			 String tline = line.trim();
			 
			 if(getMethod(tline)!= null) {
				 
			 }
			 else if((tline.contains("private") || tline.contains("public")) && (tline.contains("int") || tline.contains("String") 
					 || tline.contains("char") || tline.contains("double") || tline.contains("Dimension"))) {
				 	
				 if(tline.contains("=")) {
					 String[] vars = tline.split("=");
					 for(String var : vars) {
						 String[] myvar = var.split(" ");
						 Wpdtv++;
                                                 Npdtv++;
						 break;
					 }
				 }
				 else if(tline.contains(",")) {
					 String[] vars = tline.split(",");
					 for(String var : vars) {
						 String tvar = var.trim();
						 if(tvar.contains("private") || tvar.contains("public")) {
							 String[] myvar = tvar.split(" ");
							 Wvs++;
							 
						 }
						 else if(tline.contains(";")) {
							 String[] myvar = tvar.split(";");
							 Wvs++;
							 break;
						 }
						 else {
							 Wcdtv++;
                                                         Ncdtv++;
						 }
					 }
					
				 }
				 else {
					
					 String[] vars = tline.split(";");
					 for(String var : vars) {
						 String[] myvar = var.split(" ");
						 Wvs++;
						;
						 break;
						 
					 }
				 }
			 }
		 }

		int[] score = new int[lines.length];
		int s = 0;
		score[s] = 0;
		
		for(String line : lines) {
			String tline = line.trim();
			
			if(isGlobleVariable(tline)) {
				if(tline.contains("public") || tline.contains("private")) {
					Wpdtv = Wpdtv + 2;
				}
				else {
					score[s] = 0;
					Wpdtv++;
				}
				
			
			}
			else if(checkLocalVariable(line)) {
				if(tline.contains("class")) {
					Wvs++;
				}
				else {
				Wpdtv++;
                                Npdtv++;
				}
			}
			else {
				Wcdtv++;
                                Ncdtv++;
			}
		}
//        String [] words;
//        String regex = "\\\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b";
//        for(int i=0; i<str.length; i++)
//        {
//            String sentence = str[i];
//            words = sentence.split(" ");
//            
//            for(int j = 0; j<words.length; j++)
//            {
//                for(int k = 0; k < primitiveDataTypes.length; k++)
//                {
//                    if(words[j].equals(primitiveDataTypes[k]))
//                    {
//                        //if((words[j+2].equals(regex)))
//                        //{
//                            Wvs++;
//                            Wpdtv++;
//                            Npdtv++;
//                        //}
//                    }
//                    else if((words[j] == null ? primitiveDataTypes[k] != null : !words[j].equals(primitiveDataTypes[k]))&&(!regex.equals(words[j])))
//                    {
//                        for( int ig = 0; ig < ignoreElements.length; ig++ )
//                        {
//                            if(words[j].equals(ignoreElements[ig]))
//                            {
//                                break;
//                            }
//                            else
//                            {
//                                Wcdtv = Wcdtv + 2;
//                                Ncdtv++;
//                            }
//                        }
//                    }
//                }
//            }
//        }
        
        
        
        returnValues.add(Integer.toString(Wvs));
        returnValues.add(Integer.toString(Wpdtv));
        returnValues.add(Integer.toString(Npdtv));
        returnValues.add(Integer.toString(Wcdtv));
        returnValues.add(Integer.toString(Ncdtv));
        
        return returnValues;
        
    }
    
    
    
    public ArrayList<String> VariableComplexityInitializerCPP(String [] str)
    {
        String [] words;
        String regex = "\\\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b";
        for(int i=0; i<str.length; i++)
        {
            String sentence = str[i];
            words = sentence.split(" ");
            
            for(int j = 0; j<words.length; j++)
            {
                for(int k = 0; k < primitiveDataTypes.length; k++)
                {
                    if(words[j].equals(primitiveDataTypes[k]))
                    {
                        //if((words[j+2].equals(regex)))
                        //{
                            Wvs++;
                            Wpdtv++;
                            Npdtv++;
                        //}
                    }
                    else if((words[j] == null ? primitiveDataTypes[k] != null : !words[j].equals(primitiveDataTypes[k]))&&(!regex.equals(words[j])))
                    {
                        for( int ig = 0; ig < ignoreElements.length; ig++ )
                        {
                            if(words[j].equals(ignoreElements[ig]))
                            {
                                break;
                            }
                            else
                            {
                                Wcdtv = Wcdtv + 2;
                                Ncdtv++;
                            }
                        }
                    }
                }
            }
        }
        
        returnValues.add(Integer.toString(Wvs));
        returnValues.add(Integer.toString(Wpdtv));
        returnValues.add(Integer.toString(Npdtv));
        returnValues.add(Integer.toString(Wcdtv));
        returnValues.add(Integer.toString(Ncdtv));
        
        return returnValues;
    }
    
    public boolean checkLocalVariable(String statement) {
		String myStatement = statement;
		boolean variable = false;
		String[] lines = code.split("\\r?\\n");
		ArrayList<String> localVariable = new ArrayList<>();
		
		for(String line : lines) {
			String tline = line.trim();
			if(getMethod(tline) != null) {
				
			}
			if(isGlobleVariable(tline)) {
				
			}
			else if(line.contains("int") || line.contains("char") || line.contains("String") || line.contains("Dimension")|| line.contains("double")) {
				if(line.contains(";")) {
					if(tline.contains("=")) {
						 String[] vars = tline.split("=");
						 for(String var : vars) {
							 String[] myvar = var.split(" ");
							 localVariable.add(myvar[1]);
							 break;
						 }
					 }
					 else if(tline.contains(",")) {
						 String[] vars = tline.split(",");
						 for(String var : vars) {
							 String tvar = var.trim();
							 if(tvar.contains("private") || tvar.contains("public")) {
								 String[] myvar = tvar.split(" ");
								 localVariable.add(myvar[2]);
								 
							 }
							 else if(tline.contains(";")) {
								 String[] myvar = tvar.split(";");
								 localVariable.add(myvar[0]);
								 break;
							 }
							 else {
								 localVariable.add(tvar);
							 }
						 }
						
					 }
				
							
							 
						 }
					 
					 else {
						
						 
					 }
				 }
			 
		}
					 			 

			//localVariable.add("sds");		
			
			
//		for(int i = 0; i <localVariable.size(); i++) {
//			System.out.println(localVariable.get(i));
//		}
		
		//System.out.println(">>>>>>>>>>>>>>>>>>>");
		 for(int i =0 ; i < localVariable.size(); i++) {
			 if(myStatement.contains(localVariable.get(i))) {
			 
				
				 
					 variable = true;
					 continue;
					 
				 
			 }
			
			 }
		 return variable;
	}
    
    public String getMethod(String statement) {
		String newStr = statement;
		String method = null;
		String[] words = newStr.split(" ");
		
		if(statement.contains("public") ||statement.contains("private") || statement.contains("void")) 
		{
			for(String word :words) {
				if(word.contains("("))
				{
					method = word.substring(0, word.indexOf("(") +1);
					break;
				}
			}
			
		}
		return method;
		
	}
    public boolean isGlobleVariable(String statment) {
		
		String myStatement = statment;
		 boolean variable = false;
		 
		 String[] lines = code.split("\\r?\\n");
		 
		 ArrayList<String> variableArray = new ArrayList<String>();
		 
		 
		 for(String line : lines) {
			 String tline = line.trim();
			 
			 if(getMethod(tline)!= null) { }
			 else if((tline.contains("private") || tline.contains("public")) && (tline.contains("int") || tline.contains("String") 
					 || tline.contains("char") || tline.contains("double") || tline.contains("Dimension")||tline.contains("double"))) {
				 	
				 if(tline.contains("=")) {
					 String[] vars = tline.split("=");
					 for(String var : vars) {
						 String[] myvar = var.split(" ");
						 variableArray.add(myvar[2]);
						 break;
					 }
				 }
				 else if(tline.contains(",")) {
					 String[] vars = tline.split(",");
					 for(String var : vars) {
						 String tvar = var.trim();
						 if(tvar.contains("private") || tvar.contains("public")) {
							 String[] myvar = tvar.split(" ");
							 variableArray.add(myvar[2]);
							 
						 }
						 else if(tline.contains(";")) {
							 String[] myvar = tvar.split(";");
							 variableArray.add(myvar[0]);
							 break;
						 }
						 else {
							 variableArray.add(tvar);
						 }
					 }

				 }
				 else {
				
					 String[] vars = tline.split(";");
					 for(String var : vars) {
						 String[] myvar = var.split(" ");
						 variableArray.add(myvar[2]);
					
						 break;
						 
					 }
				 }
			 }
		 }

		 for(int i =0 ; i < variableArray.size(); i++) {
		 if(myStatement.contains(variableArray.get(i))) {
		 
			
			 
				 variable = true;
				 continue;
				 
			 
		 }
		
		 }
		 return variable;
		 
		 
		 
	}
}