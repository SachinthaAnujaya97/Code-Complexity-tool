/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rahal Sandeepa
 */

public class SizeComplexityMeasuring {
    
    Controller ctl = new Controller();
    
    /*CS= Complexity of a program statement due to its size
    Wkw = Weight due to keywords or reserved words (class, public, void, true, else, default, return, null, break, this, etc.)
    Nkw = Number of keywords or reserved words in the program statement
    Wid = Weight due to identifiers (names of classes, methods, objects, variables, arguments, and data structures)
    Nid = Number of identifiers in the program statement
    Wop = Weight due to operators
    Nop = Number of operators in the program statement
    Wnv = Weight due to numerical values or numbers
    Nnv = Number of numerical values in the program statement
    Wsl = Weight due to string literals (“ ” ,“Hi”, “Hello World”, “The factorial value of the entered number is”)
    Nsl = Number of string literals in the program statement  */
    
    int Cs,Wkw,Nkw,Wid,Nid,Wop,Nop,Wnv,Nnv,Wsl,Nsl;
    boolean flag = false;
    ArrayList<String> var = new ArrayList<>();
    ArrayList<String> returnValues = new ArrayList<>();
    String [] keywordArray = ctl.getKeywords();
    String [] OperatorArray = ctl.getLogical();
    String [] identifierArray = ctl.getIndentifiers();
    String [] relationArray = ctl.getRelation();
    String [] numberArray = ctl.getNumbers();
    
    public ArrayList<String> SizeComplexityInitializer(String filepath) throws IOException, Exception
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        
        String CurrentLine,line;
		while((line = br.readLine())!= null)
                {
                    
                    CurrentLine=line;
//                    
                    findToken(CurrentLine,1);
//                    
                }
                
                returnValues.add(Integer.toString(Wkw));
                returnValues.add(Integer.toString(Nkw));
                returnValues.add(Integer.toString(Wid));
                returnValues.add(Integer.toString(Nid));
                returnValues.add(Integer.toString(Wop));
                returnValues.add(Integer.toString(Nop));
                returnValues.add(Integer.toString(Wnv));
                returnValues.add(Integer.toString(Nnv));
                returnValues.add(Integer.toString(Wsl));
                returnValues.add(Integer.toString(Nsl));
                
                return returnValues;
    }
    
    public ArrayList<String> SizeComplexityInitializerCPP(String filepath) throws IOException, Exception
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        
        String CurrentLine,line;
		while((line = br.readLine())!= null)
                {
                    
                    CurrentLine=line;
//                    
                    findToken(CurrentLine,1);
//                    
                }
                
                returnValues.add(Integer.toString(Wkw));
                returnValues.add(Integer.toString(Nkw));
                returnValues.add(Integer.toString(Wid));
                returnValues.add(Integer.toString(Nid));
                returnValues.add(Integer.toString(Wop));
                returnValues.add(Integer.toString(Nop));
                returnValues.add(Integer.toString(Wnv));
                returnValues.add(Integer.toString(Nnv));
                returnValues.add(Integer.toString(Wsl));
                returnValues.add(Integer.toString(Nsl));
                
                return returnValues;
    }
    
    public void findToken(String line, int val)
    {
        
            //String [] crrline = Currtinline.split(" ");
            //StringTokenizer token = new StringTokenizer(Currtinline);
            
       
            if(line.contains("int") 
					|| line.contains("byte") 
					||line.contains("short")
					|| line.contains("long")
					|| line.contains("float"))
            {
                String[] words = line.split(" ");
                for (String word : words)
                {
                    for(int i=0; i<keywordArray.length; i++)
                    {
                        if(keywordArray[i].equals(word))
                        {
                            Wkw++;
                            Nkw++;
                        }
                    }
                }
            }
        
        
       
            if (line.contains("(") || line.contains(";"))
            {
                String[] words = line.split(" ");
                
                for (String word : words)
                {
                    for(int i=0; i<identifierArray.length; i++)
                    {
                        if(identifierArray[i].equals(word))
                        {
                            Wid++;
                            Nid++;
                        }
                    }
                }
            }
        
        
       
            if((line.contains("=") 
					|| line.contains("+") 
					||line.contains("-")
					|| line.contains("/")
					|| line.contains("*") 
					|| line.contains("%") 
					|| line.contains("++")
					|| line.contains("--")
					|| line.contains("==")
					|| line.contains("!>")	
					|| line.contains("<")	
					|| line.contains(">")	
					|| line.contains("<=")
					|| line.contains(">=")
					|| line.contains("&&")
					|| line.contains("||")
					|| line.contains(",")
					|| line.contains(".")))
            {
                String[] words = line.split(" ");
                
                for (String word : words)
                {
                    for( int i=0; i<relationArray.length; i++)
                    {
                        if(relationArray[i].equals(word))
                        {
                            Wop++;
                            Nop++;
                        }
                    }
                }
            }
        
        
      
            if (line.contains("0") 
					|| line.contains("1") 
					||line.contains("2")
					|| line.contains("3")
					|| line.contains("4") 
					|| line.contains("5") 
					|| line.contains("6")
					|| line.contains("7")
					|| line.contains("8")
					|| line.contains("9")) 
            {
                String[] words = line.split(" ");
                
                for(String word : words)
                {
                    for (int i = 0; i < numberArray.length; i++)
                    {
                        if(numberArray[i].equals(word))
                        {
                            Wnv++;
                            Nnv++;
                        }
                    }
                }
                
            }
        
       
            String tline = line.trim();
            
            if(getMethod(tline) != null)
            {
                Wsl++;
                Nsl++;
            }
        
        
        System.out.println(Wsl);
//            while(token.hasMoreTokens())
//            {
//                String word = token.nextToken();
//                for(int j = 0; j < keywordArray.length; j++)
//                {
//                    if(word.equals(keywordArray[j]))
//                    {
//                        Wkw++;
//                        Nkw++;
//                    }
//                }
//                if(word.equals("class"))
//                {
//                    Wid++;
//                    Nid++;
//                }
//
//
//                for (String OperatorArray1 : OperatorArray) 
//                {
//                    if (word.equals(OperatorArray1)) {
//                        Wop++;
//                        Nop++;
//                    }
//                }
//                
//                if(word.equals("[0-9]*"))
//                {
//                    Wnv++;
//                    Nnv++;
//                }
//                
//                if(word.equals("String"))
//                {
//                    Wsl++;
//                    Nsl++;
//                }
//
//            }
        
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
    
}
