package com.vinaygaba.browser

import androidx.compose.Composable
import androidx.ui.core.ContextAmbient
import androidx.ui.foundation.Text
import androidx.ui.tooling.preview.Preview

val componentsMap: Map<String, List<@Composable() () -> Unit>> = mapOf<String, List<@Composable() () -> Unit>>(
    "Plus" to listOf<@Composable() () -> Unit>(@Composable { TextPreview1() }),
    "Payments" to listOf<@Composable() () -> Unit>(@Composable { TextPreview1() }, @Composable { TextPreview2() }, @Composable { TextPreview3() }, @Composable { TextPreview4() }),
    "Lux" to listOf<@Composable() () -> Unit>(@Composable { TextPreview3() }, @Composable { TextPreview4() })
)

@Preview
@Composable
fun TextPreview1() {
    ContextAmbient
    Text(text = "Hello")
}

@Preview
@Composable
fun TextPreview2() {
    Text(text = "World!")
}

@Preview
@Composable
fun TextPreview3() {
    Text(text = "How")
}

@Preview
@Composable
fun TextPreview4() {
    Text(text = "Are?")
    ContextAmbient
}