public class LongestCommonSubstring {

    public static void main(String [] args){

        String firstString = "adsgtestingde";
        String secondString = "fbastestingd";

        System.out.println(printLowestCommonSubstring(firstString, secondString));
    }

    private static String printLowestCommonSubstring(String firstString, String secondString) {

        int fLength = firstString.length();
        int sLength = secondString.length();
        System.out.println("flength " + fLength);
        System.out.println("slength " + sLength);

        int doubleArr[][] = new int[fLength][sLength];
        StringBuilder sbr = new StringBuilder();
        int result = 0;

        for(int i=0; i<fLength; i++){
            for(int j=0; j<sLength; j++){
                if(firstString.charAt(i) == secondString.charAt(j)){
                    if(i==0 || j==0){
                        doubleArr[i][j] = 1;
                    }else {
                        doubleArr[i][j] = doubleArr[i - 1][j - 1] + 1;
                    }
                    if(result < doubleArr[i][j]){
                        result = doubleArr[i][j];
                    }
                } else{
                    doubleArr[i][j] = 0;
                }
            }
        }
        int startIdx = fLength - (result+1);
        int endIdx = result + startIdx;

        if(fLength > sLength){
             startIdx = sLength - (result+1);
             endIdx = startIdx + (result-1);
            return secondString.substring(startIdx + 1, endIdx);
        }

        return firstString.substring(startIdx, endIdx);

    }

}
