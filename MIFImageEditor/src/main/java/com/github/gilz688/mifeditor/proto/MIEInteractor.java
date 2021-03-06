package com.github.gilz688.mifeditor.proto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.scene.image.Image;

import com.github.gilz688.mifeditor.mif.MIFImage;

public interface MIEInteractor {

	public MIFImage openMIFImage(File file)
			throws FileNotFoundException, IOException;

	public void saveMIFImage(MIFImage mifImage, File file)
			throws FileNotFoundException, IOException;

	public Image viewImage(MIFImage mifImage, int width, int height, int scaleFactor);

	public MIFImage convertToMIF(Image image);

	public void saveImage(MIFImage mifImage, String format, File file)
			throws FileNotFoundException, IOException;

	public MIFImage drawPixel(MIFImage mifImage, double rawX, double rawY,
			double red, double green, double blue);

	public int eyedropper(MIFImage mifImage, double rawX, double rawY);
	
}