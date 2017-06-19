package com.linsy.prt.config;

import com.linsy.prt.filter.MyFilter;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-20 14:15
 */
public class RestJaxRsApplication extends ResourceConfig {

    /**
     * Register JAX-RS application components.
     */
    public RestJaxRsApplication() {

        // register application resources
       // this.register(MaterialRsource.class);
        //this.register(ERPSaleDataRsource.class);
        packages("com.linsy.prt.resource");
        // register filters
        register(RequestContextFilter.class);

        // register features
       //register(JacksonFeature.class);

        register(LoggingFilter.class);
        //json支持
        register(JacksonJsonProvider.class);
        //xml支持
//        register(MoxyXmlFeature.class);
        //文件上传支持
        register(MultiPartFeature.class);
        //注册拦截器
        //register(GzipInterceptor.class);
        //注册过滤器
        register(MyFilter.class);
       // register(ResponseFilter.class);

    }
}
