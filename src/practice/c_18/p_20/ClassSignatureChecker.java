package practice.c_18.p_20;

import java.io.File;
import java.io.IOException;

import util.BinaryFile;
import util.Directory;

/**
 * ʹ��Directory��BinaryFile������֤ĳ��Ŀ¼��������.class�ļ�������ʮ�������ַ�"ca fe ba be"��ͷ��
 * "ca fe ba be"����ĸ��ֽ���������ʶclass�ļ��ģ����������class�ļ���ʱ����ȼ�����ĸ��ֽڣ��������"ca fe ba be"��������ܾ����ظ��ļ�
 * @author mohan
 *
 */
public class ClassSignatureChecker {
	final static byte[] signature={(byte)202,(byte)254,(byte)186,(byte)190};
	
	public static void main(String[] args) throws IOException{
		String dir=".";
		if(args.length==1){
			dir=args[0];
		}
		boolean flag=true;
		for(File file : Directory.walk(dir,".*\\.class")){
			System.out.println(file);
			byte[] bt=BinaryFile.read(file);
			for(int i=0;i<signature.length;i++){
				if(bt[i]!=signature[i]){
					flag=false;
					System.out.println(file+" is corrupted!");
					break;
				}
			}
		}
		if(flag){
			System.out.println(signature);
			System.out.println("all good.");
		}
	}
}
