package de.larmic.intro.kotlin

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextJoinerTest {

    private val textJoiner = TextJoiner()

    @Test
    internal fun `print hello world`() {
        assertThat(textJoiner.joinText(Text("Hello", "World!"))).isEqualTo("Hello World!")
    }

    @Test
    internal fun `print hello world using mocking`() {
        val textMock = mock<Text> {
            on { texts }.doReturn(arrayOf("Foo", "Bar"))
        }

        assertThat(textJoiner.joinText(textMock)).isEqualTo("Foo Bar")
    }
}