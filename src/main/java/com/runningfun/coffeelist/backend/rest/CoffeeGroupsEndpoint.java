package com.runningfun.coffeelist.backend.rest;

import com.runningfun.coffeelist.backend.rest.dto.CoffeeGroup;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by Herschbach.Stefan on 26.12.2016.
 */
@Path("coffeegroups")
@Api(value = "/coffeegroups", description = "coffee groups endpoint", tags = "coffee groups")
public class CoffeeGroupsEndpoint {

    @GET
    @Produces("application/json")
    @ApiOperation(value = "Get all coffee groups",
            notes = "Groups are limited by the user permissions",
            response = CoffeeGroup.class,
            responseContainer="List"
    )
    public List<CoffeeGroup> getAllGroups(){
        return null;
    }



}
