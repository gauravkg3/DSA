package Array1;
import java.util.*;
public class Main {
        public static int findMaxTeamSize(int[] skills) {
            // Create a frequency map of skill levels
            Map<Integer, Integer> skillCount = new HashMap<>();
            for (int skill : skills) {
                skillCount.put(skill, skillCount.getOrDefault(skill, 0) + 1);
            }

            // Find the maximum team size
            int maxTeamSize = 0;
            for (int skill : skillCount.keySet()) {
                // Current skill level count
                int currentCount = skillCount.get(skill);
                // Next skill level count, if exists
                int nextCount = skillCount.getOrDefault(skill + 1, 0);
                // Calculate the team size
                maxTeamSize = Math.max(maxTeamSize, currentCount + nextCount);
            }

            return maxTeamSize;
        }

        public static void main(String[] args) {
            int[] skills = {10, 12, 13, 9, 10};
            System.out.println(findMaxTeamSize(skills));

    }
}
