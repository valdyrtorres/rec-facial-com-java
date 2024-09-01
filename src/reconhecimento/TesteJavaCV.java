package reconhecimento;

import org.bytedeco.opencv.opencv_face.FaceRecognizer;
import org.bytedeco.opencv.opencv_face.EigenFaceRecognizer;

public class TesteJavaCV {
    public static void main(String[] args) {
        FaceRecognizer r = EigenFaceRecognizer.create();
    }
}
