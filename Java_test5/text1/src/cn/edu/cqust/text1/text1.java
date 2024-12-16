package cn.edu.cqust.text1;

import java.io.*;

public class text1 {
    public static void main(String[] args) {
        // 输入文件路径和输出文件路径
        String inputFile = "input.txt";  // 输入文件路径
        String outputFile = "output.txt"; // 输出文件路径

        // 使用BufferedReader读取输入文件，使用BufferedWriter写入输出文件
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            int lineNumber = 1;

            // 按行读取文件
            while ((line = reader.readLine()) != null) {
                // 在每一行前面加上行号
                writer.write(lineNumber + ": " + line);
                writer.newLine();  // 写入换行符
                lineNumber++;  // 增加行号
            }

            System.out.println("文件处理完成，行号已添加。");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
