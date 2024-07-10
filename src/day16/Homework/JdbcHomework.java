package day16.Homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//1.Member 클래스 생성
//2.JDBCEx class의 메소드에서 중복 기능을 뽑아 abstract MemberDB 클래스 생성
//3.JDBCEx 클래스가 MemberDB의 기능을 사용할 수 있도록 구성 및 구현하기

public class JdbcHomework {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Member member = new Member();

    System.out.print("아이디 입력 : ");
    member.setUserName(sc.nextLine());
    System.out.print("비밀번호 입력 : ");
    member.setPassword(sc.nextLine());

    boolean bool = true;
    while(bool) {
      System.out.println("== 1. 회원 정보 입력 후 조회===");
      System.out.println("== 2. 회원 정보 수정 후 조회===");
      System.out.println("== 3. 회원 정보 삭제 후 조회===");
      System.out.println("== 4. 프로그램 종료===");
      System.out.print("선택하세요 : ");
      int select = sc.nextInt();

      switch (select) {
        case 1:
          memberInsert(member);
          break;
        case 2:
          memberUpdate(member);
          break;
        case 3:
          memberDelete(member);
          break;
        case 4:
          bool = false;
          break;
      }
    }
  }

  private static void memberDelete(Member member) {
    String query = "DELETE FROM member where id = ? ";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      con = DriverManager.getConnection(member.getUrl(), member.getUserName(), member.getPassword());

      pstmt = con.prepareStatement(query);

      System.out.print("삭제할 id 입력 : ");
      int deleteId = sc.nextInt();
      sc.nextLine();

      pstmt.setInt(1, deleteId);

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 완전 잘 수정 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 수정이 실패하였습니다.");
      }

      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    member.memberSearch(member);
  }

  private static void memberUpdate(Member member) {
    String query = "UPDATE member SET job = ? where id = ? ";//id쪽 행의 job을 바꾼다.

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      con = DriverManager.getConnection(member.getUrl(), member.getUserName(), member.getPassword());

      pstmt = con.prepareStatement(query);

      System.out.print("바꿀 job의 정보 입력 : ");
      String changeJob = sc.nextLine();

      System.out.print("id 입력 : ");
      int changeId = sc.nextInt();

      pstmt.setString(1, changeJob);
      pstmt.setInt(2, changeId);

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 완전 잘 수정 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 수정이 실패하였습니다.");
      }

      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    member.memberSearch(member);
  }

  private static void memberInsert(Member member) {
    String query = "INSERT INTO member VALUES(?,?,?)";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      con = DriverManager.getConnection(member.getUrl(), member.getUserName(), member.getPassword());

      pstmt = con.prepareStatement(query);

      System.out.print("id 입력 : ");
      int setId = sc.nextInt();
      sc.nextLine();

      System.out.print("이름 입력 : ");
      String setName = sc.nextLine();

      System.out.print("직업 입력 : ");
      String setJob = sc.nextLine();

      pstmt.setInt(1, setId);
      pstmt.setString(2, setName);
      pstmt.setString(3, setJob);

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 입력되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 입력이 실패하였습니다.");
      }

      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    member.memberSearch(member);
  }
}
