package com.vgalloy.gatlingjavaapi.api.dsl.core.wrapper;

import java.util.Objects;

import com.vgalloy.gatlingjavaapi.internal.util.expression.Expression;
import com.vgalloy.gatlingjavaapi.internal.util.expression.Expressions;
import io.gatling.http.request.builder.Http;

/**
 * Created by Vincent Galloy on 24/02/2017.
 *
 * @author Vincent Galloy.
 */
public final class HttpWrapper {

    private final Http http;

    public HttpWrapper(Http http) {
        this.http = Objects.requireNonNull(http);
    }

    public HttpRequestBuilderWrapper get(String requestUrl) {
        Objects.requireNonNull(requestUrl);

        Expression<String> requestExpression = Expressions.of(requestUrl);
        return new HttpRequestBuilderWrapper(http.get(requestExpression));
    }

    public HttpRequestBuilderWrapper post(String requestUrl) {
        Objects.requireNonNull(requestUrl);

        Expression<String> requestExpression = Expressions.of(requestUrl);
        return new HttpRequestBuilderWrapper(http.post(requestExpression));
    }
}
