public class Issue48_AttendanceRecordMaximum {
    public static void main(String[] args) {
        int[] values = new int[] {-6, -9, -2, -5};
        int largest = 0;
        for (int i = 1; i < values.length - 1; i++) {
            if (values[i] < largest) largest = values[i];
        }
        System.out.println("Largest=" + largest);
    }
}
