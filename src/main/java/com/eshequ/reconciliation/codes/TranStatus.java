package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class TranStatus extends CodesItem {                                      
	private TranStatus(String code){super(CodesItem.tranStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.tranStatus,code);                         
	}                                                                                   
	public static String getValue(TranStatus code){	                                
		return CodesItem.getValue(CodesItem.tranStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.tranStatus);                           
	}                                                                                   
	public static final TranStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.tranStatus);                         
		return map==null?null:(TranStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.tranStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new TranStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.tranStatus, map);                                
		mapCodeObject.put(CodesItem.tranStatus, map2);		                              
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




	public static final TranStatus BianJi                                  		= getObject("00");
	public static final TranStatus JiaoYiWanCheng                          		= getObject("01");
	public static final TranStatus JiaoYiCheXiao                           		= getObject("02");
	public static final TranStatus DaiShenHe                               		= getObject("03");
	public static final TranStatus DaiFuHe                                 		= getObject("04");
	public static final TranStatus ZaiTu                                   		= getObject("05");
	public static final TranStatus ShenHeTuiHui                            		= getObject("06");
}

