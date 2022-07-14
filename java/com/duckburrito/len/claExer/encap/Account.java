package com.duckburrito.len.claExer.encap;

public class Account {

    private String name;

    private double balance;

    private String password;

    Account() {}

    Account(String name, double balance, String password) {
       setName(name);
       setBalance(balance);
       setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("请输入符合要求的密码：");
            this.password = "word66666";
        }
    }
}
