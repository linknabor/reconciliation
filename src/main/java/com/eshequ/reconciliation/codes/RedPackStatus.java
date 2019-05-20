package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class RedPackStatus extends CodesItem {                                      
	private RedPackStatus(String code){super(CodesItem.redPackStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.redPackStatus,code);                         
	}                                                                                   
	public static String getValue(RedPackStatus code){	                                
		return CodesItem.getValue(CodesItem.redPackStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.redPackStatus);                           
	}                                                                                   
	public static final RedPackStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.redPackStatus);                         
		return map==null?null:(RedPackStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.redPackStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new RedPackStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.redPackStatus, map);                                
		mapCodeObject.put(CodesItem.redPackStatus, map2);		                              
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




	public static final RedPackStatus FaSongZhong                             		= getObject("00");
	public static final RedPackStatus DaiLingQu                               		= getObject("01");
	public static final RedPackStatus FaFangShiBai                            		= getObject("02");
	public static final RedPackStatus YiLingQu                                		= getObject("03");
	public static final RedPackStatus YiTuiKuan                               		= getObject("04");
}

