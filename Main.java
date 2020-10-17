import java.util.Scanner;

public class Main {
    public static void main1(String[] args) {
        // 实现一个只有加法，乘法和括号的计算器
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String strs = sc.nextLine();
            if (!strs.contains("+") && !strs.contains("*")) {
                System.out.println(strs);
            } else if (strs.contains("+") && !strs.contains("*")) {
                String[] str = strs.split("//+");
                String sum = "0";
                for (int i = 0; i < str.length; i++) {
                    if (str[i].contains("(")) {
                        for (char c : str[i].toCharArray()) {
                        }
                    }
                }
            } else if (strs.contains("*") && !strs.contains("+")) {
                String[] str = strs.split("//*");
            } else if (strs.contains("+") && strs.contains("*")) {

            }
        }
    }

    public static void main(String[] args) {
        // 平行世界，闰年计算方法一致，每月少一天
        // 给定 y1-m1-d1 和 星期 w1，求出对应的 y2-m2-d2 对应星期几

        // 未解决
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int y1 = sc.nextInt();
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            int w1 = sc.nextInt();
            int y2 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();
            int day = 0;
            int w2;
            if (y1 < y2) {
                if ((y1 % 100 != 0 || y1 % 400 == 0) && y1 % 4 == 0) {
                    int sum = 0;
                    for (int i = 1; i < m1; i++) {
                        if (i < 8) {
                            if (i % 2 == 1) {
                                sum += 30;
                            } else if (i % 2 == 0 && i != 2) {
                                sum += 29;
                            } else if (i == 2) {
                                sum += 28;
                            }
                        } else {
                            if (i % 2 == 1) {
                                sum += 29;
                            } else {
                                sum += 30;
                            }
                        }
                    }
                    day += (354 - sum - d1);
                } else {
                    int sum = 0;
                    for (int i = 1; i < m1; i++) {
                        if (i < 8) {
                            if (i % 2 == 1) {
                                sum += 30;
                            } else if (i % 2 == 0 && i != 2) {
                                sum += 29;
                            } else if (i == 2) {
                                sum += 27;
                            }
                        } else {
                            if (i % 2 == 1) {
                                sum += 29;
                            } else {
                                sum += 30;
                            }
                        }
                    }
                    day += (353 - sum - d1 + 1);
                }
                for (int i = y1 + 1; i < y2; i++) {
                    if ((i % 100 != 0 || i % 400 == 0) && i % 4 == 0) {
                        day += 354;
                    } else {
                        day += 353;
                    }
                }
                if ((y2 % 100 != 0 || y2 % 400 == 0) && y2 % 4 == 0) {
                    for (int i = 1; i < m2; i++) {
                        if (i < 8) {
                            if (i % 2 == 1) {
                                day += 30;
                            } else if (i % 2 == 0 && i != 2) {
                                day += 29;
                            } else if (i == 2) {
                                day += 28;
                            }
                        } else {
                            if (i % 2 == 1) {
                                day += 29;
                            } else {
                                day += 30;
                            }
                        }
                    }
                } else {
                    for (int i = 1; i < m2; i++) {
                        if (i < 8) {
                            if (i % 2 == 1) {
                                day += 30;
                            } else if (i % 2 == 0 && i != 2) {
                                day += 29;
                            } else if (i == 2) {
                                day += 27;
                            }
                        } else {
                            if (i % 2 == 1) {
                                day += 29;
                            } else {
                                day += 30;
                            }
                        }
                    }
                }
                day += d2;
            } else {
                if ((y2 % 100 != 0 || y2 % 400 == 0) && y2 % 4 == 0) {
                    for (int i = m1 + 1; i < m2; i++) {
                        if (i < 8) {
                            if (i % 2 == 1) {
                                day += 30;
                            } else if (i % 2 == 0 && i != 2) {
                                day += 29;
                            } else if (i == 2) {
                                day += 28;
                            }
                        } else {
                            if (i % 2 == 1) {
                                day += 29;
                            } else {
                                day += 30;
                            }
                        }
                    }
                } else {
                    for (int i = m1 + 1; i < m2; i++) {
                        if (i < 8) {
                            if (i % 2 == 1) {
                                day += 30;
                            } else if (i % 2 == 0 && i != 2) {
                                day += 29;
                            } else if (i == 2) {
                                day += 27;
                            }
                        } else {
                            if (i % 2 == 1) {
                                day += 29;
                            } else {
                                day += 30;
                            }
                        }
                    }
                    day += (d2 - d1);
                }
            }
            w2 = (day % 7) + w1;
            if (w2 == 8) {
                System.out.println(1);
            } else if (w2 == 9) {
                System.out.println(2);
            } else if (w2 == 10) {
                System.out.println(3);
            } else if (w2 == 11) {
                System.out.println(4);
            } else if (w2 == 12) {
                System.out.println(5);
            } else if (w2 == 13) {
                System.out.println(6);
            } else {
                System.out.println(w2);
            }
        }
    }
}
