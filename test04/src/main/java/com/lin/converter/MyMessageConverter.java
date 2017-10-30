package com.lin.converter;

import com.lin.model.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {
    public MyMessageConverter() {
        super(new MediaType("application","x-lin", Charset.forName("UTF-8")));
    }

    @Override
    protected boolean supports(Class<?> aClass) {
        return DemoObj.class.isAssignableFrom(aClass);
    }

    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
            String tem = StreamUtils.copyToString(httpInputMessage.getBody(),Charset.forName("UTF-8"));
            String[] tempStr = tem.split("-");

        return new DemoObj(tempStr[0],new Long(tempStr[1]));
    }

    @Override
    protected void writeInternal(DemoObj demoObj, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "hello:" + demoObj.getName()+ "-"
                + demoObj.getId();
        httpOutputMessage.getBody().write(out.getBytes());
    }
}
