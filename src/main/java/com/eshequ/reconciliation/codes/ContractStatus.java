package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class ContractStatus extends CodesItem {                                      
	private ContractStatus(String code){super(CodesItem.contractStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.contractStatus,code);                         
	}                                                                                   
	public static String getValue(ContractStatus code){	                                
		return CodesItem.getValue(CodesItem.contractStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.contractStatus);                           
	}                                                                                   
	public static final ContractStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.contractStatus);                         
		return map==null?null:(ContractStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.contractStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new ContractStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.contractStatus, map);                                
		mapCodeObject.put(CodesItem.contractStatus, map2);		                              
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




	public static final ContractStatus ZhengChang                              		= getObject("01");
	public static final ContractStatus GuoQi                                   		= getObject("02");
	public static final ContractStatus FeiQi                                   		= getObject("03");
	public static final ContractStatus WeiShengXiao                            		= getObject("04");
}

