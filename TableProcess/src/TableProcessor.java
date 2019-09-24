import java.io.File;
import java.util.List;
import org.ddd.annotation.example.tool.ClassFileLoader;
import org.ddd.annotation.example.tool.Scanner;
import org.ddd.annotation.example.util.Tablelnfo;
import java.sql.*;
public class TableProcessor implements IProcessor{
       public String Process(String url)throws Exception{
    	       List<File>classFiles=Scanner.getClassFiles(url);//Scanner扫描指定路径下的所有class文件
    	       StringBuilder sql=new StringBuilder();//创建StringBulider对象 用于存储SQL语句
    	       for(File file: classFiles) {
    	    	   Class<?>clazz=ClassFlieLoader.loadClass(file);//ClassFileLoard用于加载指定的class文件返回对应的类型信息Class对象
    	    	   TableInfo table =TableInfo.parse(clazz);//将类型信息对象转化为对应的表信息对象
    	    	   if(table!=null)//如果转换成功
    	    		   sql.append(table.toString());// 将表信息输出成字符串添加到SQL语句中 	    	   
    	       }
		    return sql.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String process(String url) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

} 
