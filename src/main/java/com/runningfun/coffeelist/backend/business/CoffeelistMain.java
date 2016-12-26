package com.runningfun.coffeelist.backend.business;

import com.runningfun.coffeelist.backend.rest.RestApplication;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;
import org.wildfly.swarm.keycloak.Secured;

/**
 * Created by Herschbach.Stefan on 28.11.2016.
 */
public class CoffeelistMain {

    public static void main(String[] args) throws Exception {
        System.out.println("### Start main");
        Swarm swarm=new Swarm();
        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        deployment.as(Secured.class)
                .protect( "/api/hello/secured" )
                .withMethod( "GET" )
                .withRole( "testrole" );
        deployment.addPackage(CoffeelistMain.class.getPackage());
        deployment.addPackage(RestApplication.class.getPackage());
//        deployment.addResource(org.apache.deltaspike.core.api.provider.BeanProvider.class); //-> not sufficient
        deployment.staticContent();
        System.out.println("### Start swarm");
        swarm.start();
        swarm.deploy(deployment);
        System.out.println("### Deployment finished");
    }

}
