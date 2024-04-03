package testDrivenDevelopment;

public class BorderCreation {

    /* 3 -> ***
            * *
            ***
       4 -> ****
            *  *
            *  *
            ****
       5 -> *****
            *   *
            *   *
            *   *
            *****
     */

    public static String createBorder(int size){

        if (size == 0){
            return "";
        }
        if (size == 1){
            return "*";
        }
        if (size == 2){
            return "**\n" + "**";
        }

        StringBuilder resultBorder = new StringBuilder();

        StringBuilder completeLine = new StringBuilder();
        for (int i = 0; i < size; i++){
            completeLine.append("*");
        }

        StringBuilder middleLine = new StringBuilder();
        for(int i = 0; i < size; i++){
            if(i == 0 || i == size-1){
                middleLine.append("*");
            }
            else{
                middleLine.append(" ");
            }
            if(i == size-1){
                middleLine.append("\n");
            }
        }

        for(int i = 0; i < size; i++){
            if(i == 0){
                resultBorder.append(completeLine);
                resultBorder.append("\n");
            }
            else if(i == size-1){
                resultBorder.append(completeLine);
            }
            else {
                resultBorder.append(middleLine);
            }
        }

        return resultBorder.toString();
    }


}
