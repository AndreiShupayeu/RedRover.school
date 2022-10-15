package home_work6;
/*Write a class Block that creates a block (Duh..)
Requirements
The constructor should take an array as an argument, this will contain 3 integers of the form
 [width, length, height] from which the Block should be created.
Define these methods:
`getWidth()` return the width of the `Block`
`getLength()` return the length of the `Block`
`getHeight()` return the height of the `Block`
`getVolume()` return the volume of the `Block`
`getSurfaceArea()` return the surface area of the `Block`
 */
public class Codewars2 {
    public static void main(String[] args) {
        int []a={2,2,2};
        Block b=new Block(a);
        System.out.println(b.getSurfaceArea());
    }
}
class Block{
   private int width;
   private int length;
   private int height;

    public Block(int[]array) {
        this.width = array[0];
        this.length = array[1];
        this.height = array[2];
    }
    int getWidth(){
        return this.width;
    }
    int getLength(){
        return length;
    }
    int getHeight(){
        return height;
    }
    int getVolume(){
        return width*length*height;
    }
    int getSurfaceArea(){
        return 2*(width*length+ length*height+ width*height);
    }
}