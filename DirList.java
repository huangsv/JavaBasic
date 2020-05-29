import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "E:/new";

        File f1 = new File(dirname);

        if (f1.isDirectory()){
            System.out.println("判断目录  " + dirname);

            String s[] = f1.list();
            for (int i = 0; i < s.length; i++){
                File f = new File(dirname + "/" + s[i]);  // 补全路径
                if (f.isDirectory()){
                    System.out.println(s[i]+"  is Dir");
                } else {
                    System.out.println(s[i]+"  is File");
                }
            }
        } else {
            System.out.println(dirname + "  not is Dir");
        }
    }
}
