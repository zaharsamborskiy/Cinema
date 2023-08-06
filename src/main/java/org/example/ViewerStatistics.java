package org.example;

import java.util.List;

public class ViewerStatistics {
    public static double averageAge(List<Viewer> viewerList){
        double avg = 0;
        for (Viewer v : viewerList) {
            avg += v.getAge();
        }
        return avg / viewerList.size();
    }
}
