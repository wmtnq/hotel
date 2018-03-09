package hotel.util.updimg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;



public class ImageUtil {

	/**
	 * @Description: ��base64�����ַ���ת��ΪͼƬ
	 * @Author:
	 * @CreateTime:
	 * @param imgStr
	 *            base64�����ַ���
	 * @param path
	 *            ͼƬ·��-���嵽�ļ�
	 * @return
	 */
	public static boolean generateImage(String imgStr, String path) {
		if (imgStr == null)	
			return false;
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			// ����
			byte[] b = decoder.decodeBuffer(imgStr);
			// ��������
			for (int i = 0; i < b.length; ++i) {
				if (b[i] < 0) {
					b[i] += 256;
				}
			}
			OutputStream out = new FileOutputStream(path);
			out.write(b);
			out.flush();
			out.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * @Description: ����ͼƬ��ַת��Ϊbase64�����ַ���
	 * @Author: 
	 * @CreateTime: 
	 * @return
	 */
	public static String getImageStr(String imgFile) {
	    InputStream inputStream = null;
	    byte[] data = null;
	    try {
	        inputStream = new FileInputStream(imgFile);
	        data = new byte[inputStream.available()];
	        inputStream.read(data);
	        inputStream.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    // ����
	    BASE64Encoder encoder = new BASE64Encoder();
	    return encoder.encode(data);
	}
	
	public static void main(String[] args) {
		System.out.println(str.length());
		generateImage(str,"C:\\a.jpg");
	}
}