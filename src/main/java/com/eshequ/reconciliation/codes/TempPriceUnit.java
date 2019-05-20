package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class TempPriceUnit extends CodesItem {                                      
	private TempPriceUnit(String code){super(CodesItem.tempPriceUnit,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.tempPriceUnit,code);                         
	}                                                                                   
	public static String getValue(TempPriceUnit code){	                                
		return CodesItem.getValue(CodesItem.tempPriceUnit,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.tempPriceUnit);                           
	}                                                                                   
	public static final TempPriceUnit getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.tempPriceUnit);                         
		return map==null?null:(TempPriceUnit)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.tempPriceUnit);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new TempPriceUnit(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.tempPriceUnit, map);                                
		mapCodeObject.put(CodesItem.tempPriceUnit, map2);		                              
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




	public static final TempPriceUnit BanXiaoShi                              		= getObject("00");
	public static final TempPriceUnit XiaoShi                                 		= getObject("01");
	public static final TempPriceUnit Tian                                    		= getObject("02");
	public static final TempPriceUnit Ci                                      		= getObject("03");
}

