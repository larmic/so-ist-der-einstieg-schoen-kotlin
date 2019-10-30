package de.larmic.intro.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextJoinerTest {

    private val textJoiner = TextJoiner()

    @Test
    internal fun `print hello world`() {
        assertThat(textJoiner.joinText(Text("Hello", "World!"))).isEqualTo("Hello World!")
    }

}