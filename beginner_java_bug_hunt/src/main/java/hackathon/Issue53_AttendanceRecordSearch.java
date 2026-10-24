public class Issue53_AttendanceRecordSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {6, 9, 2, 118};
        int target = 118;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
