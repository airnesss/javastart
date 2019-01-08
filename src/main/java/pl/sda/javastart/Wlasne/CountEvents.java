package pl.sda.javastart.Wlasne;

public class CountEvents {
    //zwroc liczbe cyfr parzystych z tablicy
    public static void main(String[] args) {

        int[] ints = new int[]{1,2,3,4,5,6};

        System.out.println(countEvens(ints));

    }
    private static int countEvens(int[]nums){
        int even = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]%2==0){
                even++;
            }

        }
        return even;
    }
}
