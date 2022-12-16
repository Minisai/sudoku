package com.minisai.sudoku.viewmodel

import androidx.lifecycle.ViewModel
import com.minisai.sudoku.game.SudokuGame

class PlaySudokuViewModel : ViewModel() {
    val sudokuGame = SudokuGame()

}