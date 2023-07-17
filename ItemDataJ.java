public class ItemDataJ {
        private Object originalValue;

        public ItemDataJ(Object originalValue) {
            this.originalValue = originalValue;
        }

        public String getType() {
            if (originalValue instanceof String) {
                return "cadena";
            } else
                if (originalValue instanceof Integer) {
                return "entero";
            }
                if (originalValue instanceof Boolean) {
                return "booleano";
            } else {
                return null;
            }
        }

        public String getInfo() {
            if (originalValue instanceof String) {
                String stringValue = (String) originalValue;
                return "L" + stringValue.length();
            } else if (originalValue instanceof Integer) {
                int intValue = (int) originalValue;
                if (intValue % 10 == 0) {
                    return "M10";
                } else if (intValue % 5 == 0) {
                    return "M5";
                } else if (intValue % 2 == 0) {
                    return "M2";
                } else {
                    return null;
                }
            } else if (originalValue instanceof Boolean) {
                boolean boolValue = (boolean) originalValue;
                return boolValue ? "Verdadero" : "Falso";
            } else {
                return null;
            }
        }
    }

}
