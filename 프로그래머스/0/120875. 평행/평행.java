class Solution {
    public int solution(int[][] dots) {
        // gpt 도움, 이후 공부할 것...
        // 4개의 점으로 가능한 모든 직선 조합의 기울기를 비교
        if (areParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        if (areParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        if (areParallel(dots[0], dots[3], dots[1], dots[2])) return 1;

        return 0; // 평행한 직선이 없는 경우
    }

    private boolean areParallel(int[] p1, int[] p2, int[] p3, int[] p4) {
        // 두 직선의 기울기를 비교
        int dy1 = p2[1] - p1[1];
        int dx1 = p2[0] - p1[0];
        int dy2 = p4[1] - p3[1];
        int dx2 = p4[0] - p3[0];

        return dy1 * dx2 == dy2 * dx1; // 기울기가 같으면 평행
    }
}
