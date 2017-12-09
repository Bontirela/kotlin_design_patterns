package com.github.geraldcroes.kotlin.gof.factory.variants.stringextension

import java.lang.Exception

fun String.createFileParser() =
            when (this.substringAfterLast('.')) {
                "xml" -> XmlFileParser()
                "json" -> JsonFileParser()
                else -> throw Exception("I don't know how to deal with $this.")
            }