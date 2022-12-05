package com.WalletService.app.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalletDto {

    private Integer walletId;

    private String walletUser;

    private String walletPassword;

    private Double amount;

    private Integer toWalletId;
}
