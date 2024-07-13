import java.util.*;

public class UserMainCode {
    public String strongString(int input1, String input2) {
        List<String> distributions = new ArrayList<>();
        distribute(input2, input1, "", distributions);

        String strongest = "";
        for (String dist : distributions) {
            String[] parts = dist.split(",");
            Arrays.sort(parts);
            if (strongest.isEmpty() || parts[0].compareTo(strongest) > 0) {
                strongest = parts[0];
            }
        }
        return strongest;
    }

    private void distribute(String S, int M, String current, List<String> distributions) {
        if (M == 1) {
            distributions.add(current + S);
        } else {
            for (int i = 1; i <= S.length() - M + 1; i++) {
                distribute(S.substring(i), M - 1, current + S.substring(0, i) + ",", distributions);
            }
        }
    }
}
