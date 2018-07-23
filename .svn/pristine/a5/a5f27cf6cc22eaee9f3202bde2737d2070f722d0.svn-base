package com.ncr.webcam_capture;

/* ImageCropper.java */

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageCropper {
	
	
	BufferedImage cropImage(BufferedImage image,int x,int y, int w, int h)
	{
		BufferedImage cropImage = image.getSubimage(x, y, w, h);
		return cropImage;
		
	}

	public static void main(String[] args) {
		ImageCropper ic=new ImageCropper();
		try {
			BufferedImage originalImgage = ImageIO.read(new File("C:/CartlessShopping/testData/pt21.jpg"));
			
			
			BufferedImage SubImgage = ic.cropImage(originalImgage,300, 150, 200, 200);
			System.out.println("Cropped Image Dimension: "+SubImgage.getWidth()+"x"+SubImgage.getHeight());

			File outputfile = new File("C:/CartlessShopping/testData/croppedImage.jpg");
			ImageIO.write(SubImgage, "jpg", outputfile);

			System.out.println("Image cropped successfully: "+outputfile.getPath());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
