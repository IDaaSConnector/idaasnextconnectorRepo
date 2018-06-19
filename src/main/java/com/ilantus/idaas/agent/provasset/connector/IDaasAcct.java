package com.ilantus.idaas.agent.provasset.connector;

import java.util.List;

public final class IDaasAcct {
    private List<IDaasAcctAttribute> lstIDaasAcctAttribute;
    
    public void addAttribute(IDaasAcctAttribute iDaasAcctAttribute){
        lstIDaasAcctAttribute.add(iDaasAcctAttribute);
    }
    
    public void removeAttribute(IDaasAcctAttribute iDaasAcctAttribute){
        lstIDaasAcctAttribute.remove(iDaasAcctAttribute);
    }
    
    public List<IDaasAcctAttribute> getAttrbutes(){
        return lstIDaasAcctAttribute;
    }
}
