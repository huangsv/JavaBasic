import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        String dirname = "E:/dir/dir2/dir2";
        File d = new File(dirname);

        System.out.println(d.mkdir());  // false, 创建一个目录
        System.out.println(d.mkdirs());  // true, 创建目录时创建父目录
    }
}
