import java.util.*;

public class Hw1_TreeSet{
    public static void main(String[] args) throws Exception{
        
        System.out.println("電腦從1~100的整數中，亂數取出10個不重複的號碼....");
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
                System.out.printf("第%d個號碼：%d%n", getNum.size(), num);
            }
        }
        System.out.printf("物件內元素個數為：%d%n", getNum.size());
        
        for (int n:getNum){
            tset.add(n);
        }
        System.out.printf("物件內元素的內容：%s%n", tset);
        System.out.printf("第一個元素內容為：%d%n", tset.first());
        System.out.printf("最後一個元素內容：%d%n", tset.last());
        
        var intervalNum = new TreeSet<>();
        for (int i = 0; i < getNum.size(); i++){
            if (getNum.get(i) >= 30 && getNum.get(i) <= 70){
                intervalNum.add(getNum.get(i));
            }
        }
        System.out.printf("內容介於30～70者：%s", intervalNum);
    }
}