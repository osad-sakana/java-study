public class Main {
    public static void main(String[] args){
        int[] scores = {80, 90, 70, 85, 95};

        // for文
        for(int i = 0; i < scores.length; i++){
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }

        // 拡張for文
        for(int score : scores){
            System.out.println("Score: " + score);
        }
    }
}
