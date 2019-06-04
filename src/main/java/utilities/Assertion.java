package utilities;

public class Assertion {
	public Assertion() {
    }

    public static void assertEquals(String errorMassage, Object obj1, Object obj2) {
        if (!obj1.equals(obj2)) {
        	throw new RuntimeException(errorMassage);
        }
    }

//    public static void assertEquals(Object obj1, Object obj2) {
//        if (!obj1.equals(obj2)) {
//            (new ExceptionManager()).throwRunTimeException(obj1.toString() + " is not equal to " + obj2.toString() + " (Expected: to be equal) ");
//        }
//
//    }
//
//    public static void assertNotEqual(String errorMassage, Object obj1, Object obj2) {
//        if (obj1.equals(obj2)) {
//            (new ExceptionManager()).throwRunTimeException(errorMassage);
//        }
//
//    }
//
//    public static void assertNotEqual(Object obj1, Object obj2) {
//        if (obj1.equals(obj2)) {
//            (new ExceptionManager()).throwRunTimeException(obj1.toString() + " is equal to " + obj2.toString() + " (Expected: to be not equal)");
//        }
//
//    }
//
//    public static void assertContains(String errorMassage, String s, String subString) {
//        if (!s.contains(subString)) {
//            (new ExceptionManager()).throwRunTimeException(errorMassage);
//        }
//
//    }
//
//    public static void assertContains(String s, String subString) {
//        if (!s.contains(subString)) {
//            (new ExceptionManager()).throwRunTimeException(String.format("String (%s) does not contain sub string ->%s", s, subString));
//        }
//
//    }
//
//    public static void assertTrue(String errorMassage, boolean trueCondition) {
//        if (!trueCondition) {
//            (new ExceptionManager()).throwRunTimeException(errorMassage);
//        }
//
//    }
//
//    public static void assertTrue(boolean trueCondition) {
//        if (!trueCondition) {
//            (new ExceptionManager()).throwRunTimeException("Expected condition to be true. found false");
//        }
//
//    }
//
//    public static void assertFalse(boolean falseCondition) {
//        if (falseCondition) {
//            (new ExceptionManager()).throwRunTimeException("Expected condition to be false. found true");
//        }
//
//    }
//
//    public static void assertFalse(String errorMassage, boolean falseCondition) {
//        if (falseCondition) {
//            (new ExceptionManager()).throwRunTimeException(errorMassage);
//        }
//
//    }
//
//    public static void assertNull(String errorMassage, Object nullValue) {
//        if (nullValue != null) {
//            (new ExceptionManager()).throwRunTimeException(errorMassage);
//        }
//
//    }
//
//    public static void assertNotNull(String errorMassage, Object notNullValue) {
//        if (notNullValue == null) {
//            (new ExceptionManager()).throwRunTimeException(errorMassage);
//        }
//
//    }
//
//    public static void assertNotNull(Object notNullValue) {
//        if (notNullValue == null) {
//            (new ExceptionManager()).throwRunTimeException("Expected value is null!");
//        }
//
//    }
//
//    public static void assertNotEmpty(Object emptyString) {
//        if (emptyString.equals("")) {
//            (new ExceptionManager()).throwRunTimeException("Expected value is empty!");
//        }
//
//    }
}
