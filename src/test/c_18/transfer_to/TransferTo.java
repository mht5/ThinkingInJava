package test.c_18.transfer_to;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * 使用TransferTo()和TransferFrom()将两个通道直接相连
 * @author mohan
 *
 */
public class TransferTo {
	public static void main(String[] args) throws Exception{
		args=new String[]{"data.dat","dataCopy.dat"};
		if(args.length!=2){
			System.out.println("arguments: sourcefile  destfile");
			System.exit(1);
		}
		FileChannel in=new FileInputStream(args[0]).getChannel(),
				  out=new FileOutputStream(args[1]).getChannel();
		in.transferTo(0, in.size(), out);
//		out.transferFrom(in, 0, in.size());
		System.out.println(BufferedInputFile.read(args[1]));
	}
}
