class Television{
    int channelNo;

    void setChannel(int newChannelNo){
        channelNo = newChannelNo;
    }

    void dispChannel(){
        System.out.println("現在のチャンネルは " + channelNo + " です");
    }

    public static void main(String args[]){
        Television tv1 = new Television();

        tv1.setChannel(1);
        tv1.dispChannel();
    }
}
