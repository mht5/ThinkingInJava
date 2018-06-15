package test.c_18.memory_input_formatted;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * ����ʹ��DataInputStream��ȡ��ʽ�����ݣ�����һ�������ֽڵ�I/O�࣬��˱���ʹ��InputStream�������Reader��
 * ������DataInputStream�����ֽ���ʽ��ȡ�κ�����(����һ���ļ�)����������������ȡ�ַ���
 * @author mohan
 *
 */
public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException{
		try{
//			��Ҫ��BufferedInputFile��ȡ������ת��ΪByteArrayInputStream��Ȼ����ܴ��ݸ�DataInputStream
			DataInputStream in=new DataInputStream(
					new ByteArrayInputStream(
							BufferedInputFile.read(
									"do not go gentle into that good night.txt").getBytes()));
			while(true){
				System.out.print((char)in.readByte());
			}
		}catch(EOFException e){
			System.err.println("End of stream");
		}
	}
}
