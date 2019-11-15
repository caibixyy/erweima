package com.example.demo.config;

public class QrCodeTest {
    public static void main(String[] args) throws Exception {
        // 存放在二维码中的内容
        String text = "您的手机中了恶意木马程序，请关机";
        // 嵌入二维码的图片路径
        String imgPath = "G:/qrCode/4.jpg";
        // 生成的二维码的路径及名称
        String destPath = "G:/qrCode/qrcode/jam.jpg";
        //生成二维码
        QRCodeUtil.encode(text, imgPath, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);

    }
}
