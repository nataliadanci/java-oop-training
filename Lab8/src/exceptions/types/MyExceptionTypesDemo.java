package exceptions.types;

public class MyExceptionTypesDemo {
    public static void main(String[] args){

        String value1 = "test";
        String result1 = getMessageRunTimeException(value1);
        System.out.println("result1 = " + result1);

        String value3 = "Natalia";
        String value4 = "Ana";
        try {
            String result3 = getMessageCompileTimeException(value3);
            System.out.println("result3 = " + result3);
        } catch (MyException1 e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally executed for result3");
        }
        try {
            String result4 = getMessageCompileTimeException(value4);
            System.out.println("result4 = " + result4);
        } catch (MyException1 e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally executed for result4");
        }

        String value2 = "";
        String result2 = getMessageRunTimeException(value2);
        System.out.println("result2 = " + result2);
    }

    public static String getMessageRunTimeException(String value) throws MyException2{
        if(value=="" || value==null){
            throw new MyException2("the string is not valid");
        }
        return value;
    }

    public static String getMessageCompileTimeException(String value) throws MyException1{
        if(value.startsWith("A") || value.startsWith("a")){
            throw new MyException1("the string starts with A or a");
        }
        return value;
    }
}
