package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class MeterBillType extends CodesItem {                                      
	private MeterBillType(String code){super(CodesItem.meterBillType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.meterBillType,code);                         
	}                                                                                   
	public static String getValue(MeterBillType code){	                                
		return CodesItem.getValue(CodesItem.meterBillType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.meterBillType);                           
	}                                                                                   
	public static final MeterBillType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.meterBillType);                         
		return map==null?null:(MeterBillType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.meterBillType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new MeterBillType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.meterBillType, map);                                
		mapCodeObject.put(CodesItem.meterBillType, map2);		                              
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




	public static final MeterBillType FenBiaoJiShuZhangDan                    		= getObject("01");
	public static final MeterBillType ZongBiaoFenTanZhangDan                  		= getObject("02");
	public static final MeterBillType GongTanFeiYongZhangDan                  		= getObject("03");
}

