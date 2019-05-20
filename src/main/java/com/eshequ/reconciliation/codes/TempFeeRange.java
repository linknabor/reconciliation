package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class TempFeeRange extends CodesItem {                                      
	private TempFeeRange(String code){super(CodesItem.tempFeeRange,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.tempFeeRange,code);                         
	}                                                                                   
	public static String getValue(TempFeeRange code){	                                
		return CodesItem.getValue(CodesItem.tempFeeRange,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.tempFeeRange);                           
	}                                                                                   
	public static final TempFeeRange getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.tempFeeRange);                         
		return map==null?null:(TempFeeRange)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.tempFeeRange);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new TempFeeRange(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.tempFeeRange, map);                                
		mapCodeObject.put(CodesItem.tempFeeRange, map2);		                              
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




	public static final TempFeeRange QuanTian                                		= getObject("0");
	public static final TempFeeRange BaiTian                                 		= getObject("1");
	public static final TempFeeRange GuoYe                                   		= getObject("2");
}

