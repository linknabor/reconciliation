package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class FeeType extends CodesItem {                                      
	private FeeType(String code){super(CodesItem.feeType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.feeType,code);                         
	}                                                                                   
	public static String getValue(FeeType code){	                                
		return CodesItem.getValue(CodesItem.feeType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.feeType);                           
	}                                                                                   
	public static final FeeType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.feeType);                         
		return map==null?null:(FeeType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.feeType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new FeeType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.feeType, map);                                
		mapCodeObject.put(CodesItem.feeType, map2);		                              
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




	public static final FeeType WuYeGuanLiFei                           		= getObject("01");
	public static final FeeType GuDingCheWeiTingCheFei                  		= getObject("02");
	public static final FeeType GongGongCheWeiTinCheFei                 		= getObject("03");
	public static final FeeType DianTiShuiBengYunXingFei                		= getObject("04");
	public static final FeeType BaoJieFuWuFei                           		= getObject("05");
	public static final FeeType BaoAnFuWuFei                            		= getObject("06");
	public static final FeeType LinShiTingCheFei                        		= getObject("07");
	public static final FeeType FangJianZuJin                           		= getObject("08");
	public static final FeeType ShangPuZuJin                            		= getObject("09");
	public static final FeeType CheWeiZuJin                             		= getObject("10");
	public static final FeeType GuangGaoWeiZuJin                        		= getObject("11");
	public static final FeeType DianFei                                 		= getObject("12");
	public static final FeeType ShuiFei                                 		= getObject("13");
	public static final FeeType RanQiFei                                		= getObject("14");
	public static final FeeType DiMianGuDingCheWeiTingCheFei            		= getObject("15");
	public static final FeeType ShiNeiGongGongCheWeiTinCheFei           		= getObject("16");
	public static final FeeType DiXiaShiZuJin                           		= getObject("17");
	public static final FeeType QiTaShouRu                              		= getObject("99");
}

