package day15.interfaceEx.homework.인터페이스.문제2;

public interface IWorkingTogether {
  int workTogether(IWorkingTogether partner);

  default String partnerName(IWorkingTogether partner){
    return ((Factory)partner).getFactoryName();
  }

  //default는 같은 패키지 내에서만 접근이 가능하다.
  //만약 다른 패키지에서 구현할 땐 사용할 수 없어 보인다.
  //따라서 메인에서 출력해야 할 듯하다.
}
