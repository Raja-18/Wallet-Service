package com.WalletService.app.controller;

import com.WalletService.app.dao.WalletDaoImpl;

public class IdGenerator {
    //private static Integer id = 1000;

    public Integer generateId(){
        WalletDaoImpl walletDao = new WalletDaoImpl();
        Integer id = walletDao.lastIdGetter();
        if(id == null) id = 1000;
        return ++id;
    }
}
