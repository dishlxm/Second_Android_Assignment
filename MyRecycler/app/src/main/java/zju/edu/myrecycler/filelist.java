package zju.edu.myrecycler;

public class filelist {
    private String Name;  //文件名称
    private String Zt;    //状态
    private int picID;
    private String hot;
    public filelist(){

    }
    public filelist(String name,String zt, int picID, String hot){
        this.Name=name;
        this.Zt=zt;
        this.picID=picID;
        this.hot=hot;
    }
    public String getName(){
        return Name;
    }
    public String getZt(){
        return Zt;
    }
    public int getPicID(){
        return picID;
    }
    public String getHot(){
        return hot;
    }
}
