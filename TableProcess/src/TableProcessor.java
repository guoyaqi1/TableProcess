import java.io.File;
import java.util.List;
import org.ddd.annotation.example.tool.ClassFileLoader;
import org.ddd.annotation.example.tool.Scanner;
import org.ddd.annotation.example.util.Tablelnfo;
import java.sql.*;
public class TableProcessor implements IProcessor{
       public String Process(String url)throws Exception{
    	       List<File>classFiles=Scanner.getClassFiles(url);//Scannerɨ��ָ��·���µ�����class�ļ�
    	       StringBuilder sql=new StringBuilder();//����StringBulider���� ���ڴ洢SQL���
    	       for(File file: classFiles) {
    	    	   Class<?>clazz=ClassFlieLoader.loadClass(file);//ClassFileLoard���ڼ���ָ����class�ļ����ض�Ӧ��������ϢClass����
    	    	   TableInfo table =TableInfo.parse(clazz);//��������Ϣ����ת��Ϊ��Ӧ�ı���Ϣ����
    	    	   if(table!=null)//���ת���ɹ�
    	    		   sql.append(table.toString());// ������Ϣ������ַ�����ӵ�SQL����� 	    	   
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
