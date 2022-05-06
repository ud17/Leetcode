public class Solution {

    public static void main(String[] args) {
        System.out.print(convert("PAYPALISHIRING", 4));
    }

    private static String convert(String s, int numRows) {

        if(numRows == 1) return s;

        StringBuilder[] listArray = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++) {
            listArray[i] = new StringBuilder();
        }

        int length = s.length();
        int direction=0;
        for(int i=0, index=0; i<length; i++) {
            char c = s.charAt(i);

            if(direction == 0) {
                boolean end = index >= (numRows-1);
                if(end) {
                    direction = 1;
                }
                listArray[index].append(c);
                index = end ? index-1 : index+1;
            } else {
                boolean top = index <= 0;
                if(top) {
                    direction = 0;
                }
                listArray[index].append(c);
                index = top ? index+1 : index-1;
            }
        }
        
        StringBuilder result= new StringBuilder();
        for(int i=0; i<numRows; i++) {
            result.append(listArray[i].toString());
        }
        return result.toString();
    }
}