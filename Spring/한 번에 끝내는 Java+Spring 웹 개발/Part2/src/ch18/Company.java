package ch18;

public class Company {

    private static Company instance = new Company();
    private Company() {}

    public static Company getInstance() {
        //static으로 하는 이유 - 메인에서 인스턴스 안만들고 클래스명에 바로 참조해서 메서드를 사용하기 위해서
        if (instance == null)
            instance = new Company();
        return instance;
    }
}
