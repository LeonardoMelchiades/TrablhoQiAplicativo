package br.leonardo.projetoqiapp.presentation


import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import br.leonardo.projetoqiapp.data.Note

data class NoteState (
    val notes: List<Note> = emptyList(),
    val title: MutableState<String> = mutableStateOf(""),
    val description: MutableState<String> = mutableStateOf("")
)