class Itemdata {
    class ItemDataJ(private val originalValue: Any) {

        val type: String?
            get() {
                if (originalValue is String) {
                    return "cadena"
                } else if (originalValue is Int) {
                    return "entero"
                }
                return if (originalValue is Boolean) {
                    "booleano"
                } else {
                    null
                }
            }
        val info: String?
            get() = if (originalValue is String) {
                "L" + originalValue.length
            } else if (originalValue is Int) {
                val intValue = originalValue
                if (intValue % 10 == 0) {
                    "M10"
                } else if (intValue % 5 == 0) {
                    "M5"
                } else if (intValue % 2 == 0) {
                    "M2"
                } else {
                    null
                }
            } else if (originalValue is Boolean) {
                if (originalValue) "Verdadero" else "Falso"
            } else {
                null
            }
    }

}