package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class Degree extends CodesItem {                                      
	private Degree(String code){super(CodesItem.degree,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.degree,code);                         
	}                                                                                   
	public static String getValue(Degree code){	                                
		return CodesItem.getValue(CodesItem.degree,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.degree);                           
	}                                                                                   
	public static final Degree getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.degree);                         
		return map==null?null:(Degree)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.degree);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new Degree(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.degree, map);                                
		mapCodeObject.put(CodesItem.degree, map2);		                              
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




	public static final Degree XiaoXue                                 		= getObject("01");
	public static final Degree ChuZhong                                		= getObject("02");
	public static final Degree GaoZhong                                		= getObject("03");
	public static final Degree DaZhuan                                 		= getObject("04");
	public static final Degree BenKe                                   		= getObject("05");
	public static final Degree ShuoShi                                 		= getObject("06");
	public static final Degree BoShi                                   		= getObject("07");
	public static final Degree BoShiHou                                		= getObject("08");
	public static final Degree ZhongZhuan                              		= getObject("09");
	public static final Degree ZhiXiao                                 		= getObject("10");
	public static final Degree JiXiao                                  		= getObject("11");
	public static final Degree ZhiGao                                  		= getObject("12");
	public static final Degree GaoZhi                                  		= getObject("13");
	public static final Degree QiTa                                    		= getObject("99");
}

