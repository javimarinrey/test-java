package ftp;

import com.jcraft.jsch.*;

public class MainFTP {

    static String host = "213.27.194.44";
    static int port = 22;
    static String username = "hotusa_restel";
    static String password = "beZNL89XNQ5qP";

    public static void main(String[] args) {
        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession(username, host, port);
            UserInfo ui = new UserInfo() {
                @Override
                public String getPassphrase() {
                    System.out.println("getPassphrase");
                    return null;
                }

                @Override
                public String getPassword() {
                    System.out.println("getPassword");
                    return password;
                }

                @Override
                public boolean promptPassword(String s) {
                    System.out.println("promptPassword");
                    return true;
                }

                @Override
                public boolean promptPassphrase(String s) {
                    System.out.println("promptPassphrase");
                    return false;
                }

                @Override
                public boolean promptYesNo(String s) {
                    System.out.println("promptYesNo");
                    System.out.println(s);
                    return true;
                }

                @Override
                public void showMessage(String s) {
                    System.out.println("showMessage");

                }
            };

            session.setUserInfo(ui);
            session.connect();
            Channel channel = session.openChannel("sftp");
            channel.connect();
            ChannelSftp channelSftp = (ChannelSftp) channel;

            System.out.println("session = " + channelSftp.getSession());
            System.out.println("HOME = " + channelSftp.getHome());
            System.out.println("Server session = " + channelSftp.getServerVersion());

        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
