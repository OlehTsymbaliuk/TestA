import org.json.simple.JSONArray
import org.json.simple.JSONObject

object ConfProperties {
    fun readDataConfig(parameterName: String?): String {
        val recordNumber = 0
        var outFile = JSONArray()
        var param = JSONObject()
        outFile = WorkFile.fileToDict("conf.json")
        try {
            param = outFile[recordNumber] as JSONObject
        } catch (e: Exception) {
            println("There is no such cell or parameter")
        }
        return param[parameterName] as String
    }

    fun readTestData(parameterName: String): String {
        val recordNumber = 0
        var outFile = JSONArray()
        var param = JSONObject()
        outFile = WorkFile.fileToDict("data_test.json")
        try {
            param = outFile[recordNumber] as JSONObject
        } catch (e: Exception) {
            println("There is no such cell or parameter")
        }
        return param[parameterName] as String
    }
}