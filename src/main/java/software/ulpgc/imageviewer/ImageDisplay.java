package software.ulpgc.imageviewer;

public interface ImageDisplay {
    /**
     * Paints an image identified by the given ID with an optional offset.
     *
     * @param id     The unique identifier of the image to display.
     * @param offset The offset position for rendering the image.
     */
    void paint(String id, int offset);

    /**
     * Clears all images from the display.
     */
    void clear();
}
