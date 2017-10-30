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
import java.util.List;

public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {
    public MyMessageConverter() {
        super(new MediaType("application","x-lin", Charset.forName("UTF-8")));
    }

    protected MyMessageConverter(MediaType supportedMediaType) {
        super(supportedMediaType);
    }

    protected MyMessageConverter(MediaType... supportedMediaTypes) {
        super(supportedMediaTypes);
    }

    @Override
    public void setSupportedMediaTypes(List<MediaType> supportedMediaTypes) {
        super.setSupportedMediaTypes(supportedMediaTypes);
    }

    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return super.getSupportedMediaTypes();
    }

    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return super.canRead(clazz, mediaType);
    }

    @Override
    protected boolean canRead(MediaType mediaType) {
        return super.canRead(mediaType);
    }

    @Override
    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        return super.canWrite(clazz, mediaType);
    }

    @Override
    protected boolean canWrite(MediaType mediaType) {
        return super.canWrite(mediaType);
    }

    @Override
    protected MediaType getDefaultContentType(DemoObj demoObj) throws IOException {
        return super.getDefaultContentType(demoObj);
    }

    @Override
    protected Long getContentLength(DemoObj demoObj, MediaType contentType) throws IOException {
        return super.getContentLength(demoObj, contentType);
    }

    @Override
    protected boolean supports(Class<?> aClass) {
        return false;
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
