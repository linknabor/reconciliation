package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class DeliveryStatus extends CodesItem {                                      
	private DeliveryStatus(String code){super(CodesItem.deliveryStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.deliveryStatus,code);                         
	}                                                                                   
	public static String getValue(DeliveryStatus code){	                                
		return CodesItem.getValue(CodesItem.deliveryStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.deliveryStatus);                           
	}                                                                                   
	public static final DeliveryStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.deliveryStatus);                         
		return map==null?null:(DeliveryStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.deliveryStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new DeliveryStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.deliveryStatus, map);                                
		mapCodeObject.put(CodesItem.deliveryStatus, map2);		                              
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




	public static final DeliveryStatus ZhengZaiTiShu                           		= getObject("0");
	public static final DeliveryStatus TiShuWancheng                           		= getObject("1");
	public static final DeliveryStatus TouDiWanCheng                           		= getObject("2");
	public static final DeliveryStatus TiShuShiBai                             		= getObject("3");
}

