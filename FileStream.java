import java.io.*;

public class FileStream {
    public static void main(String[] args) throws IOException {
        // 1.创建文件对象
        File f = new File("a.txt");

        // 2.构建FileOutputStream对象,不存在将自动创建
        FileOutputStream fop = new FileOutputStream(f);
        // 3.创建写入对象，参数可指定编码，win默认 GBK
        OutputStreamWriter writer = new OutputStreamWriter(fop, "utf-8");

        // 4.开始写入
        writer.append("中文输入");
        writer.append("\r\n");  // 换行
        writer.append("English");

        // 5.关闭写入,把缓冲内容写入文件
        writer.close();
        // 6.关闭输出,释放系统资源
        fop.close();


        // 1.构建FileInputStream对象
        FileInputStream fip = new FileInputStream(f);
        // 2.构建读取对象，指定读取编码
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");

        // 3.构建Buffer对象用于存放读取的数据
        StringBuffer sb = new StringBuffer();
        while(reader.ready()){
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());

        // 4.关闭读取对象
        reader.close();
        // 5.关闭输入流，释放
        fip.close();
    }
}
