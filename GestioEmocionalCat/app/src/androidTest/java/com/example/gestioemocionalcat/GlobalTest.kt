package com.example.gestioemocionalcat

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.Suite


@RunWith(Suite::class)
@Suite.SuiteClasses(BasicTest::class,
    RecursosTest::class, AvaluacioTest1::class,
    AvaluacioTest2::class, AvaluacioTest4::class)

class GlobalTest {}