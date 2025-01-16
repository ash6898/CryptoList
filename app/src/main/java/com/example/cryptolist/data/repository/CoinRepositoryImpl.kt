package com.example.cryptolist.data.repository

import com.example.cryptolist.data.remote.CoinPaprikaApi
import com.example.cryptolist.data.remote.dto.CoinDetailDto
import com.example.cryptolist.data.remote.dto.CoinDto
import com.example.cryptolist.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId = coinId)
    }
}