package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class BizStatus extends CodesItem {                                      
	private BizStatus(String code){super(CodesItem.bizStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.bizStatus,code);                         
	}                                                                                   
	public static String getValue(BizStatus code){	                                
		return CodesItem.getValue(CodesItem.bizStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.bizStatus);                           
	}                                                                                   
	public static final BizStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.bizStatus);                         
		return map==null?null:(BizStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.bizStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new BizStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.bizStatus, map);                                
		mapCodeObject.put(CodesItem.bizStatus, map2);		                              
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




	public static final BizStatus DaiShenHe                               		= getObject("01");
	public static final BizStatus DaiFuHe                                 		= getObject("02");
	public static final BizStatus DaiShenPi                               		= getObject("03");
	public static final BizStatus WanCheng                                		= getObject("00");
	public static final BizStatus ShiBai                                  		= getObject("99");
}

