package com.ilantus.idaas.agent.provasset.connector;

public final class IDaasAcctAttribute {
    private String attrName;
    private String attrType;
    private String value;
    
    public String getAttrName() {
        return attrName;
    }
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }
    public String getAttrType() {
        return attrType;
    }
    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public boolean equals(IDaasAcctAttribute iDaasAcctAttribute){
        return iDaasAcctAttribute.getAttrName().equals(this.attrName)?true:false;
        
    }
}
