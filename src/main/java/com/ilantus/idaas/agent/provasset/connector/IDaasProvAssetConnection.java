package com.ilantus.idaas.agent.provasset.connector;

import java.util.List;
import java.util.Map;

public interface IDaasProvAssetConnection {
    /**
     * 
     * @return As list all the attributes for account maintained by prov asset.
     */
    public List<IDaasAssetAttribute> getListOfAssetAttributes();
    /**
     * 
     * @param userAssetAttrMap Using this iDaasNext sends to prov asset connector mapping which has been done in iDaasNext.
     * This mapping is between account attribute of prov asset and iDaas user attributes.
     */
    public void setIDaasToAssetAttrMapping(Map<IDaasAssetAttribute, IDaasAcctAttribute> userAssetAttrMap);
    /**
     * 
     * @return suggested mapping between prov asset account attribute and iDaas user attribute.
     */
    public Map<IDaasAssetAttribute, IDaasAcctAttribute> getIDaasToAssetAttrMapping();
    /**
     * 
     * @return count of total number of accounts in the prov asset
     */
    public int totalAccountCount();
    /**
     * 
     * @param startIndex
     * @param numOfRecords
     * @return list of prov asset account from start index and number as mentioned in the parameter.
     */
    public List<IDaasAcct> getAccounts(int startIndex, int numOfRecords);
    /**
     * 
     * @param iDaasAcct
     * @param password
     * @return creates an prov asset account
     */
    public OperationStatus createAccount(IDaasAcct iDaasAcct, String password);
    /**
     * 
     * @param iDaasAcct
     * @return success or error code if update failed
     */
    public OperationStatus updateAccount(IDaasAcct iDaasAcct);
    /**
     * 
     * @param iDaasAcct
     * @return success or error code if update failed
     */
    public OperationStatus suspendAccount(IDaasAcct iDaasAcct);
    /**
     * 
     * @param iDaasAcct
     * @return success or error code if update failed
     */
    public OperationStatus restoreAccount(IDaasAcct iDaasAcct);
    /**
     * 
     * @param iDaasAcct
     * @return success or error code if update failed
     */
    public OperationStatus unlockAcct(IDaasAcct iDaasAcct);
    /**
     * 
     * @param iDaasAcct
     * @return success or error code if update failed
     */
    public OperationStatus deleteAcct(IDaasAcct iDaasAcct);
    /**
     * 
     * @param iDaasAcct
     * @param password
     * @return this method may not be used by iDaasNext.
     */
    public OperationStatus validateAccount(IDaasAcct iDaasAcct, String password);
    /**
     * 
     * @param iDaasAcct
     * @param oldPassword
     * @param newPassword
     * @return success or error code if update failed
     */
    public OperationStatus changePassword(IDaasAcct iDaasAcct, String oldPassword, String newPassword);
    /**
     * 
     * @param iDaasAcct
     * @param newPassword
     * @return success or error code if update failed
     */
    public OperationStatus resetPassword(IDaasAcct iDaasAcct, String newPassword);
}
