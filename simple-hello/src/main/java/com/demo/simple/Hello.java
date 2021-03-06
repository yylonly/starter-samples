/*
 * Copyright (c) 2020 The Eclipse Foundation and others.
 * 
 * This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution, and is available at https://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.demo.simple;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 * Simple Hello World endpoint.
 * 
 * @author Ivar Grimstad (ivar.grimstad@eclipse-foundation.org)
 */
@Path("hello")
public class Hello {
    
    @GET
    public Response hello(){
        return Response.ok("Hello, Jakarta EE 9!").build();
    }
}
