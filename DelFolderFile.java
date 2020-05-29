import java.io.File;

public class DelFolderFile {
    public static void main(String[] args) {
        String dirname = "E:/dir/dir2/1";
        File d = new File(dirname);
        deleteFolder(d);
    }

    // 删除目录及子目录与文件
    public static void deleteFolder(File folder){
        File[] files = folder.listFiles();
        if (files != null){
            for (File f : files){
                if (f.isDirectory()){
                    deleteFolder(f);
                } else {
                    System.out.println("删除一个文件");
                    f.delete();
                }
            }
        }
        System.out.println("删除一个目录");
        folder.delete();
    }
}
