package com.WalletService.app.controller;

import com.WalletService.app.dto.Wallet;
import com.WalletService.app.exception.WalletException;
import com.WalletService.app.request.WalletDto;
import com.WalletService.app.service.WalletService;
import com.WalletService.app.service.WalletServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
public class Controller {

    private WalletService walletService = new WalletServiceImpl();

    @GetMapping("/")
    public String Greet(){
        return "Welcome to Wallet App";
    }

    @PostMapping("login")
    public Boolean login(@RequestBody WalletDto wallet) throws WalletException{
        return this.walletService.login(wallet.getWalletId(), wallet.getWalletPassword());
    }

    @PostMapping("wallet-register")
    public Wallet registerWallet(@RequestBody WalletDto walletDto) throws WalletException{
        return this.walletService.registerWallet(walletDto);
    }


    @GetMapping("wallet-balance/{id}")
    public Double getWalletBalanceById(@PathVariable("id") Integer id) throws WalletException{
        return this.walletService.showWalletBalance(id);
    }

    @PatchMapping("wallet-add-funds")
    public Double addFundsToWallet(@RequestBody WalletDto walletDto) throws WalletException{
        return this.walletService.addFundsToWallet(walletDto.getWalletId(),walletDto.getAmount());
    }

        @PostMapping("wallet-fund-transfer")
    public Double fundTransfer(@RequestBody WalletDto walletDto) throws WalletException{
        return this.walletService.fundTransfer(walletDto.getWalletId(),walletDto.getToWalletId(),walletDto.getAmount());
    }

    @PatchMapping("wallet-withdraw")
    public Double withdrawFunds(@RequestBody WalletDto walletDto) throws WalletException{
        return this.walletService.withdrawFunds(walletDto.getWalletId(),walletDto.getAmount());
    }

}
