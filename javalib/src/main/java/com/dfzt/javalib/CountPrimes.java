package com.dfzt.javalib;

public class CountPrimes {


    public static void main(String[] args) {

    }


    public int countPrimes(int n) {

        int nums = 0;

        if(n>2){
            nums++;
        }

        for (int i = 3; i < n; i++) {
            if (isPrime(i)) {
                nums++;
            }
        }
        return nums;
    }

    private boolean isPrime(int target) {

        int max = (int) Math.sqrt(target);

        for (int i = 2; i <= max; i++) {

            if (target % i == 0) {
                return false;
            }

        }
        return true;
    }


    public int countPrimes2(int n) {

        int count = 0;
        boolean[] arr = new boolean[n];  //初始为false

        for(int i=2;i*i<n;i++){ //大于根号n的数字会在之前作为较小数字的倍数，用它只能遍历小倍数，重复了
            if(arr[i]==false){
                for(int j=i*i;j<n;j+=i){ //小于i*i的数字在之前会以（比i小的数字*i倍）形式出现
                    arr[j] = true;
                }
            }
        }

        for(int k=2;k<n;k++){  //遍历数组中false的数量，从比2大的开始，小于2的质数个数为0
            if(!arr[k]){
                count++;
            }
        }
        return count;
    }



    public int countPrimes3(int n) {
        int count = 0;
        if(n>2){
            count++;
        }
        for(int i=3;i<n;i++){
            if(i%2!=0){
                for(int j=3;j*j<=i;j++){ //只用检查开方之前的，开方后的是一一对应的，例如10，2*5=5*2
                    if(i%j==0){
                        count--;
                        break;
                    }
                }
                count++;
            }
        }
        return count;
    }
}
