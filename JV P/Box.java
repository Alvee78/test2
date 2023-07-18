public class Box {
    private int height,length,width;
    public int sVolume(){
        return height * length * width;
    }
    public int getArea(){
        return height * length;
    }

    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }
    public void setLength(int length){
        this.length=length;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getWidth(){
        return width;
    }
}
