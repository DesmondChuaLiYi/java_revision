package Assignment.Question3;

import javax.swing.*;
import java.awt.*;

public class Question3 extends JFrame {
  public Question3() {
    super("Smilling Face Over a Rainbow");
    setSize(400, 400);
  }

  public void paint(Graphics g){
    super.paint(g);

    // Draw a rainbow
    drawRainbow(g);

    // Draws a smilling face
    drawSmilingFace(g);
  }

  private void drawRainbow(Graphics g){
    int width = getWidth();
    int height = getHeight();

    Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA};
    int numColors = colors.length;
    int bandHeight = height / numColors;
    for (int i = 0; i < numColors; i++){
      g.setColor(colors[i]);
      g.fillRect(0, i * bandHeight, width, bandHeight);
    }
  }

  private void drawSmilingFace(Graphics g) {
    int width = getWidth();
    int height = getHeight();

    int faceSize = Math.min(width, height) / 4; //Face circle
    int faceX =(width - faceSize) / 2;
    int faceY = height / 2- faceSize / 2;
    g.setColor(Color.YELLOW);
    g.fillOval(faceX, faceY, faceSize, faceSize);

    int eyeSize = faceSize / 8; //Eyes
    int leftEyeX = faceX + faceSize / 4 - eyeSize / 2;
    int rightEyeX = faceX + faceSize * 3 / 4 - eyeSize / 2;
    int eyeY = faceY + faceSize / 4;
    g.setColor(Color.BLACK);
    g.fillOval(leftEyeX, eyeY, eyeSize, eyeSize);
    g.fillOval(rightEyeX, eyeY, eyeSize, eyeSize);

    int mouthStartAngle = 180; //Smile
    int mouthArcAngle = 180;
    int mouthX = faceX + faceSize / 4;
    int mouthY = faceY + faceSize / 3;
    int mouthWidth = faceSize /2;
    int mouthHeight = faceSize / 3;
    g.setColor(Color.BLACK);
    g.drawArc(mouthX, mouthY, mouthWidth, mouthHeight, mouthStartAngle, mouthArcAngle);
  }

  public static void main(String[] args){
    Question3 demo = new Question3();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setVisible(true);
  }
}
