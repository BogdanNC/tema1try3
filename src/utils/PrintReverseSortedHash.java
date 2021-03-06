package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class PrintReverseSortedHash<T extends  Comparable> {
    /**
     * for coding style
     */
    public PrintReverseSortedHash() {
    }

    /**
     * sorteaza descendent un hashmap, mai intai dupa valoare iar apoi alfabetic.
     * @param hashMap
     * @return
     */
    public List<Map.Entry<String, T>> sortReverseHash(final Map<String, T> hashMap) {

        List<Map.Entry<String, T>> sortlist = new ArrayList<>(hashMap.entrySet());
        sortlist.sort((e1, e2) -> {
            if (e1.getValue().compareTo(e2.getValue()) == 0) {
                return e2.getKey().compareTo(e1.getKey());
            }
            return e2.getValue().compareTo(e1.getValue());
        });
        return sortlist;
        /*
        String toPrint = "";
        for (int i = 0; i < sortlist.size(); i++) {
            if (!(sortlist.get(i).getValue().equals(0))) {
                toPrint = toPrint + sortlist.get(i).getKey() + ", ";
            }
        }
        if (!(toPrint.isEmpty())) {
            toPrint = toPrint.substring(0, toPrint.length() - 2);
        }
        return "Query result: [" + toPrint + "]";*/
    }
}
