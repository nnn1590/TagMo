package org.lv9.nnn1590.tagmo;

/**
 * Created by MAS on 01/02/2016.
 */
@SuppressWarnings("HardCodedStringLiteral")
public class AmiiTool {
    static {
        System.loadLibrary("amiitool");
    }

    public native int setKeysFixed(byte[] data, int length);
    public native int setKeysUnfixed(byte[] data, int length);
    public native int unpack(byte[] tag, int tagLength, byte[] unpackedTag, int unpackedTagLength);
    public native int pack(byte[] tag, int tagLength, byte[] unpackedTag, int unpackedTagLength);
}
