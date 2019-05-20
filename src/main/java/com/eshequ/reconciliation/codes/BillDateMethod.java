package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class BillDateMethod extends CodesItem {                                      
	private BillDateMethod(String code){super(CodesItem.billDateMethod,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.billDateMethod,code);                         
	}                                                                                   
	public static String getValue(BillDateMethod code){	                                
		return CodesItem.getValue(CodesItem.billDateMethod,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.billDateMethod);                           
	}                                                                                   
	public static final BillDateMethod getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.billDateMethod);                         
		return map==null?null:(BillDateMethod)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.billDateMethod);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new BillDateMethod(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.billDateMethod, map);                                
		mapCodeObject.put(CodesItem.billDateMethod, map2);		                              
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




	public static final BillDateMethod AnShiJiRiQi                             		= getObject("0");
	public static final BillDateMethod AnZiRanRiQi                             		= getObject("1");
}

