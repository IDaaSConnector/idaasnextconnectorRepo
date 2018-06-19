package com.ilantus.idaas.agent.provasset.connector;

public enum OperationStatus {
    SUCCESS(800),
    ACCT_NOT_FOUND(801),
    ACCT_LOCKED(802),
    ACCT_SUSPENDED(803),
    INCORRECT_PASSWORD(804),
    PASSWORD_DOESNT_QUALIFY(805);
    
    private final int errorCode;
    
    OperationStatus(int errorCode){
        this.errorCode = errorCode;
    }
    
    public int getErrorCode(){
        return this.errorCode;
    }
}
