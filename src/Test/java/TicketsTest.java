public class TicketsTest {
    public static void main(String[] args) {
        Tickets officer = new Tickets();
        Thread zhangfei,likui;
        zhangfei = new Thread(officer);
        zhangfei.setName("张飞");
        likui = new Thread(officer);
        likui.setName("李逵");
        zhangfei.start();
        likui.start();
    }
}
