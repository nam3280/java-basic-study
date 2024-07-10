package day2;

public class Book
{
    public String title;
    public int price;
    public String company;
    public String author;
    public int totalPage;
    public String isbn;

    public void bookInfo()
    {
        System.out.println("야옹서점 책 정보입니다.");
        System.out.println(this.title + "\t" + this.author);
    }

    public int bookPrice()
    {
        price = (int)(this.price * 0.1);
        return price;
    }
    //public -> 접근 제한자

    public void setBookPrice(int price)
    {
        this.price = price;
    }
}
