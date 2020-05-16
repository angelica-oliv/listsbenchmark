package com.angelicao.compare

import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

private val LARGE_LIST = (0..1000)
private val LARGE_SEQUENCE = LARGE_LIST.asSequence()

@RunWith(AndroidJUnit4::class)
class CompareIterableSequenceBenchmarkTest {

    @get:Rule
    val benchmarkRule = BenchmarkRule()

    @Test
    fun benchmarkListOperations() = benchmarkRule.measureRepeated {
        getFirstFromList(LARGE_LIST)
    }

    @Test
    fun benchmarkSequenceOperations() = benchmarkRule.measureRepeated {
        getFirstFromSequence(LARGE_SEQUENCE)
    }
}