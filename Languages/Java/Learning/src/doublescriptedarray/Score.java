package doublescriptedarray;

public class Score {


    public static int countOccurrences(int[] scores, int target) {
        int counter = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                counter += 1;
            }
        }
        return counter;
    }

    public static int[] findMaxAndMin(int[] scores) {
        int max = scores[0], min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        int[] max_min = {max, min};

        return max_min;
    }

    public static double averageScore(int[] scores) {
        int[] max_min = findMaxAndMin(scores);
        int max_counter = countOccurrences(scores, max_min[0]);
        int min_counter = countOccurrences(scores, max_min[1]);
        int[] removedArray = new int[scores.length - 2];

        double sum = 0;
        double average = 0;

        if (scores.length >= 6) {
            if (max_counter == 1 && min_counter == 1) {
                for (int i = 0, k = 0; i < scores.length; i++) {
                    if (i == scores.toString().indexOf(max_counter) || i == scores.toString().indexOf(min_counter)) {
                        continue;
                    } else {
                        removedArray[k++] = scores[i];
                    }
                }
            }

            for (int i = 0; i < removedArray.length; i++) {
                sum += removedArray[0];
            }
            average = sum/removedArray.length;

        }
        else {
            for (int i = 0; i < scores.length; i++) {
                sum += scores[0];
            }
             average = sum / scores.length;
        }

        return average;

    }
}
