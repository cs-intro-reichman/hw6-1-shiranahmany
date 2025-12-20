import java.awt.Color;
public class Editor4 {
    public static void main (String[] args){
        String src = args[0];
        Color[][] srcImg = Runigram.read(src);
        Color[][] grayImg = Runigram.grayScaled(srcImg);
        Runigram.setCanvas(srcImg);
		Runigram.display(srcImg);
		StdDraw.pause(3000); 
		Runigram.display(grayImg);
    }
    

}
