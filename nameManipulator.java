import java.util.*;

public class nameManipulator {
    private ArrayList<String> names;

    public nameManipulator() {
        names = new ArrayList<String>(Arrays.asList(
                "Aang", "sokkA", "aPPa", "katara", "Zuko", "Toph", "Iroh"));
    }

    //Rachel
    public void print() {
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + ", ");
            if (i % 6 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    //Mary
    public String capitalise(int position ) {
        String capitalisedName;
        for (int i = 0; i < names.size(); i++) {
             capitalisedName = names.get(position);
            capitalisedName = Character.toUpperCase(capitalisedName.charAt(0)) + capitalisedName.substring(1).toLowerCase();           
            names.set(position, capitalisedName);
        }
        return names.get(position);
    }


    //Luke
    public ArrayList<String> removeWordsStartingWith(String portion) {
        for (int i = 0; i < names.size(); i++) {
            String x = names.get(i).substring(0, portion.length());
            if (portion.equalsIgnoreCase(x)) {
                names.remove(i);
                i--;
            }
        }
        return names;
    }


    public int vowelCount(int position){
        String vowels = "aeiouAEIOU";
        char ch;
        int counter = 0;
            for(int j = 0; j < names.get(position).length(); j++){
                for(int k = 0; k < vowels.length(); k++){
                    ch = names.get(position).charAt(j);
                    if(ch == vowels.charAt(k)){
                        counter++;
                    }
                }
            }
        return counter;
    }

}
