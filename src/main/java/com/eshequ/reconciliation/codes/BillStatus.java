package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class BillStatus extends CodesItem {                                      
	private BillStatus(String code){super(CodesItem.billStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.billStatus,code);                         
	}                                                                                   
	public static String getValue(BillStatus code){	                                
		return CodesItem.getValue(CodesItem.billStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.billStatus);                           
	}                                                                                   
	public static final BillStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.billStatus);                         
		return map==null?null:(BillStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.billStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new BillStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.billStatus, map);                                
		mapCodeObject.put(CodesItem.billStatus, map2);		                              
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




	public static final BillStatus FaBu                                    		= getObject("01");
	public static final BillStatus ShouKuan                                		= getObject("02");
	public static final BillStatus QingFen                                 		= getObject("03");
	public static final BillStatus JieZhang                                		= getObject("04");
	public static final BillStatus FeiQi                                   		= getObject("00");
}

