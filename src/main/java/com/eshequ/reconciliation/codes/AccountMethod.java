package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class AccountMethod extends CodesItem {                                      
	private AccountMethod(String code){super(CodesItem.accountMethod,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.accountMethod,code);                         
	}                                                                                   
	public static String getValue(AccountMethod code){	                                
		return CodesItem.getValue(CodesItem.accountMethod,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.accountMethod);                           
	}                                                                                   
	public static final AccountMethod getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.accountMethod);                         
		return map==null?null:(AccountMethod)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.accountMethod);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new AccountMethod(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.accountMethod, map);                                
		mapCodeObject.put(CodesItem.accountMethod, map2);		                              
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




	public static final AccountMethod XianJin                                 		= getObject("01");
	public static final AccountMethod ZhuanZhang                              		= getObject("02");
}

