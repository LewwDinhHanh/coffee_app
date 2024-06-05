package tlu.cse.ht63.cfapp.utils;

import android.util.Log;

import tlu.cse.ht63.cfapp.model.User;

public class Voucher {
    public static String generateDiscountCode(User user) {
        String employeeName = user.getEmployeename(); // Không cần chuyển đổi sang chuỗi
        String discountCode = employeeName + "DC";

        // In ra mã giảm giá được tạo ra
        Log.d("Voucher", "Discount code generated: " + discountCode);

        return discountCode;
    }
}

