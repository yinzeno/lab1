package lab1;

import java.util.List;
public class Graph{//t..
    int wordNum;//������
    List<String> wordList; //���㼯
    int[][] E; //�߼�
    public Graph(List<String> wordList,int[][] E,int wordNum){
        this.wordList = wordList;
        this.E = E;
        this.wordNum = wordNum;
    }   
}
