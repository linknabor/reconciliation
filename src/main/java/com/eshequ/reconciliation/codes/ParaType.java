package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class ParaType extends CodesItem {                                      
	private ParaType(String code){super(CodesItem.paraType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.paraType,code);                         
	}                                                                                   
	public static String getValue(ParaType code){	                                
		return CodesItem.getValue(CodesItem.paraType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.paraType);                           
	}                                                                                   
	public static final ParaType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.paraType);                         
		return map==null?null:(ParaType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.paraType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new ParaType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.paraType, map);                                
		mapCodeObject.put(CodesItem.paraType, map2);		                              
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




	public static final ParaType XiTongCanShu                            		= getObject("01");
	public static final ParaType YeWuCanShu                              		= getObject("02");
	public static final ParaType OnlinePay                               		= getObject("03");
}

