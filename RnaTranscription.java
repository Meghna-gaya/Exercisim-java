import java.util.*;

class RnaTranscription {

    String transcribe(String dnaStrand) 
    {
        HashMap<String, String> dnaMap = new HashMap<>();
        dnaMap.put("G","C");
        dnaMap.put("C","G");
        dnaMap.put("T","A");
        dnaMap.put("A","U");
        
        String rnaStrand="";
        for(int i=0;i<dnaStrand.length();i++)
        {     
                rnaStrand+=dnaMap.get(dnaStrand.substring(i,i+1));
        }
        return rnaStrand;
    }

}