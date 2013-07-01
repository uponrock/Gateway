/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.rest;

import java.io.Serializable;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.glassfish.jersey.server.mvc.Viewable;

/**
 *
 * @author sobranie
 */
public abstract class BaseResource implements Serializable {

    @Context
    UriInfo uriInfo;

    protected Response forward(String path) {
        return forward(path, null);
    }

    protected Response forward(String path, Object entity) {
        return Response.ok(new Viewable(path, new PageEntity(uriInfo, entity))).build();
    }

    protected Response redirect(String path) {
        return Response.seeOther(uriInfo.getBaseUriBuilder().path(path).build()).build();
    }
}