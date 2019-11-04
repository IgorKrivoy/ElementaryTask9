package task.util;

public class OutPut {

    public void getStartInfo() {
        System.out.println("Введите данные в формате <число> <степень> : ");
    }

    public void getInfoIncorrectData() {
        System.out.println("Введены не корректные данные!!!");
    }

    public void outResultForPow(long result) {
        System.out.println(result);
    }

    public void continuedRequest() {
        System.out.println("Продолжаем? Yes(y) or No(n) : ");
    }
}
