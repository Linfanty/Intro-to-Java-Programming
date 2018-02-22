package acm;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Test {
	public static void main(String[] args) {
        String url = "http://oeis.org/A000027";
        Save_Html(url);
	}
	//��ץȡ����ҳ���html�ļ��������ڱ���
    public static void Save_Html(String url) {
        try {
            File dest = new File("src" + "�����html������.html");
            //�����ֽ�������
            InputStream is;
            //�ֽ������
            FileOutputStream fos = new FileOutputStream(dest);
    
            URL temp = new URL(url);
            is = temp.openStream();
            
            //Ϊ�ֽ��������ӻ���
            BufferedInputStream bis = new BufferedInputStream(is);
            //Ϊ�ֽ�������ӻ���
            BufferedOutputStream bos = new BufferedOutputStream(fos);
    
            int length;
    
            byte[] bytes = new byte[1024*20];
            while((length = bis.read(bytes, 0, bytes.length)) != -1){
                fos.write(bytes, 0, length);
            }

            bos.close();
            fos.close();
            bis.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
