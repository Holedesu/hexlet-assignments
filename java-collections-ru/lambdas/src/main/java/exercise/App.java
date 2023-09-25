package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        String[][] enlargedImage = new String[image.length * 2][image[0].length * 2];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                enlargedImage[i * 2][j * 2] = image[i][j];
                enlargedImage[i * 2][j * 2 + 1] = image[i][j];
                enlargedImage[i * 2 + 1][j * 2] = image[i][j];
                enlargedImage[i * 2 + 1][j * 2 + 1] = image[i][j];
            }
        }
        return enlargedImage;
    }

    public static void main(String[] args) {
        String[][] image = {
                {}
        };

        System.out.println(Arrays.deepToString(App.enlargeArrayImage(image))); // =>
    }
}
// END
