package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class BillSource extends CodesItem {                                      
	private BillSource(String code){super(CodesItem.billSource,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.billSource,code);                         
	}                                                                                   
	public static String getValue(BillSource code){	                                
		return CodesItem.getValue(CodesItem.billSource,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.billSource);                           
	}                                                                                   
	public static final BillSource getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.billSource);                         
		return map==null?null:(BillSource)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.billSource);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new BillSource(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.billSource, map);                                
		mapCodeObject.put(CodesItem.billSource, map2);		                              
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




	public static final BillSource XiTongShengCheng                        		= getObject("01");
	public static final BillSource JiZhangShengCheng                       		= getObject("02");
}

