package sortingalgorithm.bubblesort;

public class StudentMarks {
    // Method to sort student marks
    public static void bubbleSort(int []studentsMarks){
        int size = studentsMarks.length;
        boolean swapped;
        for(int i = 0; i < size; i++){
            swapped = false;
            for(int j = 0; j < size-i - 1; j++){
                if(studentsMarks[j] > studentsMarks[j+1]){
                    studentsMarks[j] = studentsMarks[j]+studentsMarks[j+1];
                    studentsMarks[j+1] = studentsMarks[j] - studentsMarks[j+1];
                    studentsMarks[j] = studentsMarks[j] - studentsMarks[j+1];
                    swapped = true;
                }

            }
            if(!swapped) break;
        }

    }
}
