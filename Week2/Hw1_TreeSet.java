import java.util.*;

public class Hw1_TreeSet{
    public static void main(String[] args) throws Exception{
        
        System.out.println("�q���q1~100����Ƥ��A�üƨ��X10�Ӥ����ƪ����X....");
        var tset = new TreeSet<>();
        Random randomNum = new Random();
        List<Integer> getNum = new ArrayList<>();
        
        while (getNum.size() < 10){
            int num = 1 + randomNum.nextInt(100);
            if (getNum.contains(num)){
                continue;
            }
            else {
                getNum.add(num);
                System.out.printf("��%d�Ӹ��X�G%d%n", getNum.size(), num);
            }
        }
        System.out.printf("���󤺤����ӼƬ��G%d%n", getNum.size());
        
        for (int n:getNum){
            tset.add(n);
        }
        System.out.printf("���󤺤��������e�G%s%n", tset);
        System.out.printf("�Ĥ@�Ӥ������e���G%d%n", tset.first());
        System.out.printf("�̫�@�Ӥ������e�G%d%n", tset.last());
        
        var intervalNum = new TreeSet<>();
        for (int i = 0; i < getNum.size(); i++){
            if (getNum.get(i) >= 30 && getNum.get(i) <= 70){
                intervalNum.add(getNum.get(i));
            }
        }
        System.out.printf("���e����30��70�̡G%s", intervalNum);
    }
}