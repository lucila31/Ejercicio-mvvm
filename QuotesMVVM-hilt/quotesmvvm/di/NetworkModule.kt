package dev.cardoso.quotesmvvm.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import dev.cardoso.quotesmvvm.data.QuoteRepositoryImpl
import dev.cardoso.quotesmvvm.domain.QuoteRepository

@Module
@InstallIn(SingletonComponent::class)
abstract class QuoteRepositoryModule {
    @Binds
    abstract fun bindQuoteRepository(
        quoteRepositoryImpl: QuoteRepositoryImpl
    ):QuoteRepository
}