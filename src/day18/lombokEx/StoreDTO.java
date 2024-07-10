package day18.lombokEx;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"shopName"}) //클래스에 대한 equals(), hashCode() 2개의 객체가 존재할 때, 서로 같은 객체인지 판단
@Builder
public class StoreDTO {
  @Setter
  private String shopName;
  @ToString.Exclude
  private String shopTypeCode;
  private String shopTele;
  private String shopType;
  private String shopAddr;


}
