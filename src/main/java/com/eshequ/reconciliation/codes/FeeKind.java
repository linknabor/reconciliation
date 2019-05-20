package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class FeeKind extends CodesItem {                                      
	private FeeKind(String code){super(CodesItem.feeKind,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.feeKind,code);                         
	}                                                                                   
	public static String getValue(FeeKind code){	                                
		return CodesItem.getValue(CodesItem.feeKind,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.feeKind);                           
	}                                                                                   
	public static final FeeKind getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.feeKind);                         
		return map==null?null:(FeeKind)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.feeKind);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new FeeKind(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.feeKind, map);                                
		mapCodeObject.put(CodesItem.feeKind, map2);		                              
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




	public static final FeeKind YingYeShouRu                            		= getObject("01");
	public static final FeeKind DaiShouYeZhuShouYi                      		= getObject("02");
	public static final FeeKind DaiShouGongGongShouYi                   		= getObject("03");
}

