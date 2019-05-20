package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class OperatorType extends CodesItem {                                      
	private OperatorType(String code){super(CodesItem.operatorType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.operatorType,code);                         
	}                                                                                   
	public static String getValue(OperatorType code){	                                
		return CodesItem.getValue(CodesItem.operatorType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.operatorType);                           
	}                                                                                   
	public static final OperatorType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.operatorType);                         
		return map==null?null:(OperatorType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.operatorType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new OperatorType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.operatorType, map);                                
		mapCodeObject.put(CodesItem.operatorType, map2);		                              
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




	public static final OperatorType DengLu                                  		= getObject("00");
	public static final OperatorType DengChu                                 		= getObject("99");
	public static final OperatorType XinZeng                                 		= getObject("01");
	public static final OperatorType XiuGai                                  		= getObject("02");
	public static final OperatorType ShanChu                                 		= getObject("03");
	public static final OperatorType ChaKan                                  		= getObject("04");
	public static final OperatorType XinJianGuanXi                           		= getObject("05");
	public static final OperatorType DuanKaiGuanXi                           		= getObject("06");
	public static final OperatorType GengHuanGuanXi                          		= getObject("07");
	public static final OperatorType ShenHe                                  		= getObject("08");
	public static final OperatorType FuHe                                    		= getObject("09");
	public static final OperatorType ShenHeTuiHui                            		= getObject("10");
	public static final OperatorType FuHeTuiHui                              		= getObject("11");
	public static final OperatorType CheXiaoShenHe                           		= getObject("12");
	public static final OperatorType ShuJuDaoRu                              		= getObject("13");
	public static final OperatorType YeWuChuanJian                           		= getObject("14");
	public static final OperatorType JiChuXinXiJiuCuo                        		= getObject("15");
}

