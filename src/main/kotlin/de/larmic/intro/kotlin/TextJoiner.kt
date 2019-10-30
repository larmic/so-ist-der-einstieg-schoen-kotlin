package de.larmic.intro.kotlin

class TextJoiner {

    fun joinText(text: Text): String {
        return text.texts.joinToString(separator = " ")
    }

}