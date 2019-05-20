package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class AcctMethod extends CodesItem {                                      
	private AcctMethod(String code){super(CodesItem.acctMethod,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.acctMethod,code);                         
	}                                                                                   
	public static String getValue(AcctMethod code){	                                
		return CodesItem.getValue(CodesItem.acctMethod,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.acctMethod);                           
	}                                                                                   
	public static final AcctMethod getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.acctMethod);                         
		return map==null?null:(AcctMethod)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.acctMethod);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new AcctMethod(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.acctMethod, map);                                
		mapCodeObject.put(CodesItem.acctMethod, map2);		                              
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




	public static final AcctMethod ZhangDan                                		= getObject("01");
	public static final AcctMethod KuaiJie                                 		= getObject("02");
}

