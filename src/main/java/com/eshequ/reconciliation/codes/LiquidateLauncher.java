package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class LiquidateLauncher extends CodesItem {                                      
	private LiquidateLauncher(String code){super(CodesItem.liquidateLauncher,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.liquidateLauncher,code);                         
	}                                                                                   
	public static String getValue(LiquidateLauncher code){	                                
		return CodesItem.getValue(CodesItem.liquidateLauncher,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.liquidateLauncher);                           
	}                                                                                   
	public static final LiquidateLauncher getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.liquidateLauncher);                         
		return map==null?null:(LiquidateLauncher)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.liquidateLauncher);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new LiquidateLauncher(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.liquidateLauncher, map);                                
		mapCodeObject.put(CodesItem.liquidateLauncher, map2);		                              
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




	public static final LiquidateLauncher QuDaoQingSuan                           		= getObject("0");
	public static final LiquidateLauncher YunYingFangQingSuan                     		= getObject("1");
}

