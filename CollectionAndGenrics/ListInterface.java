package CollectionAndGenrics;

import java.util.List;
import java.util.ArrayList;

class ListInterface {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        strList.add("Atmaram");
        strList.add("Bhide");
        strList.add(1, "Tukaram");
        strList.remove(0);
        
        if (strList.contains("Bhide")){
            System.out.println(strList.indexOf("Tukaram"));
        } 

        if (strList.contains("Bhidi Master")){
            System.out.println("Yes"); 
        } else{
            System.out.println("No");
        }

        for(int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i));
        }

        for(String str : strList) {
            System.out.print(str);
        }
    }
}
