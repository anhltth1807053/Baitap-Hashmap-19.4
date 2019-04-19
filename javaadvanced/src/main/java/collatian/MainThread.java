package collatian;

import entity.LateInformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MainThread {

    public static void main(String[] args) {
        ArrayList<LateInformation> list = new ArrayList<LateInformation>();
        LateInformation l1 = new LateInformation(
                "10/04/2019",
                "A001",
                "Hung",
                20000);
        LateInformation l2 = new LateInformation(
                "10/04/2019",
                "A002",
                "Nhung",
                10000);
        LateInformation l3 = new LateInformation(
                "11/04/2019",
                "A001",
                "Hung",
                20000);
        LateInformation l4 = new LateInformation(
                "12/04/2019",
                "A001",
                "Hung",
                20000);
        LateInformation l5 = new LateInformation(
                "12/04/2019",
                "A003",
                "Quảng",
                10000);
        LateInformation l6 = new LateInformation(
                "13/04/2019",
                "A003",
                "Quảng",
                10000);
        LateInformation l7 = new LateInformation(
                "14/04/2019",
                "A001",
                "Hùng",
                20000);
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        list.add(l6);
        list.add(l7);

        HashMap<String, StudentPunishment> statistic = new HashMap<String, StudentPunishment>();
        for (LateInformation information : list) {
            double currentMoney = 0;
            if(statistic.containsKey(information.getRollNumber())){
                StudentPunishment studentPunishment = statistic.get(information.getRollNumber());
                currentMoney = studentPunishment.getMoney();
            }
            currentMoney = currentMoney + information.getMoney();
            StudentPunishment studentPunishment = new StudentPunishment(information.getRollNumber(), information.getName(), currentMoney);
            statistic.put(information.getRollNumber(), studentPunishment);
        }

        for (String rollNumber :
                statistic.keySet()) {
            System.out.println(rollNumber);
            StudentPunishment studentPunishment = statistic.get(rollNumber);
            System.out.println(studentPunishment.getName());
            System.out.println(studentPunishment.getMoney());
        }

    }
}
