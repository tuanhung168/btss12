import java.util.Scanner;

public class ATMExample {
    public static void main(String[] args) {
        int so_du = 1000000000;
        int tien_gui, tien_rut;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("FreeTuts ATM kính chào quý khách!");
            System.out.println("Chọn 1 để rút tiền");
            System.out.println("Chọn 2 để gửi tiền");
            System.out.println("Chọn 3 để kiểm tra số dư");
            System.out.println("Chọn 4 để Kết thúc");
            System.out.print("Hãy chọn thao tác mà bạn muốn thực hiện:");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Nhập số tiền:");

                    //Nhập số tiền từ user
                    tien_rut = sc.nextInt();

                    //Kiểm tra xem số dư có đủ để rút số tiền mà user muốn hay k
                    if(so_du >= tien_rut)
                    {
                        //Sau khi rút, số dư trong tài khoản bị trừ đi số tiền vừa rút
                        so_du = so_du - tien_rut;
                        System.out.println("Hãy nhận tiền từ ATM! Cảm ơn bạn đã sử dụng Freetuts ATM!");
                    }
                    else
                    {
                        //Hiển thị lỗi không đủ tiền để thanh toán
                        System.out.println("Số dư không đủ, vui lòng nạp tiền để có thể thực hiện dịch vụ.");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Nhập số tiền:");

                    //Lấy số tiền gửi từ user
                    tien_gui = sc.nextInt();

                    //Số dư tăng sau khi cập nhật số tiền gửi vào
                    so_du = so_du + tien_gui;
                    System.out.println("Bạn đã gửi tiền thành công! Cảm ơn bạn đã sử dụng Freetuts ATM!");
                    System.out.println("");
                    break;

                case 3:
                    //Hiển thị toàn bộ số dư của user
                    System.out.println("Số dư hiện tại của bạn : "+so_du + "VNĐ");
                    System.out.println("Cảm ơn bạn đã sử dụng Freetuts ATM !");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}