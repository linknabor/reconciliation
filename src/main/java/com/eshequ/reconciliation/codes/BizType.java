package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class BizType extends CodesItem {                                      
	private BizType(String code){super(CodesItem.bizType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.bizType,code);                         
	}                                                                                   
	public static String getValue(BizType code){	                                
		return CodesItem.getValue(CodesItem.bizType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.bizType);                           
	}                                                                                   
	public static final BizType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.bizType);                         
		return map==null?null:(BizType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.bizType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new BizType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.bizType, map);                                
		mapCodeObject.put(CodesItem.bizType, map2);		                              
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




	public static final BizType XiangMuShouFei                          		= getObject("01");
	public static final BizType DaiShouZuJin                            		= getObject("02");
	public static final BizType LinShiShouFei                           		= getObject("03");
	public static final BizType YeWeiHuiJiZhang                         		= getObject("04");
	public static final BizType JiChuXinXiJiuCuo                        		= getObject("05");
	public static final BizType ChaoBiaoShouFei                         		= getObject("06");
	public static final BizType KuCunGuanLi                             		= getObject("07");
	public static final BizType ZhiChuJiZhang                           		= getObject("08");
	public static final BizType QiTaShouRu                              		= getObject("09");
}

