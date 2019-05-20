package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class SubjectLevel extends CodesItem {                                      
	private SubjectLevel(String code){super(CodesItem.subjectLevel,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.subjectLevel,code);                         
	}                                                                                   
	public static String getValue(SubjectLevel code){	                                
		return CodesItem.getValue(CodesItem.subjectLevel,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.subjectLevel);                           
	}                                                                                   
	public static final SubjectLevel getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.subjectLevel);                         
		return map==null?null:(SubjectLevel)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.subjectLevel);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new SubjectLevel(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.subjectLevel, map);                                
		mapCodeObject.put(CodesItem.subjectLevel, map2);		                              
	}                                                                                   
/////////////////////////////////////////////////////////////////////////////////		
	public int hashCode(){return super.hashCode();}
	public boolean equals(Object obj)
	{
		if( obj instanceof CodesItem)
			return (this == obj);
		else
			return super.equals(obj);
	}
/////////////////////////////////////////////////////////////////////////////////    




	public static final SubjectLevel YiJi                                    		= getObject("01");
	public static final SubjectLevel ErJi                                    		= getObject("02");
}

