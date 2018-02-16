
import org.junit.Assert
import org.junit.Test
import java.nio.charset.Charset
import java.util.*
import javax.xml.bind.DatatypeConverter

class Natas8Test {

    private val encodedSecret = "3d3d516343746d4d6d6c315669563362"

    @Test
    fun decode() {
        val bin = DatatypeConverter.parseHexBinary(encodedSecret)
        val string = String(bin, Charset.defaultCharset()).reversed()
        val code = String(Base64.getDecoder().decode(string), Charset.defaultCharset())
        Assert.assertEquals("oubWYf2kBq", code)
    }
}