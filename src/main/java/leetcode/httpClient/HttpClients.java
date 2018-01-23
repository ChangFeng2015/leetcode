//package leetcode.httpClient;
//
//import leetcode.strategy.test;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpPost;
//
//import java.io.FileInputStream;
//
//public class HttpClients {
//    public static void main(String[] args) throws Exception {
//        String txCode = "";
//        String institutionID = "";
//        HttpPost post = new HttpPost("http://localhost:8080/httpclient/xml.jsp");
//
//        // 设置请求的内容直接从文件中读取
//        post.addHeader("Content-Type", "application/xml");
//        post.addHeader("TxCode", txCode);
//        post.addHeader("InstitutionID", institutionID);
//
//
//        post.setRequestBody(new FileInputStream(input));
//        if (input.length() < Integer.MAX_VALUE)
//            post.setRequestContentLength(input.length());
//        else
//            post.setRequestContentLength(EntityEnclosingMethod.CONTENT_LENGTH_CHUNKED);
//
//        // 指定请求内容的类型
//        post.setRequestHeader("Content-type", "text/xml; charset=GBK");
//        HttpClient httpclient = new HttpClient();
//        int result = httpclient.executeMethod(post);
//        System.out.println("Response status code: " + result);
//        System.out.println("Response body: ");
//        System.out.println(post.getResponseBodyAsString());
//        post.releaseConnection();
//    }
//}
