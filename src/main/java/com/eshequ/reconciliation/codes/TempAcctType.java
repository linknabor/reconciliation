package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class TempAcctType extends CodesItem {                                      
	private TempAcctType(String code){super(CodesItem.tempAcctType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.tempAcctType,code);                         
	}                                                                                   
	public static String getValue(TempAcctType code){	                                
		return CodesItem.getValue(CodesItem.tempAcctType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.tempAcctType);                           
	}                                                                                   
	public static final TempAcctType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.tempAcctType);                         
		return map==null?null:(TempAcctType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.tempAcctType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new TempAcctType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.tempAcctType, map);                                
		mapCodeObject.put(CodesItem.tempAcctType, map2);		                              
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




	public static final TempAcctType LinShiTingCheFei                        		= getObject("01");
}

