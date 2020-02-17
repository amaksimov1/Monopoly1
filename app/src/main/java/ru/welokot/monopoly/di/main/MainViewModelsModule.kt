package ru.welokot.monopoly.di.main

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.welokot.monopoly.di.ViewModelKey
import ru.welokot.monopoly.ui.activity.MainActivityViewModel
import ru.welokot.monopoly.ui.fragment.gameboard.GameBoardViewModel
import ru.welokot.monopoly.ui.fragment.prepareforgame.PrepareToGameViewModel

@Module
abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindmainActivityViewModel(mainActivityViewModel: MainActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PrepareToGameViewModel::class)
    abstract fun bindPrepareToGameViewModel(prepareToGameViewModel: PrepareToGameViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(GameBoardViewModel::class)
    abstract fun bindGameBoardViewModel(gameBoardViewModel: GameBoardViewModel): ViewModel
}