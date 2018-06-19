package com.ilantus.idaas.agent.provasset.connector;

import java.util.Map;
/**
 * 
 * This class provides datasource which can be used to get connection to any Prov Asset.
 *
 */
public interface ProvAssetConnector {
    /**
     * 
     * @return A map of all the attributes required to be provided to connect to a Prov Asset
     */
    public Map<String, Boolean> getConnectionAttrNames();
    
    /**
     * 
     * @param connAttrs
     * @return An instance of IDaasProvAssetDataSource which can be used to get a connection.
     * @throws IDaasNextProvAssetIOException
     */
    public IDaasProvAssetDataSource getSotDataSource(Map<String, String> connAttrs) throws IDaasNextProvAssetIOException;
}
