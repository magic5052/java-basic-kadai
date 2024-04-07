package kadai_015;

public class Car_Chapter15 {

    private int gear = 1;
    private int speed = 10;

    public Car_Chapter15() {
    }

    public void gearChange(int afterGear) {

        this.gear = afterGear;

        switch (this.gear) {
            case 1:
                this.speed = 10;
                break;

            case 2:
                this.speed = 20;
                break;

            case 3:
                this.speed = 30;
                break;

            case 4:
                this.speed = 40;
                break;

            case 5:
                this.speed = 50;
                break;

            default:
                this.speed = 10;
                break;
        }
    }

    public void run() {
        System.out.println("ギア1" + "から" + this.gear + "に切り替えました");
        System.out.println("速度は時速" + this.speed + "です");
    }

}
