package cn.edu.cqust.text5;

public class Computer {
    private USB[] usbArr=new USB[4];
    //向计算机上连接一个USB设备
    public void add(USB usb){
        //遍历所有的插槽
        for(int i=0;i<usbArr.length;i++){
            //如果发现一个空的
            if(usbArr[i]==null){
                usbArr[i]=usb;
                break;
            }
        }
    }
    //计算的开机功能
    public void powerOn(){
        //遍历所有的插槽
        for(int i=0;i<usbArr.length;i++){
            //如果发现有设备
            if(usbArr[i]!=null){
                //将USB设备启动
                usbArr[i].turnOn();
            }
        }
        System.out.println("计算机开机成功！！！");
    }
    //计算的关机功能
    public void powerOff(){
        //遍历所有的插槽
        for(int i=0;i<usbArr.length;i++){
            //如果发现有设备
            if(usbArr[i]!=null){
                //将USB设备关闭
                usbArr[i].turnOn();
            }
        }
        System.out.println("计算机关机成功！！！");
    }
}


