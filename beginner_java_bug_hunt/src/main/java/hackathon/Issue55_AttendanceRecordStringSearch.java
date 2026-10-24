public class Issue55_AttendanceRecordStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A18", "B18", "C18"};
        String target = new String("B18");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
