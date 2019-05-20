package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class Year extends CodesItem {                                      
	private Year(String code){super(CodesItem.year,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.year,code);                         
	}                                                                                   
	public static String getValue(Year code){	                                
		return CodesItem.getValue(CodesItem.year,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.year);                           
	}                                                                                   
	public static final Year getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.year);                         
		return map==null?null:(Year)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.year);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new Year(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.year, map);                                
		mapCodeObject.put(CodesItem.year, map2);		                              
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




	public static final Year Year1991                                		= getObject("1991");
	public static final Year Year1992                                		= getObject("1992");
	public static final Year Year1993                                		= getObject("1993");
	public static final Year Year1994                                		= getObject("1994");
	public static final Year Year1995                                		= getObject("1995");
	public static final Year Year1996                                		= getObject("1996");
	public static final Year Year1997                                		= getObject("1997");
	public static final Year Year1998                                		= getObject("1998");
	public static final Year Year1999                                		= getObject("1999");
	public static final Year Year2000                                		= getObject("2000");
	public static final Year Year2001                                		= getObject("2001");
	public static final Year Year2002                                		= getObject("2002");
	public static final Year Year2003                                		= getObject("2003");
	public static final Year Year2004                                		= getObject("2004");
	public static final Year Year2005                                		= getObject("2005");
	public static final Year Year2006                                		= getObject("2006");
	public static final Year Year2007                                		= getObject("2007");
	public static final Year Year2008                                		= getObject("2008");
	public static final Year Year2009                                		= getObject("2009");
	public static final Year Year2010                                		= getObject("2010");
	public static final Year Year2011                                		= getObject("2011");
	public static final Year Year2012                                		= getObject("2012");
	public static final Year Year2013                                		= getObject("2013");
	public static final Year Year2014                                		= getObject("2014");
	public static final Year Year2015                                		= getObject("2015");
	public static final Year Year2016                                		= getObject("2016");
	public static final Year Year2017                                		= getObject("2017");
	public static final Year Year2018                                		= getObject("2018");
	public static final Year Year2019                                		= getObject("2019");
	public static final Year Year2020                                		= getObject("2020");
	public static final Year Year2021                                		= getObject("2021");
	public static final Year Year2022                                		= getObject("2022");
	public static final Year Year2023                                		= getObject("2023");
	public static final Year Year2024                                		= getObject("2024");
	public static final Year Year2025                                		= getObject("2025");
	public static final Year Year2026                                		= getObject("2026");
	public static final Year Year2027                                		= getObject("2027");
	public static final Year Year2028                                		= getObject("2028");
	public static final Year Year2029                                		= getObject("2029");
	public static final Year Year2030                                		= getObject("2030");
}

