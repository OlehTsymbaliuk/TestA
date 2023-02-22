import org.json.simple.JSONArray
import org.json.simple.parser.JSONParser
import org.json.simple.parser.ParseException
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException

object WorkFile {
    fun fileToDict(nameFileConf: String): JSONArray {
        val dirConf = "src/test/resources"
        val jsonParser = JSONParser()
        var out = JSONArray()
        try {
            FileReader("$dirConf/$nameFileConf").use { JsonRead ->
                val obj = jsonParser.parse(JsonRead)
                out = obj as JSONArray
            }
        } catch (e: FileNotFoundException) {
            println("File not found")
        } catch (e: IOException) {
            println("Error in reading")
        } catch (e: ParseException) {
            println(e)
        }
        return out
    }
}