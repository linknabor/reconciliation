package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class ParkPayMethod extends CodesItem {                                      
	private ParkPayMethod(String code){super(CodesItem.parkPayMethod,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.parkPayMethod,code);                         
	}                                                                                   
	public static String getValue(ParkPayMethod code){	                                
		return CodesItem.getValue(CodesItem.parkPayMethod,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.parkPayMethod);                           
	}                                                                                   
	public static final ParkPayMethod getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.parkPayMethod);                         
		return map==null?null:(ParkPayMethod)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.parkPayMethod);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new ParkPayMethod(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.parkPayMethod, map);                                
		mapCodeObject.put(CodesItem.parkPayMethod, map2);		                              
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




	public static final ParkPayMethod XianJin                                 		= getObject("01");
	public static final ParkPayMethod WechatMicropay                          		= getObject("08");
	public static final ParkPayMethod AliPayMicropay                          		= getObject("09");
	public static final ParkPayMethod NotPay                                  		= getObject("00");
}

