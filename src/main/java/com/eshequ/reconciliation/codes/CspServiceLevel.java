package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CspServiceLevel extends CodesItem {                                      
	private CspServiceLevel(String code){super(CodesItem.cspServiceLevel,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.cspServiceLevel,code);                         
	}                                                                                   
	public static String getValue(CspServiceLevel code){	                                
		return CodesItem.getValue(CodesItem.cspServiceLevel,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.cspServiceLevel);                           
	}                                                                                   
	public static final CspServiceLevel getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.cspServiceLevel);                         
		return map==null?null:(CspServiceLevel)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.cspServiceLevel);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CspServiceLevel(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.cspServiceLevel, map);                                
		mapCodeObject.put(CodesItem.cspServiceLevel, map2);		                              
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




	public static final CspServiceLevel YiJi                                    		= getObject("01");
	public static final CspServiceLevel ErJi                                    		= getObject("02");
	public static final CspServiceLevel SanJi                                   		= getObject("03");
	public static final CspServiceLevel SiJi                                    		= getObject("04");
	public static final CspServiceLevel WuJi                                    		= getObject("05");
	public static final CspServiceLevel LiuJi                                   		= getObject("06");
	public static final CspServiceLevel QiJi                                    		= getObject("07");
}

