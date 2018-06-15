package test.c_18.make_directories;

import java.io.File;

/**
 * 目录的检查及创建
 * @author mohan
 *
 */
public class MakeDirectories {
	private static void usage(){
		System.err.println(
			"Usage: MakeDirectories path1 ...\n"+
			"Creates each path\n"+
			"Usage: MakeDirectories -d path1 ... \n"+
			"Deletes each path\n"+
			"Usage: MakeDirectories -r path1 path2 ...\n"+
			"Rename from path1 to path2"
		);
		System.exit(1);
	}
	
	private static void fileData(File f){
		System.out.println(
			"Absolute path: "+f.getAbsolutePath()+
			"\nCan read: "+f.canRead()+
			"\nCan write: "+f.canWrite()+
			"\nCan execute: "+f.canExecute()+
			"\nGet name: "+f.getName()+
			"\nGet parent: "+f.getParent()+
			"\nGet path: "+f.getPath()+
			"\nLength: "+f.length()+
			"\nLast modified: "+f.lastModified()
		);
		if(f.isFile()){
			System.out.println(f+" is a file");
		}
		else if(f.isDirectory()){
			System.out.println(f+" is a directory");
		}
	}
	
	public static void main(String[] args){
//		args=new String[]{"-r","MakeDirectoriesTest1","../MakeDirectoriesTest"};
//		args=new String[]{"-d","../MakeDirectoriesTest"};
		args=new String[]{"MakeDirectoriesTest1"};
		if(args.length<1){
			usage();
		}
		if(args[0].equals("-r")){
			if(args.length!=3){
				usage();
			}
			File old=new File(args[1]), rname=new File(args[2]);
			old.renameTo(rname);
			fileData(old);
			fileData(rname);
			return;
		}
		int count=0;
		boolean del=false;
		if(args[0].equals("-d")){
			count++;
			del=true;
		}
		count--;
		while(++count<args.length){
			File f=new File(args[count]);
			if(f.exists()){
				System.out.println(f+" exists");
				if(del){
					System.out.println("Deleting "+f);
					f.delete();
				}
			}
			else{
				if(!del){
					f.mkdir();
					System.out.println("Created "+f);
					if(f.exists()){
						System.out.println(f+" exists now");
					}
				}
			}
			fileData(f);
		}
	}
}