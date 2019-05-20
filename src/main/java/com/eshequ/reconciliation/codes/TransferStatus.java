package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class TransferStatus extends CodesItem {                                      
	private TransferStatus(String code){super(CodesItem.transferStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.transferStatus,code);                         
	}                                                                                   
	public static String getValue(TransferStatus code){	                                
		return CodesItem.getValue(CodesItem.transferStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.transferStatus);                           
	}                                                                                   
	public static final TransferStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.transferStatus);                         
		return map==null?null:(TransferStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.transferStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new TransferStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.transferStatus, map);                                
		mapCodeObject.put(CodesItem.transferStatus, map2);		                              
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




	public static final TransferStatus ZaiTu                                   		= getObject("00");
	public static final TransferStatus WanCheng                                		= getObject("01");
	public static final TransferStatus ShiBai                                  		= getObject("02");
	public static final TransferStatus FeiQi                                   		= getObject("03");
}

