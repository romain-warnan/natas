
import org.junit.Test
import java.nio.charset.Charset
import java.util.*
import javax.xml.bind.DatatypeConverter

class Natas8Test {
    private val encodedSecret = "3d3d516343746d4d6d6c315669563362"
    /*
        $encodedSecret = "3d3d516343746d4d6d6c315669563362";
        function encodeSecret($secret) {
            return bin2hex(strrev(base64_encode($secret)));
        }
     */
    @Test
    fun decode() {
        val bin = DatatypeConverter.parseHexBinary(encodedSecret)
        val string = String(bin, Charset.defaultCharset()).reversed()
        val code = String(Base64.getMimeDecoder().decode(string), Charset.forName("ISO-8859-1"))
        println(code)
    }
}