import java.util.*;
public class mobilePhonePQ {
    public static Scanner scn = new Scanner(System.in);
    public static class mobilePhone {
        String Company = "";
        String Model = "";
        int Ram = 0;
        int Storage = 0;
        int BatteryBackup = 0;
        mobilePhone(String Company, String Model, int Ram, int Storage, int BatteryBackup) {
            this.Company = Company;
            this.Model = Model;
            this.Ram = Ram;
            this.Storage = Storage;
            this.BatteryBackup = BatteryBackup;
        }
        mobilePhone() {
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Company: " + this.Company + "\n");
            sb.append("Model: " + this.Model + "\n");
            sb.append("Ram: " + this.Ram + "GB\n");
            sb.append("Storage: " + this.Storage + "GB\n");
            sb.append("BatteryBackup: " + this.BatteryBackup + "mAH\n");
            return sb.toString();
        }
    }
    public static void mobilePhoneDetails() {
        int n = scn.nextInt();
        PriorityQueue<mobilePhone> pq = new PriorityQueue<>((a, b) -> {
            if (a.Ram != b.Ram)
                return b.Ram - a.Ram;
            else if (a.Storage != b.Storage)
                return b.Storage - a.Storage;
            else
                return b.BatteryBackup - a.BatteryBackup;
        });
        for (int i = 0; i < n; i++) {
            pq.add(new mobilePhone(scn.next(), scn.next(), scn.nextInt(), scn.nextInt(), scn.nextInt()));
        }
        while (pq.size() != 0)
            System.out.println(pq.remove());
    }
    public static void main(String[] args) {
        mobilePhoneDetails();
    }
}
