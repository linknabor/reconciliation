package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class AdjustFlag extends CodesItem {                                      
	private AdjustFlag(String code){super(CodesItem.adjustFlag,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.adjustFlag,code);                         
	}                                                                                   
	public static String getValue(AdjustFlag code){	                                
		return CodesItem.getValue(CodesItem.adjustFlag,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.adjustFlag);                           
	}                                                                                   
	public static final AdjustFlag getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.adjustFlag);                         
		return map==null?null:(AdjustFlag)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.adjustFlag);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new AdjustFlag(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.adjustFlag, map);                                
		mapCodeObject.put(CodesItem.adjustFlag, map2);		                              
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




	public static final AdjustFlag ZhangJia                                		= getObject("01");
	public static final AdjustFlag DieJia                                  		= getObject("02");
}

