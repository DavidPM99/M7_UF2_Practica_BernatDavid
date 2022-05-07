package com.example.gestioemocionalcat

import org.junit.runner.RunWith
import org.junit.runners.Suite


@RunWith(Suite::class)
@Suite.SuiteClasses(BasicTest::class,
AvaluacioTest1::class,
AvaluacioTest2::class,
AvaluacioTest4::class,
RecursosTest::class)

class GlobalTest {}