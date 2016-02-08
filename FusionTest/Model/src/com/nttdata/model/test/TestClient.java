package com.nttdata.model.test;

import oracle.jbo.*;
import oracle.jbo.client.Configuration;
import oracle.jbo.domain.*;
import oracle.jbo.domain.Number;

public class TestClient {
    public TestClient() {
        super();
    }
    
    public static void main(String[] args) {
        String amDef = "com.nttdata.model.am.CoreHRMainAM";
        String config = "CoreHRAMLocal";
        ApplicationModule am = Configuration.createRootApplicationModule(amDef, config);
        ViewObject vo = am.findViewObject("CountriesVO1");
        vo.executeQuery();;
        Row row = vo.first();
        System.out.println(row.getAttribute(1));
        // Work with your appmodule and view object here
        Configuration.releaseRootApplicationModule(am, true);
    }
}
