package com.ilantus.idaas.agent.provasset.connector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
/**
 * 
 * This class returns ProvAssetConnector instance.
 * This allows iDaasNext to allow multiple ProvAssetConnector provider to used in same installation.
 * By the same virtue multiple version of ProvAssetConnector provided by same provider can also be used as long they use different logical name to register with InitialContext.
 *
 */
public final class ProvAssetConnectorManager {

    /**
     * 
     * @param logicalName
     * @return instance of ProvAssetConnector which manages connection to SOT
     * @throws NamingException
     */
    public static ProvAssetConnector getProvAssetConnector(String logicalName) throws NamingException{
        Context ctx = new InitialContext();
        return (ProvAssetConnector)ctx.lookup("logicalName");
    }
}
