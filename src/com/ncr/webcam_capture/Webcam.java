package com.ncr.webcam_capture;

import java.awt.Image;

import boofcv.io.webcamcapture.UtilWebcamCapture;

public class Webcam {

	public void webcam_Capture() {
		try {
			Thread capture = new Thread() {

				public void run() {
					Image webcamImage = null;
					com.github.sarxos.webcam.Webcam webcam = UtilWebcamCapture
							.openDefault(640, 480);
					webcam.open();
					for (int i = 0; i < 20; i++) {
						webcamImage = webcam.getImage();
					}

					if (webcam.close()) {
						System.out.println("WebCam closed!s");
					}
				}
			};
			capture.start();

		} catch (Exception e) {

		}

	}

	public static void main(String args[]) {
		Webcam w = new Webcam();
		w.webcam_Capture();

	}
}