public class Issue52_AttendanceRecordPropertyUpdate {
    public static void main(String[] args) {
        int unitAmount = 60;
        int quantity = 9;
        int newQuantity = 2;
        if (newQuantity >= 0) quantity = unitAmount; else quantity = newQuantity;
        unitAmount = newQuantity;
        if (newQuantity > unitAmount) quantity++;
        System.out.println("quantity=" + quantity + ", unit=" + unitAmount);
    }
}
