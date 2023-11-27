import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    //Thuoc tinh cua class
    private int iD;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private ArrayList<Integer> rateList;


    //Constructor


    public News(int rate) {
        this.rateList = new ArrayList<>();
        if(rate >= 1 && rate <= 5)
            this.rateList.add(rate);
    }

    public News() {
    }

    //Getter
    public int getiD() {
        return iD;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return averageRate;
    }


    //Setter
    public void setiD(int iD) {
        this.iD = iD;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }


    //Implement interface INews
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("PublishDate: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("AverageRate: " + averageRate);
    }

    public void calculate(){
        if(rateList.size() >= 0) {
            int sum = 0;
            for (int rate : rateList) {
                sum += rate;
            }
            averageRate = sum/rateList.size();
            System.out.println("Average Rate: " + averageRate);
            //for (int rate : rateList) duyệt qua từng phần tử rate trong rateList.
        }
    }

    //inputRate
    public void inputRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your rate (1-5): ");
        int rate = scanner.nextInt();
        if (rate >=1 && rate <=5) {
            rateList.add(rate);
            calculate();
        }
    }
}
