package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CspFeeType extends CodesItem {                                      
	private CspFeeType(String code){super(CodesItem.cspFeeType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.cspFeeType,code);                         
	}                                                                                   
	public static String getValue(CspFeeType code){	                                
		return CodesItem.getValue(CodesItem.cspFeeType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.cspFeeType);                           
	}                                                                                   
	public static final CspFeeType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.cspFeeType);                         
		return map==null?null:(CspFeeType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.cspFeeType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CspFeeType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.cspFeeType, map);                                
		mapCodeObject.put(CodesItem.cspFeeType, map2);		                              
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




	public static final CspFeeType RuanJianShiYongFei                      		= getObject("00");
	public static final CspFeeType ShuJuGouMaiFei                          		= getObject("01");
	public static final CspFeeType ShuJuShangBaoFei                        		= getObject("02");
}

