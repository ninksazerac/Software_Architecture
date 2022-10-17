public class Square extends Rectangle {

    private int side;

    Square(int side) {
        this.setSide(side);
    }

    // @Override
    // public void setWidth(int width) {this.setSide(width);
    // }

    // @Override
    // public void setHeight(int height) {
    //     this.setSide(height);
    // }

    @Override
    public int getWidth(){
        return side;
    }

    @Override
    public int getArea(){
        return side * side;
    }

    public void setSide(int side){
        // super.setWidth(side);
        // super.setHeight(side);
        this.side = side;
    }
}