package com.WalletService.app.service;

import com.WalletService.app.dto.Wallet;
import com.WalletService.app.exception.WalletException;
import com.WalletService.app.request.WalletDto;

import java.util.Map;

public interface WalletService {
    Wallet registerWallet(WalletDto walletDto) throws WalletException;

    Boolean login(Integer walletId, String password) throws WalletException;

    Double addFundsToWallet(Integer walletId, Double amount) throws WalletException;

    Double showWalletBalance(Integer walletId) throws WalletException;

    Double fundTransfer(Integer fromId, Integer toId, Double amount) throws WalletException;

    Wallet unRegisterWallet(Integer walletId, String password) throws WalletException;

    Double withdrawFunds(Integer walletId, Double amount) throws WalletException;

    Map<Integer,Wallet> getAllWallets();
}
