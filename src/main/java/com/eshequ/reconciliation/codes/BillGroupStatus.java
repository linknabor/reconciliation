package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class BillGroupStatus extends CodesItem {                                      
	private BillGroupStatus(String code){super(CodesItem.billGroupStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.billGroupStatus,code);                         
	}                                                                                   
	public static String getValue(BillGroupStatus code){	                                
		return CodesItem.getValue(CodesItem.billGroupStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.billGroupStatus);                           
	}                                                                                   
	public static final BillGroupStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.billGroupStatus);                         
		return map==null?null:(BillGroupStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.billGroupStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new BillGroupStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.billGroupStatus, map);                                
		mapCodeObject.put(CodesItem.billGroupStatus, map2);		                              
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




	public static final BillGroupStatus JianDan                                 		= getObject("01");
	public static final BillGroupStatus FuHe                                    		= getObject("02");
	public static final BillGroupStatus FaBu                                    		= getObject("03");
	public static final BillGroupStatus FeiQi                                   		= getObject("00");
}

