package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class PayTranType extends CodesItem {                                      
	private PayTranType(String code){super(CodesItem.payTranType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.payTranType,code);                         
	}                                                                                   
	public static String getValue(PayTranType code){	                                
		return CodesItem.getValue(CodesItem.payTranType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.payTranType);                           
	}                                                                                   
	public static final PayTranType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.payTranType);                         
		return map==null?null:(PayTranType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.payTranType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new PayTranType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.payTranType, map);                                
		mapCodeObject.put(CodesItem.payTranType, map2);		                              
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




	public static final PayTranType BillPayTrade                            		= getObject("01");
	public static final PayTranType TempParkPayTrade                        		= getObject("02");
	public static final PayTranType OtherFeePayTrade                        		= getObject("03");
}

