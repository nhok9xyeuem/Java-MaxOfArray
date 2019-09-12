
public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int [] money= new int[20];
        for (int i=0;i<money.length;i++){
            money[i]= (int) Math.floor(Math.random()*100+1);
            System.out.println(money[i]);
        }

        int max=money[0];
        for (int value : money) {
            if (max < value) {
                max = value;
            }

        }
        System.out.println(max);
    }
}
