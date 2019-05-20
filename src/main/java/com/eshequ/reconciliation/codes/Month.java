package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class Month extends CodesItem {                                      
	private Month(String code){super(CodesItem.month,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.month,code);                         
	}                                                                                   
	public static String getValue(Month code){	                                
		return CodesItem.getValue(CodesItem.month,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.month);                           
	}                                                                                   
	public static final Month getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.month);                         
		return map==null?null:(Month)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.month);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new Month(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.month, map);                                
		mapCodeObject.put(CodesItem.month, map2);		                              
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




	public static final Month YiYue                                   		= getObject("01");
	public static final Month ErYue                                   		= getObject("02");
	public static final Month SanYue                                  		= getObject("03");
	public static final Month SiYue                                   		= getObject("04");
	public static final Month WuYue                                   		= getObject("05");
	public static final Month LiuYue                                  		= getObject("06");
	public static final Month QiYue                                   		= getObject("07");
	public static final Month BaYue                                   		= getObject("08");
	public static final Month JiuYue                                  		= getObject("09");
	public static final Month ShiYue                                  		= getObject("10");
	public static final Month ShiYiYue                                		= getObject("11");
	public static final Month ShiErYue                                		= getObject("12");
}

