package com.vgalloy.gatlingjavaapi.api.dsl.http.wrapper;

import java.util.Objects;
import java.util.function.Supplier;

import com.vgalloy.gatlingjavaapi.internal.util.expression.Expressions;
import io.gatling.http.protocol.HttpProtocolBuilder;

/**
 * Created by Vincent Galloy on 24/02/2017.
 *
 * @author Vincent Galloy.
 */
public final class HttpProtocolBuilderWrapper implements Supplier<HttpProtocolBuilder> {

    private final HttpProtocolBuilder httpProtocolBuilder;

    public HttpProtocolBuilderWrapper(HttpProtocolBuilder httpProtocolBuilder) {
        this.httpProtocolBuilder = Objects.requireNonNull(httpProtocolBuilder);
    }

    @Override
    public HttpProtocolBuilder get() {
        return httpProtocolBuilder;
    }

    public HttpProtocolBuilderWrapper baseURL(String baseUrl) {
        return new HttpProtocolBuilderWrapper(httpProtocolBuilder.baseURL(baseUrl));
    }

    public HttpProtocolBuilderWrapper acceptHeader(String acceptHeader) {
        return new HttpProtocolBuilderWrapper(httpProtocolBuilder.acceptHeader(Expressions.of(acceptHeader)));
    }

    public HttpProtocolBuilderWrapper doNotTrackHeader(String doNotTrackHeader) {
        return new HttpProtocolBuilderWrapper(httpProtocolBuilder.doNotTrackHeader(Expressions.of(doNotTrackHeader)));
    }

    public HttpProtocolBuilderWrapper acceptLanguageHeader(String acceptLanguageHeader) {
        return new HttpProtocolBuilderWrapper(httpProtocolBuilder.acceptLanguageHeader(Expressions.of(acceptLanguageHeader)));
    }

    public HttpProtocolBuilderWrapper acceptEncodingHeader(String acceptEncodingHeader) {
        return new HttpProtocolBuilderWrapper(httpProtocolBuilder.acceptEncodingHeader(Expressions.of(acceptEncodingHeader)));
    }

    public HttpProtocolBuilderWrapper userAgentHeader(String userAgentHeader) {
        return new HttpProtocolBuilderWrapper(httpProtocolBuilder.userAgentHeader(Expressions.of(userAgentHeader)));
    }
}
