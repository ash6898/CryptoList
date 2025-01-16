package com.example.cryptolist.domain.repository

import com.example.cryptolist.data.remote.dto.CoinDetailDto
import com.example.cryptolist.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}