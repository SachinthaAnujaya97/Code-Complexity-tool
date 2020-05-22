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
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Lasan main project git hub dapuu
 */
public class ControlComplexity {
    
    ArrayList<String> returnValues = new ArrayList<>();
    Controller ctrl = new Controller();
    
    int Wtcs,NC,Ccspps;
    String [] controlStructs = ctrl.getControlStucts();
    
    public ControlComplexity() {
    }
    
    public ArrayList<String> ControlComplexityInitializer(String filepath) throws FileNotFoundException, IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        String CurrentLine , line;
        
        while((line = br.readLine())!= null)
                {
                    
                    CurrentLine=line;                   
                    findToken(CurrentLine,1);
                    
                }
        returnValues.add(Integer.toString(Wtcs));
        returnValues.add(Integer.toString(NC));
        returnValues.add(Integer.toString(Ccspps));
        
        return returnValues;
    }
    
    public ArrayList<String> ControlComplexityInitializerCPP(String filepath) throws FileNotFoundException, IOException
    {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        String CurrentLine , line;
        
        while((line = br.readLine())!= null)
                {
                    
                    CurrentLine=line;                   
                    findToken(CurrentLine,1);
                    
                }
        returnValues.add(Integer.toString(Wtcs));
        returnValues.add(Integer.toString(NC));
        returnValues.add(Integer.toString(Ccspps));
        
        return returnValues;
    }
    
    public void findToken(String line, int i)
    {
//        StringTokenizer token = new StringTokenizer(CurrentLine);
//        
//        while(token.hasMoreTokens())
//        {
//            String word = token.nextToken();
//            
//            for (String controlStruct : controlStructs) 
//            {
//                if(word.equals(controlStruct))
//                {
//                    if((word.equals("if"))||(word.equals("else")))
//                    {
//                        if(Wtcs!=0)
//                        {
//                            Ccspps++;
//                        }
//                        Wtcs = Wtcs + 2;
//                        NC++;
//                    }
//                    else if((word.equals("for"))||(word.equals("while"))||(word.equals("do")))
//                    {
//                        if(Wtcs!=0)
//                        {
//                            Ccspps++;
//                        }
//                        Wtcs = Wtcs + 3;
//                        NC++;
//                    }
//                    else if(word.equals("switch"))
//                    {
//                        if(Wtcs!=0)
//                        {
//                            Ccspps++;
//                        }
//                        Wtcs = Wtcs + 2;
//                        NC++;
//                    }
//                    else if(word.equals(("case")))
//                    {
//                        if(Wtcs!=0)
//                        {
//                            Ccspps++;
//                        }
//                        Wtcs = Wtcs + 1;
//                        NC++;
//                    }
//                }
//            }
//        }
        
			
				
				String tline = line;
				
				
					if(tline.contains("if") && (hasaBracket(tline,"if",2,0)) || tline.contains("else if") && (hasaBracket(tline,"else if",7,0)) || tline.contains("switch") && (hasaBracket(tline,"switch",6,0)) ) {						
						Wtcs = Wtcs + 2;
						NC++;
						
					}
					
					else if(tline.contains("do") && (forDoMEthod(tline,"do",2,0)) || tline.contains("while") && (hasaBracket(tline,"while",5,0)) ||  tline.contains("for") && (hasaBracket(tline,"for",3,0))) {					
						Wtcs = Wtcs + 2;
						NC++;
						
					}
					
					else if(tline.contains("case") && (hasaColon(tline,"case",4,0))) {
						Wtcs = Wtcs + 2;
						NC++;
						
					}
					
					else {
						Wtcs++;
						NC++;
					}
				
				
    }
    
    public static boolean hasaBracket(String line,String text,int size, int gap){
	        boolean val = false;
	        if(line.length()>(line.indexOf(text)+size+gap)){
                    switch (line.charAt(line.indexOf(text)+size+gap)) {
                        case '(':
                            val = true;
                            break;
                        case ' ':
                            gap = gap + 1;
                            return hasaBracket(line,text, size, gap);
                        default:
                            val = false;
                            break;
                    }
	        }
	        return val;
	    }
		
		public static boolean hasaSpace(String line,String text,int size, int gap){
	        boolean val = false;
	        if(line.length()>(line.indexOf(text)+size+gap)){
	            if(line.charAt(line.indexOf(text)+size+gap)==' '){
	                val = true;  
	            }    
	            else if(line.charAt(line.indexOf(text)+size+gap)==' '){
	                gap = gap + 1;
	                return hasaBracket(line,text, size, gap);     
	            }
	            else{
	                val = false;  
	            }
	        }
	        return val;
	    }
		
		public static boolean forDoMEthod(String line,String text,int size, int gap){
	        boolean val = true;
	        if(line.length()>(line.indexOf(text)+size+gap)){
	            if(line.charAt(line.indexOf(text)+size+gap)==' '){
	                val = true;  
	                gap = gap + 1;
	                return forDoMEthod(line,text, size, gap);     
	            }
	            else{
	                val = false;  
	            }
	        }
	        return val;
	    }
		
		public static boolean hasaColon(String line,String text,int size, int gap){
	        boolean val = false;
	        if(line.length()>(line.indexOf(text)+size+gap)){
                    switch (line.charAt(line.indexOf(text)+size+gap)) {
                        case ':':
                            val = true;
                            break;
                        case ' ':
                            gap = gap + 1;
                            return hasaBracket(line,text, size, gap);
                        default:
                            val = false;
                            break;
                    }
	        }
	        return val;
	    }
}
