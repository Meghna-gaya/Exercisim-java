class ReverseString {

    String reverse(String inputString) {
        String outputString="";
        int n=inputString.length();
        for(int i=0;i<n;i++)
        {
            outputString=outputString+inputString.substring(n-1-i,n-i);        
        }
        return outputString;
    }
}
