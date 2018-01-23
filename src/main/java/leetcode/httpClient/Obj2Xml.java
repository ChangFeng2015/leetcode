package leetcode.httpClient;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;

public class Obj2Xml {

    public static String objectToXml(Object value) {
        String str = null;
        JAXBContext context = null;
        StringWriter writer = null;
        try {
            context = JAXBContext.newInstance(value.getClass());
            Marshaller mar = context.createMarshaller();
            writer = new StringWriter();
            mar.marshal(value, writer);
            str = writer.toString().replace("getProductRequest", "GetProductRequest");
        } catch (JAXBException e) {
            e.printStackTrace();
        }finally {
            if(context != null) {
                context = null;
            }
            if(writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                writer = null;
            }
        }

        return str;
    }

}
