package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class Frequency extends CodesItem {                                      
	private Frequency(String code){super(CodesItem.frequency,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.frequency,code);                         
	}                                                                                   
	public static String getValue(Frequency code){	                                
		return CodesItem.getValue(CodesItem.frequency,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.frequency);                           
	}                                                                                   
	public static final Frequency getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.frequency);                         
		return map==null?null:(Frequency)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.frequency);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new Frequency(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.frequency, map);                                
		mapCodeObject.put(CodesItem.frequency, map2);		                              
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




	public static final Frequency Ci                                      		= getObject("00");
	public static final Frequency Tian                                    		= getObject("01");
	public static final Frequency Zhou                                    		= getObject("02");
	public static final Frequency Yue                                     		= getObject("03");
	public static final Frequency JiDu                                    		= getObject("04");
	public static final Frequency Nian                                    		= getObject("05");
}

