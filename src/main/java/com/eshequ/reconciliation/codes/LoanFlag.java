package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class LoanFlag extends CodesItem {                                      
	private LoanFlag(String code){super(CodesItem.loanFlag,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.loanFlag,code);                         
	}                                                                                   
	public static String getValue(LoanFlag code){	                                
		return CodesItem.getValue(CodesItem.loanFlag,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.loanFlag);                           
	}                                                                                   
	public static final LoanFlag getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.loanFlag);                         
		return map==null?null:(LoanFlag)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.loanFlag);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new LoanFlag(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.loanFlag, map);                                
		mapCodeObject.put(CodesItem.loanFlag, map2);		                              
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




	public static final LoanFlag JieFang                                 		= getObject("1");
	public static final LoanFlag DaiFang                                 		= getObject("2");
}

