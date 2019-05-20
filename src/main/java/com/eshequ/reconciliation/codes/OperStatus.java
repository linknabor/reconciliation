package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class OperStatus extends CodesItem {                                      
	private OperStatus(String code){super(CodesItem.operStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.operStatus,code);                         
	}                                                                                   
	public static String getValue(OperStatus code){	                                
		return CodesItem.getValue(CodesItem.operStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.operStatus);                           
	}                                                                                   
	public static final OperStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.operStatus);                         
		return map==null?null:(OperStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.operStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new OperStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.operStatus, map);                                
		mapCodeObject.put(CodesItem.operStatus, map2);		                              
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




	public static final OperStatus ZhengChangShiYong                       		= getObject("1");
	public static final OperStatus ZanTingShiYong                          		= getObject("2");
	public static final OperStatus ZhengZaiShiYong                         		= getObject("3");
	public static final OperStatus ZhuXiao                                 		= getObject("4");
}

