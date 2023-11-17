package baseball;

public class BaseBallTeam {
        //フィールド
        private String name;  //球団名
        private int win;      //勝利数
        private int lose;     //敗北数
        private int drow;     //引分数
    //引数を用いるコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int drow) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.drow = drow;
    }
    //勝率を求めるメソッド
    public double getRate() {
       double rate = (double) win / (win + lose);
       return rate;
    }
    //reportを表示するメソッド
    public void report() {
        System.out.println(this.name + "の2022年の成績は" + this.win + "勝" +  this.lose + "敗" + this.drow + "分、" + "勝率は" + getRate() + "です。");
    }
}   