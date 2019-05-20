package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class BillTempStatus extends CodesItem {                                      
	private BillTempStatus(String code){super(CodesItem.billTempStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.billTempStatus,code);                         
	}                                                                                   
	public static String getValue(BillTempStatus code){	                                
		return CodesItem.getValue(CodesItem.billTempStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.billTempStatus);                           
	}                                                                                   
	public static final BillTempStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.billTempStatus);                         
		return map==null?null:(BillTempStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.billTempStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new BillTempStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.billTempStatus, map);                                
		mapCodeObject.put(CodesItem.billTempStatus, map2);		                              
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




	public static final BillTempStatus JianDan                                 		= getObject("01");
	public static final BillTempStatus FuHe                                    		= getObject("02");
	public static final BillTempStatus FaBu                                    		= getObject("03");
	public static final BillTempStatus GengXin                                 		= getObject("04");
	public static final BillTempStatus FeiQi                                   		= getObject("00");
}

