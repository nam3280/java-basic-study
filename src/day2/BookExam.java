package day2;

public class BookExam
{
    public static void main(String[] args)
    {
        Book book1 = new Book();
        book1.title = "자바프로그래밍";
        book1.price = 30000;
        book1.company = "한빛미디어";
        book1.author = "김자바";
        book1.totalPage = 1000;
        book1.isbn = "ISBN-111990011";

        book1.bookInfo();

        int price = book1.bookPrice();
        System.out.println("해당 도서의 가격은 " + price + "원");

        book1.setBookPrice(90000);

        price = book1.bookPrice();
        System.out.println("해당 도서의 가격은 " + price + "원");

        Book book2 = new Book();
        book2.title = "자바자바";
        book2.price = 10000;
        book2.company = "한빛미디어";
        book2.author = "자바";
        book2.totalPage = 2050;
        book2.isbn = "ISBN-11009991";
    }
}
