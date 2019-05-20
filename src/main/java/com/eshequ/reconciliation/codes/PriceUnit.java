package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class PriceUnit extends CodesItem {                                      
	private PriceUnit(String code){super(CodesItem.priceUnit,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.priceUnit,code);                         
	}                                                                                   
	public static String getValue(PriceUnit code){	                                
		return CodesItem.getValue(CodesItem.priceUnit,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.priceUnit);                           
	}                                                                                   
	public static final PriceUnit getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.priceUnit);                         
		return map==null?null:(PriceUnit)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.priceUnit);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new PriceUnit(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.priceUnit, map);                                
		mapCodeObject.put(CodesItem.priceUnit, map2);		                              
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




	public static final PriceUnit Tian                                    		= getObject("01");
	public static final PriceUnit Yue                                     		= getObject("02");
	public static final PriceUnit Ji                                      		= getObject("03");
	public static final PriceUnit Nian                                    		= getObject("04");
}

