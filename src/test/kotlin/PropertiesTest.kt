import kotlin.test.*

class PropertiesTest {
    @Test
    fun testProperties() {
        val kt = PropertiesKt()
        val ja = PropertiesJa()

        assertEquals(42, kt.immutable)
        assertEquals(42, ja.immutable)

        assertEquals(24, kt.mutable)
        assertEquals(24, ja.mutable)
        kt.mutable = 48
        ja.mutable = 48
        assertEquals(48, kt.mutable)
        assertEquals(48, ja.mutable)

        assertFalse(kt.isEmpty)
        assertFalse(ja.isEmpty)
        kt.isEmpty = true
        ja.isEmpty = true
        assertTrue(kt.isEmpty)
        assertTrue(ja.isEmpty)
    }
}