package day17.database.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter //컴파일 시 필드들에 대한 Getter 메소드들을 생성
//@Setter //컴파일 시 필드들에 대한 Setter 메소드들을 생성
//@ToString //컴파일 시 필드들에 대한 ToString 메소드들을 생성
//@EqualsAndHashCode
//@RequiredArgsConstructor //디폴트 생성자 생성
@Data //위의 어노테이션들을 모두 포함하고 있다.
public class User {
  private String userid;
  private String username;
  private String useremail;
  private int userage;

  //public User(){}

//  public User(String userid, String username, String useremail, int userage){
//    this.userid = userid;
//    this.username = username;
//    this.useremail = useremail;
//    this.userage = userage;
//  }

//  public String getUserid() {
//    return userid;
//  }
//
//  public void setUserid(String userid) {
//    this.userid = userid;
//  }
//
//  public String getUsername() {
//    return username;
//  }
//
//  public void setUsername(String username) {
//    this.username = username;
//  }
//
//  public String getUseremail() {
//    return useremail;
//  }
//
//  public void setUseremail(String useremail) {
//    this.useremail = useremail;
//  }
//
//  public int getUserage() {
//    return userage;
//  }
//
//  public void setUserage(int userage) {
//    this.userage = userage;
//  }
}
