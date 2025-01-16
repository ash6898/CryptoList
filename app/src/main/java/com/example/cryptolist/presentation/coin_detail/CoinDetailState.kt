package com.example.cryptolist.presentation.coin_detail

import com.example.cryptolist.domain.model.Coin
import com.example.cryptolist.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
