package com.ilantus.idaas.agent.provasset.connector;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * Provider has to implement abstract method to get a connection to Priv asset.
 * It's recommended for provider to have a connection pool implementation.
 * Provider should ignore additional parameters not required for connecting to Prov asset but present.
 *
 */
public abstract class IDaasProvAssetDataSource {

    private final HashMap<String, String> connAttrs = new HashMap<>();
    /**
     * Default Constructor
     */
    public IDaasProvAssetDataSource(){}
    
    /**
     * Constructor which takes list of connection attributes
     * @param connAttrs
     */
    public IDaasProvAssetDataSource(Map<String, String> connAttrs){
        this.connAttrs.putAll(connAttrs);
    }
    
    /**
     * 
     * @return As a map a copy of all the connection parameters used to creating a connection to SOT.
     */
    public Map<String, String> getIDaasProvAssetDataSourceParams(){
        //Don't worry about shallow copy. These are just strings.
        return new HashMap<>(this.connAttrs);
    }
    
    /**
     * 
     * @param key
     * @param value
     * 
     * This method can be used to set additional parameters required for connecting to SOT.
     */
    public void setParam(String key, String value){
        //Replaces if the key exists
        this.connAttrs.put(key, value);
    }
    
    /**
     * 
     * @return An instance of IDaasProvAssetConnection on which business methods for SOT can be called.
     */
    public abstract IDaasProvAssetConnection getConnection();
}
