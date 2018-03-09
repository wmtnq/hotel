package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016091200493224";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCSMeMmKCugbUbnZOsgIcLFDLRdSGJjf7BUcYzHcwAXrowHYDyuejR7O11A/w/bimj5jI1YFfDVNA5gGTNosKHrsBthMp2p4lVn07iUcsahJSZAADuktrOMJQ0SxGlNhPX7TFo6/Hx1PLCB/As9lDIdnpvmaiLmD1GVpP5dVJrSg+MwTTS530+9whhxWb2H4LdfjvePtYMQBrOHKir0jI2lZybDIprwk+OGjWwKreW2L48SLE1WGf6OFHWqghmFeFJ9uXPoHzMmKyND/uCfuWSsnj1pYdzVZ3ANVz1KPWytwBOSdVIw8uNC6sHPY80HcMph4M1gJ9kkQXQCxoLN8PU1AgMBAAECggEALDaCJ8wGRaJGyzwuD62mJcnN0lhNySGYxjEBDmCtKnxTRPfJ4kp7DLnLXhjFRvP5A1+Kb5VTHGd94Xo9ne+tSIYeAas5G2OjyJ6zN9HuWFXP15M6dnn6muuppH9aCWOosLNKpoQtb5dHGkiLbbgf3+1T4L9AhqsjVUps0vT/TaK4UovAcnb+cdGS+xW6uX5B17vdKueKgWAYNe90Ewi0mcbLIIOarP+dSTnv2jUDXl9PyEVXrP3scjGjuTuZ/uHlfjwzNAE7OjfwZxCQ90+gocg6ZIKS+NWxjKSnha+pTLPFXuEPnfgYPS+7Ky8ovQ6sWezgWzEqwZGO9+sPohpPAQKBgQDCcmMWcqqBuoIkhYhT/vQffMu+Odupijk9TKiPJ23b5nhrwviXaO6OrO2rULPNxmTPYlqGcvMqGyo21T3F2BxLkFlqdMHFWbKBarYmJS2dZZsh47RVxn+mBQFjRvEZd3yJJ040A/GrtNc5ALNLe1V7rhnnMqk3JbrLleaHrsIgpQKBgQDAeUA0hGKEOX9wUmpeb9qfWfu722VTstIkkldSGEhKEuVeEHR5NwTUm1N7PDaSpiJ/8AZE63L3Ko6eYE5cHj+1tUv46krJqonAStTKs/1j9YZ9Q0aeG8Lr18shBaI0kedX9ZVj76Fmz9ihuVJfmcD6lXxD8uMLWwCUkR4WindNUQKBgDP5u37Om8Edh5gXkX9SURLxmsx4Tr0c03wNN6k8UuNK0bmMXkKqq8m7c7QtWEKS23OLyMLTiyggJsKNcXum7rlMFnqcRwdnmI17ZsD/gxflhvgiE5wx+QD5qYtN9ThndgR7Wy4QN9M7/aOhCkwM5aavvQDNy+mPzkSJBxwRnJZ5AoGAY3mHDF1rSSkqSxPdM6edlwP7jZCLYuGlqA8WIDC6k8YGU0Iv4EHmNjd8wtFQ5yQD6plTtCT3yvRstz/Q390mUjQ76o60TlvcS8yhA45YpGPNuUme4rI4YImrywpNVdwec6BSME813JwJOzQ7dXtSeG/vxHJwk3rZ5u7FXSL9G7ECgYAFCGeTMXUTx+0nX3DEGq506xzI1L8goWe3deVQgeLoEcrxhqQuKrbCTxSeNJfkLm2oO1PlXSAW3eB5JzaZWKhAV6J6lcpSLU7ssO+FdNUGO3+dTiyTWGEnsSR21/NfqUk7NBtPBXcu79BIOOirT8Y0DGmh3D+fAr5IK+o6Lw8a/Q==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvwSy2ZAXVXwJrU/ss0rUeTI785BIzezlUqpKRQtDkEna+q7XqU4Q7nTiQ6hk+GygrU5lx+nBRNyCKGECp8Gk/rRtqra5Ejhhp3jVcrYnU8U9294HOrTzPceU9uIKsZ2aodZxAuRe3hYtXj2jqGdx+vrN/qAdnFmHr+zC6fSA8y6oVR+xfpOBAwe2DB0JMNv+lZSaZVdCNSbjj2fB88eNq2LeK8+LuivFvrmAktbx2sz0tciBvdP0m/fuGQTOGWoqd76W/G+0jNKzAkkLPWIRqgh5StIxb5Imx4eL3a8zqLLLE7t1YXH1WCynDwZ8MM+NVVb+YT6hobNQQiweWKdusQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://192.168.10.123:8080/hotel/home/admin/homepage.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

