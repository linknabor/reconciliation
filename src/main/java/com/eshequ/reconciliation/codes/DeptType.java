package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class DeptType extends CodesItem {                                      
	private DeptType(String code){super(CodesItem.deptType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.deptType,code);                         
	}                                                                                   
	public static String getValue(DeptType code){	                                
		return CodesItem.getValue(CodesItem.deptType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.deptType);                           
	}                                                                                   
	public static final DeptType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.deptType);                         
		return map==null?null:(DeptType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.deptType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new DeptType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.deptType, map);                                
		mapCodeObject.put(CodesItem.deptType, map2);		                              
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




	public static final DeptType ShiJu                                   		= getObject("80");
	public static final DeptType QuJu                                    		= getObject("81");
	public static final DeptType KaiFaShang                              		= getObject("82");
	public static final DeptType YeZhuDaHui                              		= getObject("83");
	public static final DeptType WuYeGongSi                              		= getObject("84");
	public static final DeptType QiTaXiangGuanDanWei                     		= getObject("85");
	public static final DeptType ShenJiaDanWei                           		= getObject("86");
	public static final DeptType JianLiDanWei                            		= getObject("87");
	public static final DeptType JuWeiHui                                		= getObject("88");
	public static final DeptType WeiXiuDanWei                            		= getObject("89");
	public static final DeptType YinHangFenZhiJiGou                      		= getObject("90");
	public static final DeptType QiangXiuZhongXin                        		= getObject("91");
	public static final DeptType FangGuanZhan                            		= getObject("92");
}

