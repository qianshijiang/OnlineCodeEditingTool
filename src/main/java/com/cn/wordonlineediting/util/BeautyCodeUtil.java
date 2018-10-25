package com.cn.wordonlineediting.util;

/**
 * @author qsj
 * @date 2018-1-26
 * @describe 美化代码工具类
 */
public class BeautyCodeUtil {

	public static String beautyCode(String code,Integer tabtype){
		try{
			StringBuffer sb = new StringBuffer();
			char key; //字符
		    int number = 0;//缩进控制
		    switch(tabtype){ //按类型控制空格数量
			  case 1:
				  number = 4;
				  break;
			  case 2:
				  number = 2;
				  break;
			  case 4:
				  number = 4;
				  break;
			  case 8:
				  number = 8;
				  break;
			  default:
				  number = 4;
				  break;
		    }
			//对传入的数据做遍历
			//找"{"大括号。从第一个左大括号开始往下进行Tab缩进
			for(int i=0;i<code.length();i++){
				key = code.charAt(i);        //获取字符
				if(key=='{'){
					if(code.charAt(i-1)!=' '){
						sb.append(" ");
					}
					    sb.append(key);      //先“{”后换行
						sb.append("\n");     //对"{"后面加入一个换行符
						sb.append(indent(number));   //在下一行加入tab键缩进
					number++;         //没出现一次大括号,空格加一
					sb.append(indent(number));
					continue;         //进入下一次循环
				}
				if(key=='}'){ //对“}”
					sb.append(key);
					sb.append("\n");
					number--;
					sb.append(indent(number));
					if((i + 1) < code.length() && (code.charAt(i + 1) != ';')){
						sb.append("\n");
					}
					continue;
				}
				if(key == ';'){ //对";"进行判断
					sb.append(key);
					if(!(code.substring(i-50,i+1).indexOf("for(")>0)){ //小于则说明不是for中的";"
						sb.append("\n");
						sb.append(indent(number));
					}
					continue;
				}
				sb.append(key);       //追加字符
			}
			System.out.println(sb.toString());
			return sb.toString();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	 /**
     * 返回指定次数的缩进字符串。每一次缩进三个空格，即SPACE。
     * 
     * @param number 缩进次数。
     * @return 指定缩进次数的字符串。
     */
    private static String indent(int number)
    {
    	String SPACE = " "; //缩进常量
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < number; i++) {
            result.append(SPACE);
        }
        return result.toString();
    }
}
